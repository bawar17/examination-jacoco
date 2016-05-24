package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;

import org.junit.Test;

public class ResultsFromInputsTest {
	ResultFromInputs result = new ResultFromInputs();

	@Test
	public void testAgeGettersAndSettersMethods() {
		result.setResultForNameLenght(10);
		assertEquals("The result should be 10", result.getResultForNameLenght(), 10);
	}
	
	
	@Test 
	public void resultForAge(){
		result.setResultForAge(35);
		assertEquals("The result should be 35", result.getResultForAge(), 35);
	}

	
	@Test 
	public void resultForGender(){
		result.setResultForGender(15);
		assertEquals("The result should be 15 ", result.getResultForGender(), 15);
	}
	
	

	@Test 
	public void resultForHomeCity(){
		result.setResultForHomeCity(55);
		assertEquals("The result should be 55 ", result.getResultForHomeCity(), 55);
	}
	
	
	
}
