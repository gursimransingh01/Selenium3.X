package JUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitIntro {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Executed once before the class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Executed once after the class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Executed before every test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Executed after every test");
	}

	@Test
	public void test1() {
		System.out.println("Test1");
		
	}
	
	@Test
	public void test2() {
		System.out.println("Test2");
	}
	
	

}
