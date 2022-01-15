package lambdastreams;

import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class OwnStream {

    public Stream<Integer> createStream() {
        return StreamSupport.stream(
                new Spliterators.AbstractSpliterator<Integer>(Long.MAX_VALUE, Spliterator.ORDERED) {
                    private int cntr;
                    @Override
                    public boolean tryAdvance(Consumer<? super Integer> action) {
                        cntr++;
                        if (cntr < 10) {
                            System.out.println("tryAdvance, cntr:" + cntr);
                            action.accept(cntr);
                            return true;
                        } else {
                            return false;
                        }
                    }
                }, false);
    }
}
