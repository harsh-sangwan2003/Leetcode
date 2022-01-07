class Solution {
    public List<String> stringMatching(String[] words) {

        List<String> res = new ArrayList<>();

        Arrays.sort(words, (f, e) -> f.length() - e.length());

        for (int i = 0; i < words.length; i++) {

            for (int j = i + 1; j < words.length; j++) {

                if (words[j].contains(words[i])) {
                    res.add(words[i]);
                    break;
                }
            }
        }

        return res;
    }
}