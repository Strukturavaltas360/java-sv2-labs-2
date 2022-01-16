package lambdastreams;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class OwnStreamTest {
    OwnStream os = new OwnStream();

    @Test
    void createStream() {
        try (Stream<Integer> stream = os.createStream()) {
            stream.peek(this::printAndWait)
                    .collect(Collectors.toList());
        }
    }

    private void printAndWait(Integer i) {
        System.out.println("stream: " + i);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new IllegalStateException("Process has been interrupted", e);
        }
    }
}