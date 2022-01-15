package lambdastreams.baseoperations;

import java.util.*;

public class Operations {
    private List<Integer> integers;

    public Operations(List<Integer> integers) {
        if (integers == null || integers.isEmpty()) {
            throw new IllegalArgumentException("List is empty!");
        }
        this.integers = integers;
    }

    public Optional<Integer> min() {
        return integers.stream().min(Comparator.comparing(Integer::intValue));
    }

    public Integer sum() {
        return integers.stream().reduce(
                0,
                (integer, integer2) -> integer + integer2,
                (integer, integer2) -> integer + integer2);
    }

    public boolean isAllPositive() {
        return integers.stream().allMatch(integer -> integer > 0);
    }

    public Set<Integer> getDistinctElements() {
        return integers.stream().collect(TreeSet::new,
                (set, integer) -> set.add(integer),
                (set, set2) -> set.addAll(set2));
    }

    public List<Integer> getIntegers() {
        return integers;
    }
}
