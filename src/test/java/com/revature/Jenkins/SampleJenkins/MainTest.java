package com.revature.Jenkins.SampleJenkins;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.TestCase;

public class MainTest {
	  @Test
	    public void testInputIsEven(){
	        System.out.println("Executing test");
	        assertTrue(Main.checkIfInputIsAnEvenNumber(22)); // Assertion
	    }

}
