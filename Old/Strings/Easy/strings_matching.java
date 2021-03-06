import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<String> stringMatching(String[] words) {

        List<String> list = new ArrayList<>();
        Arrays.sort(words, (f, e) -> f.length() - e.length());

        for (int i = 0; i < words.length; i++) {

            for (int j = i + 1; j < words.length; j++) {

                if (words[j].contains(words[i]) && !list.contains(words[i]))
                    list.add(words[i]);
            }
        }

        return list;
    }
}