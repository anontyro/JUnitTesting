package tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

import main.Student;

public class StudentTest extends TestRules{
	


	@Test
	public void constructorTest() {
		Student student = new Student("sam","1 primary", 2235443);
		System.out.println(student);
		
		Assert.assertTrue(student.getName().equals("sam"));
	}

}
