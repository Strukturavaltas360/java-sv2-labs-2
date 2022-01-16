package lambdastreams;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class OwnStream {
    private class TestSpliterator extends Spliterators.AbstractSpliterator<Integer> implements Runnable {
        private int cntr;

        protected TestSpliterator(long est, int additionalCharacteristics) {
            super(est, additionalCharacteristics);
        }

        @Override
        public void run() {
            System.out.println("onClose");
        }

        @Override
        public boolean tryAdvance(Consumer<? super Integer> action) {
            cntr++;
            if (cntr < 10) {
                System.out.println("tryAdvance, cntr:" + cntr);
                action.accept(cntr);
                return true;
            }
            return false;
        }

        @Override
        public void forEachRemaining(Consumer<? super Integer> action) {
            super.forEachRemaining(action);
        }

        @Override
        public long getExactSizeIfKnown() {
            return super.getExactSizeIfKnown();
        }

        @Override
        public boolean hasCharacteristics(int characteristics) {
            return super.hasCharacteristics(characteristics);
        }

        @Override
        public Comparator<? super Integer> getComparator() {
            return super.getComparator();
        }
    }

    public Stream<Integer> createStream() {
        TestSpliterator testSpliterator = new TestSpliterator(Long.MAX_VALUE, Spliterator.ORDERED);
        Stream<Integer> result = StreamSupport.stream(testSpliterator, false);
        result.onClose(testSpliterator);
        return result;
    }
}
