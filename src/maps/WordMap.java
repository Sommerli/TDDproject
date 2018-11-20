package maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WordMap {

    public static final Map<String, Character> WRD_MAP =
            Collections.unmodifiableMap(new HashMap<String, Character>(){
                {
                    put("but", '\u2803');
                    put("can", '\u2809');
                    put("do", '\u2819');
                    put("every", '\u2811');
                    put("from", '\u280B');
                    put("go", '\u281B');
                    put("have", '\u2813');
                    put("just", '\u281A');
                    put("knowledge", '\u2828');
                    put("like", '\u2838');
                    put("more", '\u280D');
                    put("not", '\u281D');
                    put("people", '\u280F');
                    put("quite", '\u281F');
                    put("rather", '\u2817');
                    put("so", '\u280E');
                    put("that", '\u281E');
                    put("us", '\u2825');
                    put("very", '\u2827');
                    put("it", '\u282D');
                    put("you", '\u283D');
                    put("as", '\u2835');
                    put("and", '\u282F');
                    put("for", '\u283F');
                    put("of", '\u2837');
                    put("the", '\u282E');
                    put("with", '\u283E');
                    put("will", '\u283A');
                    put("his", '\u2826');
                    put("in", '\u2814');
                    put("was", '\u2834');
                    put("to", '\u2816');
                }
            });
}
