package lambdacomparator.cloud;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Clouds {
    private List<CloudStorage> cloudStorages;

    public Clouds(List<CloudStorage> cloudStorages) {
        if (cloudStorages == null || cloudStorages.isEmpty()) {
            throw new IllegalArgumentException("Invalid list!");
        }
        this.cloudStorages = cloudStorages;
    }

    public CloudStorage alphabeticallyFirst() {
        ArrayList<CloudStorage> sorted = new ArrayList<>(cloudStorages);
        sorted.sort(Comparator.comparing(CloudStorage::getProvider,
                (o1, o2) -> Collator.getInstance().compare(
                        o1.trim().toLowerCase(),
                        o2.trim().toLowerCase())));
        return sorted.get(0);
    }

    public CloudStorage bestPriceForShortestPeriod() {
        ArrayList<CloudStorage> sorted = new ArrayList<>(cloudStorages);
        sorted.sort(Comparator.comparing(CloudStorage::getPayPeriod,
                Comparator.nullsFirst(Comparator.comparingInt(PayPeriod::getLength))));
        return sorted.get(0);
    }

    public List<CloudStorage> worstOffers() {
        ArrayList<CloudStorage> sorted = new ArrayList<>(cloudStorages);
        sorted.sort(Comparator.reverseOrder());
        ArrayList<CloudStorage> result = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            result.add(sorted.get(i));
        }
        return result;
    }

    public List<CloudStorage> getCloudStorages() {
        return cloudStorages;
    }
}
