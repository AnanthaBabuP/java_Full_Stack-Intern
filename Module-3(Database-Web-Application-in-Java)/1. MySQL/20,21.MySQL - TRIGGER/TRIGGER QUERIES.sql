SELECT * FROM EMPLOYEE_1;

SET SQL_SAFE_UPDATES=0;
UPDATE EMPLOYEE_1 SET EMP_NAME = 'SELVI';
INSERT INTO EMPLOYEE_1 VALUES(1004,'SARATH',''),
(1005,'SARATHA',NOW());

---------------------------------------- -------------
------------ DROP DROP DROP TRIGGER ------------------
-------------------------------------------------------

DROP TRIGGER IF EXISTS STUDENT_DETAILS.EMPLOYEE_B_INSERT_TRIGGER;
DROP TRIGGER IF EXISTS STUDENT_DETAILS.STUDENT_A_UPDATE_TRIGGER;

			-- (OR) --
DROP TRIGGER EMPLOYEE_B_INSERT_TRIGGER

---------------------------------------- -------------
------------ CREATE BEFORE INSERT TRIGGER -------------
--------------------------------------------------------
DELIMITER //
CREATE TRIGGER EMPLOYEE_B_INSERT_TRIGGER
BEFORE INSERT ON EMPLOYEE_1 FOR EACH ROW
BEGIN
	IF NEW.DOJ IS NULL THEN
		SET NEW.DOJ = NOW();
    END IF;
END //


INSERT INTO EMPLOYEE_1 (EMP_ID, EMP_NAME)VALUES(1004,'SARATH'),
(1005,'SARATHA');

---------------------------------------- -------------
------------ CREATE AFTER INSERT TRIGGER -------------
--------------------------------------------------------

DELIMITER //
CREATE TRIGGER STUDENT_A_INSERT_TRIGGER
AFTER INSERT ON STUDENT FOR EACH ROW
BEGIN
	IF (NEW.AGE >= 18) THEN
		INSERT INTO VOTE (VOTER_ID,VOTER_NAME,VOTER_AGE) VALUES 
			(NEW.STUDENT_ID,NEW.STUDENT_NAME,NEW.AGE);
    END IF;
END //

INSERT INTO STUDENT VALUES (1001,'ANANTH','SCIENCE',23,'MALE');
INSERT INTO STUDENT VALUES (1002,'SARATHA','10TH',16,'FEMALE');

--------- FUNCTION CREATED INCREMENT OF STUDENT REG_NO+1 -------------

INSERT INTO STUDENT VALUES (STUDENT_REGNO(),'RAJESH','SCIENCE',21,'MALE'),(STUDENT_REGNO(),'STELLA','10TH',16,'FEMALE');
INSERT INTO STUDENT VALUES (STUDENT_REGNO(),'GAYATHRI','SCIENCE',18,'FEMALE');
---------------------------------------- -------------
------------ CREATE BEFORE UPDATE TRIGGER -------------
--------------------------------------------------------

DELIMITER //
CREATE TRIGGER STUDENT_B_UPDATE_TRIGGER
BEFORE UPDATE ON STUDENT FOR EACH ROW
BEGIN
	IF (NEW.AGE >= 18) THEN
		UPDATE VOTE SET VOTER_AGE = NEW.AGE WHERE VOTER_ID=NEW.STUDENT_ID;
	ELSEIF(NEW.AGE>18) THEN
		DELETE FROM VOTE WHERE VOTER_ID=NEW.STUDENT_ID;
    END IF;
END //

---------------------------------------- -------------
------------ CREATE AFTER UPDATE TRIGGER -------------
--------------------------------------------------------

DELIMITER //
CREATE TRIGGER STUDENT_A_UPDATE_TRIGGER
AFTER UPDATE ON STUDENT FOR EACH ROW
BEGIN
	IF (NEW.AGE >= 18) THEN
		UPDATE VOTE SET VOTER_AGE = NEW.AGE WHERE VOTER_ID=NEW.STUDENT_ID;
        IF (ROW_COUNT()=0) THEN
			INSERT INTO VOTE (VOTER_ID,VOTER_NAME,VOTER_AGE) VALUES 
			(NEW.STUDENT_ID,NEW.STUDENT_NAME,NEW.AGE);
		END IF;
	END IF;
END //
SET SQL_SAFE_UPDATES = 0;
UPDATE STUDENT SET AGE=23 WHERE STUDENT_ID=1004;

UPDATE STUDENT SET AGE=23 WHERE STUDENT_ID=1005;


