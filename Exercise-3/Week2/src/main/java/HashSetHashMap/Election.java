package HashSetHashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Election {
    // String: Tên của người được bầu cử
    String candidateName = "";
    // Integer: Số lượng lượt vote
    Integer voteCount = 0;
    HashMap<String, Integer> candidates = new HashMap<String, Integer>();

    public void vote(String name) {
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1);
        } else {
            candidates.put(name, 1);
        }
    }

    // Trả về người có lượng vote cao nhất với format {name} - {vote}
    public String winner() {
        Set<String> candidateKeys = candidates.keySet();
        int max = 0;
        for (String candidateKey : candidateKeys) {
            if (candidates.get(candidateKey) >= max) {
                max = candidates.get(candidateKey);
            }
        }
        String s = "";
        for (String candidateKey : candidateKeys) {
            if (candidates.get(candidateKey) == max) {
                s += ("\n" + candidateKey + "-" + candidates.get(candidateKey));
            }
        }
        return s;
    }
}
