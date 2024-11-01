package com.demo.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.model.Product;

@Repository
public class ProductDAO {

	@Autowired
	private SessionFactory fact;

	/**
	 * Product Register Process
	 * 
	 * @param p
	 */
	public void addProductDAO(Product p) {
		try {
			Session session = fact.openSession();
			Transaction tx = session.beginTransaction();

			session.save(p);
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Product List Process
	 * 
	 * @return
	 */
	public List<Product> getAllProductsDAO() {
		List<Product> products = null;
		try {
			Session session = fact.openSession();
			products = session.createQuery("FROM Product").getResultList();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}

	/**
	 * Product Delete Process
	 * 
	 * @param id
	 * @return
	 */
	public int deleteProductDAO(int id) {
		int count = 0;
		try {
			// Open a Hibernate session
			Session session = fact.openSession();
			Transaction tx = session.beginTransaction();

			// Fetch the Product object to delete
			Product product = session.get(Product.class, id);
			if (product != null) {
				// Delete the product if it exists
				session.delete(product);
				count = 1; // Set count to 1 since one record is deleted
			}

			// Commit the transaction
			tx.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	/**
	 * Product Search Based On Id
	 * 
	 * @param id
	 * @return
	 */
	public List<Product> serchProductByIdDAO(int id) {
		List<Product> products = null;
		try {
			Session session = fact.openSession();
			products = session.createQuery("FROM Product WHERE id=" + id).getResultList();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}

}
