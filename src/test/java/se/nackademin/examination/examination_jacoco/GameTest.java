package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;


public class GameTest {
	ArrayList<String> testValues = new ArrayList<String>(Arrays.asList("Game", "Bawar", "Eizuldeen", "M", "35", "Uppsala"));

	@Test //5.1%
	public void testMethod1() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Bawar", "Eizulden");
		assertEquals("The result should be 1", i, 1);
	} 

	@Test 
	public void testGetAge(){

		Game game = new Game(); 
		int a = game.getAgeFromInputValues(testValues); 
		assertEquals(a,26); 
	} 

	@Test 
	public void testGetGender(){
		Game game = new Game();
		char a = game.getGenderFromInputValues(testValues);
		char m = 'M'; 
		assertEquals(m, a);
	}


	@Test 
	public void testCalculateOutPutBasedOnNames1(){
		Game game = new Game();
		int a = game.calculateOutPutBasedOnNames("Bawar", "Eizuldeen");
		assertEquals(0, a); 

	}
	@Test
	public void testCalculateOutPutBasedOnNames2(){
		Game game = new Game();
		int a = game.calculateOutPutBasedOnNames("Eizuldeen", "Bawar");
		assertEquals(1, a); 

	}
	@Test 
	public void testCalculateOutPutBasedOnNames3(){
		Game game = new Game();
		int a = game.calculateOutPutBasedOnNames("Bawar", "Bawar");
		assertEquals(2, a); 

	}
	@Test 
	public void testRunGame(){
		Game game = new Game();
		game.runGame("Game", "Bawar", "Eizuldeen", 'A', 35, "Uppsala");
	}
	@Test
	public void testRun(){
		Game game = new Game();
		game.run(testValues);  
	}
	@Test
	public void testCalculateOutPutBasedOnGenderMale(){
		Game game = new Game();
		int a = game.calculateOutPutBasedOnGender('M');
		assertEquals(0, a);
	}
	@Test
	public void testCalculateOutPutBasedOnGenderFemale(){
		Game game = new Game();
		int a = game.calculateOutPutBasedOnGender('F');
		assertEquals(1, a);
	}
	@Test
	public void testCalculateOutPutBasedOnHomeCity(){

	}

}