package junit5fixture;

import java.util.ArrayList;
import java.util.List;

public class Words {
    private List<String> words = new ArrayList<>();

    public void addWord(String word) {
        words.add(word);
    }

    public void getWordsStartWith(String prefix) {
        List<String> selected = new ArrayList<>();

        for(String word: words) {
            if (!word.startsWith(prefix)) selected.add(word);
        }

        words.removeAll(selected);
    }

    public void getWordsWithLength(int length) {
        List<String> selected = new ArrayList<>();

        for(String word: words) {
            if (word.length() != length) selected.add(word);
        }

        words.removeAll(selected);
    }

    public List<String> getWords() {
        return words;
    }
}
