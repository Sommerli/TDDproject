package maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class NumberMap {

    public static final char NUMBER_INDICATOR='\u283C';

    public static final Map<Integer, Character> NMB_MAP =
            Collections.unmodifiableMap(new HashMap<Integer, Character>(){
                {
                    put(1, '\u2801');
                    put(2, '\u2803');
                    put(3, '\u2809');
                    put(4, '\u2819');
                    put(5, '\u2811');
                    put(6, '\u280B');
                    put(7, '\u281B');
                    put(8, '\u2813');
                    put(9, '\u280A');
                    put(0, '\u281A');
                }
    });
}
