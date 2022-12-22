import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordsChecker {

    public WordsChecker(String text, String word) {
        System.out.println(hasWord(text, word));
    }

    public boolean hasWord(String text, String word) {
        List<String> textCollection = new ArrayList<>(Arrays.asList(text.split("\\P{IsAlphabetic}+")));
        return textCollection.contains(word);
    }
}
