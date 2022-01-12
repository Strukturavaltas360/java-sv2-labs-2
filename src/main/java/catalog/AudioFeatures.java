package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {
    private final String title;
    private final int length;
    private final List<String> performers;
    private final List<String> composers;

    public AudioFeatures(String title, int length, List<String> performers) {
        this(title, length, performers, null);
    }

    public AudioFeatures(String title, int length, List<String> performers, List<String> composers) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Empty title");
        }
        if (Validators.isEmpty(performers)) {
            throw new IllegalArgumentException("Empty performers");
        }
        if (length < 0) {
            throw new IllegalArgumentException("Invalid length");
        }
        this.title = title;
        this.length = length;
        this.performers = performers;
        this.composers = composers;
    }

    @Override
    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        if (!Validators.isEmpty(composers)) {
            contributors.addAll(composers);
        }
        contributors.addAll(performers);
        return contributors;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
}
