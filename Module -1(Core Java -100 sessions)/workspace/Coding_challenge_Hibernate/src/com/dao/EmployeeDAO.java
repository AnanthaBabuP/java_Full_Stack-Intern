package com.dao;

import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class EmployeeDAO {
	/**
	 * Basic Configuration Details
	 * 
	 * @return Configuration
	 */
	private Configuration getConfig() {
		Configuration config = null;
		try {
			config = new Configuration();
			config.configure("hibernate.cfg.xml");
			config.addAnnotatedClass(Employee.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return config;
	}
	
	/**************************************************************
	 * 			A CRUD OPERATON PROCESS
	 **************************************************************/

	/**
	 * Save Record in database without query
	 * 
	 * @param empList
	 */
	public void saveEmployee(Collection<Employee> empList) {
		try {
			// Configuration Process
			Configuration cfg = this.getConfig();

			// Create Session Factory Interface to assign buildSessionFactory method.
			SessionFactory factory = cfg.buildSessionFactory();
			Session session = factory.openSession();

			// Insert Process Create to Transaction interface to Control the process
			Transaction tx = session.beginTransaction();

			// Save Process To List
			for (Employee emp : empList) {
				session.save(emp);
			}

			// Commit and session Close Process
			tx.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Retrieving Data Using Session get Method
	 * 
	 * @param empid
	 * @return
	 */
	public Employee getEmployeeById(long empid) {
		Employee emp = null;
		try {
			// GetConfiguration
			Configuration cfg = this.getConfig();

			// Session Management
			SessionFactory factory = cfg.buildSessionFactory();
			Session session = factory.openSession();

			emp = session.get(Employee.class, empid);

			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp;
	}

	/**
	 * Delete Process Using HQL
	 * 
	 * @param deptno
	 */
	public void deleteEmployeeById(int deptno) {
		try {
			// Get Configuration
			Configuration cfg = this.getConfig();

			// Create Session Factory Interface to assign buildSessionFactory method.
			SessionFactory factory = cfg.buildSessionFactory();
			Session session = factory.openSession();

			// Insert Process Create to Transaction interface to Control the process
			Transaction tx = session.beginTransaction();
			String hql = "delete from Employee e where e.deptno = ?1";

			// Use Query to Delete process
			Query<?> query = session.createQuery(hql);
			query.setParameter(1, deptno);

			// Execution Process
			int count = query.executeUpdate();
			if (count >= 1) {
				System.out.println(count + " Employees deleted from Employee Dept No " + deptno);
			} else {
				System.out.println("Delete Failled");
			}

			// Commit and session Close Process
			tx.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Update Salary Process
	 */
	public void updateSalary(int curSalary, int newSalary) {
		try {
			// Get Configuration
			Configuration cfg = this.getConfig();

			// Create Session Factory Interface to assign buildSessionFactory method.
			SessionFactory factory = cfg.buildSessionFactory();
			Session session = factory.openSession();

			// Insert Process Create to Transaction interface to Control the process
			Transaction tx = session.beginTransaction();
			String hql = "Update Employee e set e.sal = ?1 where e.sal = ?2 ";

			// Use Hibernate Query Language to Update Salary process
			Query<?> query = session.createQuery(hql);
			query.setParameter(1, newSalary);
			query.setParameter(2, curSalary);

			int count = query.executeUpdate();

			if (count >= 1) {
				System.out.println(count + " Employees Updated from Employee ");
			} else {
				System.out.println("Updating Failled");
			}

			// Commit and session Close Process
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	/****************************************************************************
						HQL PROCESS
	*****************************************************************************/
	/**
	 * Retrieving the records based on Employee name Starts with letter‘A’
	 * 
	 * @return ArrayList<Employee>
	 */
	public ArrayList<Employee> getEmployeeByFirstChar() {
		ArrayList<Employee> empList = new ArrayList<>();
		
		try {
			Configuration cfg = this.getConfig();
			Session session = cfg.buildSessionFactory().openSession();
			
			String hql="from Employee e where ename like 'A%'";
			Query query = session.createQuery(hql);
			
			empList = (ArrayList<Employee>) query.getResultList();
			
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return empList;
	}
	
	/**
	 * Employees With Salary Between 5000 And 7000
	 * 
	 * @return ArrayList<Employee>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Employee> getEmployeesWithSalaryBetween5000And7000() {
		ArrayList<Employee> empList = new ArrayList<>();
		
		try {
			String hql="from Employee e where e.sal between 5000 and 7000";
			
			Configuration cfg = this.getConfig();
			Session session = cfg.buildSessionFactory().openSession();
			
			Query<?> query = session.createQuery(hql);
			
			empList = (ArrayList<Employee>) query.getResultList();
			
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return empList;
	}
	
	/**
	 * Retrieving the records in Second Min And Max Salaries
	 * 
	 * @return List<Integer>
	 */
	public List<Integer> getSecondMinAndMaxSalaries() {
		List<Integer> salList = new ArrayList<>();
		
		try {
			String hql="select distinct e.sal From Employee e Order by e.sal asc";
			
			Configuration cfg = this.getConfig();
			Session session = cfg.buildSessionFactory().openSession();
			
			salList = session.createQuery(hql).getResultList();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return salList;
	}
	
	
	
	/**
	 * update Employees With Same Salary To 5000
	 * 
	 */
	public void updateEmployeesWithSameSalaryTo5000() {
		SessionFactory factory = getConfig().buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
		try {
	    	
	        // Step 1: Fetch duplicate salaries
	        String hqlSelect = "select e.sal from Employee e group by e.sal having count(e.sal) > 1";
	        List<Integer> duplicateSalaries = session.createQuery(hqlSelect, Integer.class).list();

	        if (!duplicateSalaries.isEmpty()) {

	            String hqlUpdate = "update Employee e set e.sal = 5000 where e.sal IN ?1";
	            Query<?> updateQuery = session.createQuery(hqlUpdate);
	            updateQuery.setParameter(1, duplicateSalaries);

	            int updated = updateQuery.executeUpdate();
	            tx.commit();

	            System.out.println(updated + " employee salaries updated to 5000.");
	        } else {
	            System.out.println("No employees found with the same salary.");
	        }
	       
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	    	
			session.close();
		}
	}

}
