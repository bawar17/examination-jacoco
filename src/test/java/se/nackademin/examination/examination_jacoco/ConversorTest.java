package se.nackademin.examination.examination_jacoco;
import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorTest {

 @Test
 public void testConversor() {
  Conversor conversor = new Conversor();
  conversor.setNameConverterArrayValues();
  assertEquals(conversor.getNameConverterArray().get(0), "Your first name is smaller than your last name");
 }
 @Test
 public void testRunGame(){
  Game game = new Game();
  game.runGame("Game", "Bawar", "Eizuldeen", 'M', 35, "Uppsala");
 }
}