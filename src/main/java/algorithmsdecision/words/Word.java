package algorithmsdecision.words;

import java.util.List;

public class Word {
    public boolean containsLongerWord(List<String> words, String referenceWord) {
        boolean contains = false;
        for (int i = 0; !contains && i < words.size(); i++) {
            contains = words.get(i).length() > referenceWord.length();
        }
        return contains;
    }
}
