package maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LetterMap {



    public static final Map<Character, Character> LTR_MAP =
            Collections.unmodifiableMap(new HashMap<Character, Character>(){
                {
                    put('a', '\u2801');
                    put('b', '\u2803');
                    put('c', '\u2809');
                    put('d', '\u2819');
                    put('e', '\u2811');
                    put('f', '\u280B');
                    put('g', '\u281B');
                    put('h', '\u2813');
                    put('i', '\u280A');
                    put('j', '\u281A');
                    put('k', '\u2805');
                    put('l', '\u2807');
                    put('m', '\u280D');
                    put('n', '\u281D');
                    put('o', '\u2815');
                    put('p', '\u280F');
                    put('q', '\u281F');
                    put('r', '\u2817');
                    put('s', '\u280E');
                    put('t', '\u281E');
                    put('u', '\u2825');
                    put('v', '\u2827');
                    put('w', '\u283A');
                    put('x', '\u282D');
                    put('y', '\u283D');
                    put('z', '\u2835');
                }
            });
}
