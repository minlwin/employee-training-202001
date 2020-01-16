package com.jdc.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentTest {
	
	private static EntityManagerFactory EMF;
	private EntityManager em;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		EMF = Persistence.createEntityManagerFactory("jpa-entitymanager");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		EMF.close();
	}
	
	@BeforeEach
	private void beforeEach() {
		em = EMF.createEntityManager();
	}
	
	@AfterEach
	private void after() {
		em.close();
	}

	@Test
	void test() {
		
		
	}

}
