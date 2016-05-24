package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class DataAnalysisTest {
	
	DataAnalysis dataAnalysis = new DataAnalysis();
	ArrayList<String> values = new ArrayList<String>();
	
	@Test
	public void test1() {
	
		
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is 30 or older' ",
				result.contains("The name of the homecity is big and the participant is 30 or older"));

	}
	
	
	@Test
	 public void test2() {
	  
	  values.addAll(Arrays.asList("Jacoco", "Bawar", "Eizuldeen", "M", "29", "Uppsala"));
	  String result = dataAnalysis.buildFinalString(values);
	  assertTrue("The result should contain 'The name of the homecity is small and the participant is younger than 30' ",
	    result.contains("The name of the homecity is small and the participant is younger than 30"));

	 }
	
	@Test
	 public void test3() {
	  
	  values.addAll(Arrays.asList("Jacoco", "Bawar", "Bawar", "M", "29", "Uppsala"));
	  String result = dataAnalysis.buildFinalString(values);
	  assertTrue("The result should contain 'The name of the homecity is small and the participant is younger than 30' ",
	    result.contains("The name of the homecity is small and the participant is younger than 30"));

	 }
	
	@Test
	 public void test4() {
	  
	  values.addAll(Arrays.asList("Jacoco", "Eizuldeen", "Eizuldeen", "M", "30", "Uppsala"));
	  String result = dataAnalysis.buildFinalString(values);
	  assertTrue("The result should contain 'The name of the homecity is small and the participant is younger than 30' ",
	    result.contains("The name of the homecity is small and the participant is younger than 30"));

	 }
	
	@Test
	 public void test5() {
	  
	  values.addAll(Arrays.asList("Jacoco", "Bar", "Euldeen", "M", "29", "Uppsala"));
	  String result = dataAnalysis.buildFinalString(values);
	  assertTrue("The result should contain 'The name of the homecity is small and the participant is younger than 30' ",
	    result.contains("The name of the homecity is small and the participant is younger than 30"));

	 }
	
	

	
	
		
		
	

}
