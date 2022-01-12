package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem item) {
        catalogItems.add(item);
    }

    public double averagePageNumberOver(int page) {
        int count = 0;
        int total = 0;
        if (page <= 0) {
            throw new IllegalArgumentException("Page number must be positive");
        }
        for (CatalogItem item: catalogItems) {
            if (item.numberOfPagesAtOneItem() >= page) {
                count++;
                total += item.numberOfPagesAtOneItem();
            }
        }
        if (count == 0) {
            throw new IllegalArgumentException("No page");
        }
        return total / count;
    }

    public void deleteItemByRegistrationNumber(String registrationNumber) {
        for (int i = catalogItems.size() - 1; i >= 0; i--) {
            CatalogItem item = catalogItems.get(i);
            if (item.getRegistrationNumber().equals(registrationNumber)) {
                catalogItems.remove(i);
            }
        }
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem item: catalogItems) {
            int passed = 0;
            if (searchCriteria.hasTitle() && item.getTitles().contains(searchCriteria.getTitle())) {
                passed++;
            }
            if (searchCriteria.hasContributor() && item.getContributors().contains(searchCriteria.getContributor())) {
                passed++;
            }
            if (passed == getNumberOfCriterias(searchCriteria)) {
                result.add(item);
            }
        }
        return result;
    }

    private int getNumberOfCriterias(SearchCriteria searchCriteria) {
        int result = 0;
        if (searchCriteria.hasTitle()) {
            result++;
        }
        if (searchCriteria.hasContributor()) {
            result++;
        }
        return result;
    }

    public int getAllPageNumber() {
        int result = 0;
        for (CatalogItem item: catalogItems) {
            result += item.numberOfPagesAtOneItem();
        }
        return result;

    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem item: catalogItems) {
            if (item.hasAudioFeature()) {
                result.add(item);
            }
        }
        return result;
    }

    public int getFullLength() {
        int result = 0;
        for (CatalogItem item: catalogItems) {
            result += item.fullLengthAtOneItem();
        }
        return result;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem item: catalogItems) {
            if (item.hasPrintedFeature()) {
                result.add(item);
            }
        }
        return result;
    }
}
