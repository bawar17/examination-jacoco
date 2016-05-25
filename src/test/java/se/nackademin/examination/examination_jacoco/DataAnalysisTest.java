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
	
		
		values.addAll(Arrays.asList("Game", "Ral", "Silva", "M", "30", "Fortaleza"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is 30 or older' ",
				result.contains("The first name is smaller or equals in size to the last name and the participant is 30 or younger"));

	}
	
	
	@Test
	 public void test2() {
	  
	  values.addAll(Arrays.asList("Game", "Eizuldeen", "Bawar", "M", "31", "Uppsala"));
	  String result = dataAnalysis.buildFinalString(values);
	  assertTrue("The result should contain 'The name of the homecity is small and the participant is younger than 30 ",
	    result.contains("The first name is greater or equals in size to the last name and the participant older than 30"));

	 }
	
	@Test
	 public void test3() {
	  
	  values.addAll(Arrays.asList("Jacoco", "Bawar", "Bawar", "M", "31", "Uppsala"));
	  String result = dataAnalysis.buildFinalString(values);
	  assertTrue("The result should contain 'The name of the homecity is small and the participant is younger than 30' ",
	    result.contains("The name of the homecity is big and the participant is 30 or older"));

	 }
	
	@Test
	 public void test4() {
	  
	  values.addAll(Arrays.asList("Jacoco", "Bawaro", "Bawar", "M", "25", "Uppsala"));
	  String result = dataAnalysis.buildFinalString(values);
	  assertTrue("The result should contain 'The name of the homecity is small and the participant is younger than 30' ",
	    result.contains("The name of the homecity is big and the participant is younger than 30"));

	 }
	
	@Test
	 public void test5() {
	  
	  values.addAll(Arrays.asList("Jacoco", "Bar", "Euldeen", "M", "29", "Upp"));
	  String result = dataAnalysis.buildFinalString(values);
	  assertTrue("The result should contain 'The name of the homecity is small and the participant is younger than 30' ",
	    result.contains("The name of the homecity is small and the participant is younger than 30"));

	 }
	
	@Test
	 public void test6() {
	  
	  values.addAll(Arrays.asList("Jacoco", "Bar", "Euldeen", "M", "31", "Upp"));
	  String result = dataAnalysis.buildFinalString(values);
	  assertTrue("The result should contain 'The name of the homecity is small and the participant is younger than 30' ",
	    result.contains("The name of the homecity is small and the participant is 30 or older"));

	 }
	
	
	
	

	
	
		
		
	

}
