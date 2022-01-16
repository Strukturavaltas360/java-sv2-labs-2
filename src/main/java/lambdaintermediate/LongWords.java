package lambdaintermediate;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LongWords {
    private List<String> words;

    public LongWords(List<String> words) {
        this.words = words;
    }

    public long getNumberOfWordsStartWith(String keyWord) {
        return words.stream()
                .filter(s -> s.startsWith(keyWord))
                .count();
    }

    public List<String> getLongerWords(int number) {
        return words.stream()
                .filter(s -> s.length() > number)
                .collect(Collectors.toList());
    }

    public Optional<String> getShortestWordContainingGivenCharacter(char character) {
        return words.stream()
                .filter(s -> s.indexOf(character) >= 0)
                .sorted(Comparator.comparing(String::length))
                .findFirst();
    }
}
