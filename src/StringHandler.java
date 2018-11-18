import java.util.Arrays;
import java.util.LinkedList;

public class StringHandler {

    //Returns a Linkedlist containing all words in parameter, split at each whitespace or new line
    public LinkedList<String> splitString(String stringToSplit) {
        LinkedList<String> wordsList = new LinkedList<>();
        String[] wordsArray = stringToSplit.split("[ \n]");

        wordsList.addAll(Arrays.asList(wordsArray));

        return wordsList;
    }
}
