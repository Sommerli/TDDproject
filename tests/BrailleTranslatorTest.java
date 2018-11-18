import static org.junit.Assert.*;

import org.junit.Test;


public class BrailleTranslatorTest {

    @Test
    public void newBrailleTranslatorObject() {
        BrailleTranslator translator = new BrailleTranslator();
        assertEquals(true, translator.getClass().equals(BrailleTranslator.class));
    }


}
