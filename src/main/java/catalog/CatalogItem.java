package catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogItem {
    private final String registrationNumber;
    private final int price;
    private List<Feature> features = new ArrayList<>();

    public CatalogItem(String registrationNumber, int price, Feature... features) {
        this.registrationNumber = registrationNumber;
        this.price = price;
        for(Feature feature: features) {
            this.features.add(feature);
        }
    }

    public int fullLengthAtOneItem() {
        int result = 0;
        for (Feature feature: features) {
            if (feature instanceof AudioFeatures) {
                result += ((AudioFeatures) feature).getLength();
            }
        }
        return result;
    }

    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        for (Feature feature: features) {
            for (String contributor: feature.getContributors()) {
                if (!contributors.contains(contributor)) {
                    contributors.add(contributor);
                }
            }
        }
        return contributors;
    }

    public List<String> getTitles() {
        List<String> titles = new ArrayList<>();
        for (Feature feature: features) {
            if (!titles.contains(feature.getTitle())) {
                titles.add(feature.getTitle());
            }
        }
        return titles;
    }

    public boolean hasAudioFeature() {
        for (Feature feature: features) {
            if (feature instanceof AudioFeatures) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPrintedFeature() {
        for (Feature feature: features) {
            if (feature instanceof PrintedFeatures) {
                return true;
            }
        }
        return false;
    }

    public int numberOfPagesAtOneItem() {
        int result = 0;
        for (Feature feature: features) {
            if (feature instanceof PrintedFeatures) {
                result += ((PrintedFeatures) feature).getNumberOfPages();
            }
        }
        return result;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public List<Feature> getFeatures() {
        return features;
    }
}
