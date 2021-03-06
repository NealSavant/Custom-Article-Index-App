package com.skilldistillery.sdelp.entities;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ImageTest {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Image image;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("SDELP");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		image = em.find(Image.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		image = null;
		em.close();
	}

	@Test
	@DisplayName("Test user entity mapping")
	void test1() {
		assertNotNull(image);
		assertEquals(1, image.getId());
	}

	@DisplayName("Testing image list for topic")
	@Test
	void test5() {
		assertTrue(image.getTopics().size() > 0);
		assertEquals("https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png", image.getImageUrl());
	}
}
