package service;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Song;

public class MainTest {

	@Test
	public void test_equals() {
		Song s1 = new Song("22", "taylor", 2.30f);
		Song s2 = new Song("Mi suerte", "Morat", 3.30f);
		assertNotSame(s1, s2);
	}

	@Test
	public void test_null() {
		Song s1 = new Song("22", "taylor", 2.30f);
		assertNotNull(s1);
	}
}
