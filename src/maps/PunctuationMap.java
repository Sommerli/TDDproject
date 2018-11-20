package maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PunctuationMap {

    public static final Map<Character, String> PNC_MAP =
            Collections.unmodifiableMap(new HashMap<Character, String>(){
                {
                    put(',', ""+'\u2802');
                    put(';', ""+'\u2806');
                    put(':', ""+'\u2812');
                    put('.', ""+'\u2832');
                    put('!', ""+'\u2816');
                    put('(', ""+'\u2802'+'\u2823');
                    put(')', ""+'\u2802'+'\u281C');
                    put('?', ""+'\u2826');
                    put('/', ""+'\u2838'+'\u280C');
                    put('#', ""+'\u283C');
                    put('\\', ""+'\u2838'+'\u2821');
                    put('’', ""+'\u2807');
                    // hyphen (used to connect words)
                    put('\u2010', ""+'\u2824');
                    // en dash (used to indicate range of values)
                    put('\u2013', ""+ '\u2820' + '\u2824');
                    put('_', ""+'\u2828'+'\u2824');
                }
            });
}
