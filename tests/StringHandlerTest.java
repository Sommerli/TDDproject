import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class StringHandlerTest {

    StringHandler handler;

    @Before
    public void setUp() {
        handler = new StringHandler();
    }

    @Test
    public void newStringHandlerObject() {
        StringHandler stringHandler = new StringHandler();
        assertTrue(stringHandler.getClass().equals(StringHandler.class));
    }

    @Test
    public void splitStringMethod_emptyString_ReturnsListWithEmptyString() {
        String[] expectedWords = new String[] {""};

        LinkedList<String> expectedList = new LinkedList<>(Arrays.asList(expectedWords));

        String stringToSplit = "";
        assertArrayEquals(expectedList.toArray(),handler.splitString(stringToSplit).toArray());
    }

    @Test
    public void splitStringMethod_oneWord_ReturnsListWithWord() {
        String[] expectedWords = new String[] {"word"};

        LinkedList<String> expectedList = new LinkedList<>(Arrays.asList(expectedWords));

        String stringToSplit = "word";
        assertArrayEquals(expectedList.toArray(),handler.splitString(stringToSplit).toArray());
    }

    
    @Test
    public void splitStringMethod_twoWordsAndWhiteSpace_ReturnsListWithBothWords() {
        String[] expectedWords = new String[] {"two", "words"};

        LinkedList<String> expectedList = new LinkedList<>(Arrays.asList(expectedWords));

        String stringToSplit = "two words";
        assertArrayEquals(expectedList.toArray(),handler.splitString(stringToSplit).toArray());
    }

    @Test
    public void splitStringMethod_twoWordsAndLineShift_ReturnsListWithBothWords() {
        String[] expectedWords = new String[] {"two", "words"};

        LinkedList<String> expectedList = new LinkedList<>(Arrays.asList(expectedWords));

        String stringToSplit = "two\nwords";
        assertArrayEquals(expectedList.toArray(),handler.splitString(stringToSplit).toArray());
    }

    @Test
    public void splitStringMethod_ThreeWords_LineShiftAndWhitespace_ReturnsListWithAllWords() {
        String[] expectedWords = new String[] {"three", "words", "string"};

        LinkedList<String> expectedList = new LinkedList<>(Arrays.asList(expectedWords));

        String stringToSplit = "three\nwords string";
        assertArrayEquals(expectedList.toArray(),handler.splitString(stringToSplit).toArray());
    }

  /* UFERDIG TEST
    @Test
    public void splitStringMethod_twoWords_ReturnsListWithBothWords() {
        String[] expectedWords = new String[] {"two", "words"};

        LinkedList<String> expectedList = new LinkedList<>(Arrays.asList(expectedWords));

        String stringToSplit = "two \n\\n.asd \n nwords";
        System.out.println(handler.splitString(stringToSplit).toString());
        assertArrayEquals(expectedList.toArray(),handler.splitString(stringToSplit).toArray());
    }
*/

}
