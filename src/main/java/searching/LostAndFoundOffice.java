package searching;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LostAndFoundOffice {
    private List<LostProperty> lostProperties;

    public LostAndFoundOffice(List<LostProperty> lostProperties) {
        this.lostProperties = new ArrayList<>(lostProperties);
        Collections.sort(this.lostProperties, descriptionAndDateComparator);
    }

    Comparator<LostProperty> descriptionAndDateComparator = new Comparator<LostProperty>() {
        @Override
        public int compare(LostProperty o1, LostProperty o2) {
            int result = descriptionComparator.compare(o1, o2);
            if (result == 0) {
                return o1.getRegistrationDate().compareTo(o2.getRegistrationDate());
            }
            return result;
        }
    };

    Comparator<LostProperty> descriptionComparator = new Comparator<LostProperty>() {
        @Override
        public int compare(LostProperty o1, LostProperty o2) {
            return o1.getDescription().toLowerCase().compareTo(o2.getDescription().toLowerCase());
        }
    };

    public LostProperty findLostProperty(String description) {
        LostProperty toFind = new LostProperty(description, LocalDate.of(0, 1, 1));
        int index = Collections.binarySearch(lostProperties, toFind, descriptionAndDateComparator);
        if (index < 0) {
            index = -(index + 1);
            if (index == lostProperties.size() ||
                    descriptionComparator.compare(lostProperties.get(index), toFind) != 0) {
                throw new IllegalArgumentException("Can not find such item!");
            }
        }
        return lostProperties.get(index);
    }

    public List<LostProperty> getLostProperties() {
        return lostProperties;
    }
}
