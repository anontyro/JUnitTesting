package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//allows the adding of many test classes to be tested all together
@RunWith(Suite.class)
@Suite.SuiteClasses({
	StudentTest.class,
	TeacherTest.class,
	TestResultsTest.class
})

public class Primer {

}
