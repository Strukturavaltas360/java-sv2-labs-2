package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Vote {
    public Map<VoteResult, Integer> getResult(Map<String, VoteResult> voteResults) {
        Map<VoteResult, Integer> result = new HashMap<>();
        for (Map.Entry<String, VoteResult> entry: voteResults.entrySet()) {
            Integer totalVotes = result.get(entry.getValue());
            totalVotes = totalVotes != null ? totalVotes + 1 : 1;
            result.put(entry.getValue(), totalVotes);
        }
        return result;
    }
}
