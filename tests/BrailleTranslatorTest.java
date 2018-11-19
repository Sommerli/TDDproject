import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class BrailleTranslatorTest {

    BrailleTranslator translator;

    @Before
    public void beforeEveryTest(){
        translator = new BrailleTranslator();
    }

    @Test
    public void newBrailleTranslatorObject() {
        assertEquals(true, translator.getClass().equals(BrailleTranslator.class));
    }

}
