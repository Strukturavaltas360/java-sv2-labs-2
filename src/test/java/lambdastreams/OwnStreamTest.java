package lambdastreams;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class OwnStreamTest {
    OwnStream os = new OwnStream();
    @Test
    void createStream() {
        Stream<Integer> stream = os.createStream();
        stream.forEach(this::printAndWait);
    }

    private void printAndWait(Integer i) {
        System.out.println("stream: " + i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new IllegalStateException("Process has been interrupted", e);
        }
    }
}