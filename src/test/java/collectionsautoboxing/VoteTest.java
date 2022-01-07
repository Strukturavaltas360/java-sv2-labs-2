package collectionsautoboxing;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static collectionsautoboxing.VoteResult.NO;
import static collectionsautoboxing.VoteResult.YES;
import static org.junit.jupiter.api.Assertions.*;

class VoteTest {

    @Test
    void getResult() {
        Vote vote = new Vote();
        Map<String, VoteResult> voteResults = Map.of(
                "John Doe", YES,
                "Jack Doe", NO,
                "Jill Doe", YES,
                "xx", YES
        );

        assertEquals(1, vote.getResult(voteResults).get(NO));
        assertEquals(3, vote.getResult(voteResults).get(YES));
    }
}