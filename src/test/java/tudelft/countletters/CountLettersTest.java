package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void lastisR() {
        int words = new CountLetters().count("catr|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void lastisnotRorS() {
        int words = new CountLetters().count("catg|dog");
        Assertions.assertEquals(0, words);
    }
    @Test
    public void lastisR2() {
        int words = new CountLetters().count("catg|dogr");
        Assertions.assertEquals(1, words);
    }
}