import java.util.List; 
import java.util.ArrayList;

class Solution {

    private static String[] codes = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    private boolean flag = false;

    public List<String> letterCombinations(String str) {

        if (str.length() == 0 && !flag)
            return new ArrayList<>();

        if (str.length() == 0) {

            List<String> list = new ArrayList<>();
            list.add("");
            return list;
        }

        List<String> mres = new ArrayList<>();
        flag = true;

        char ch = str.charAt(0);
        String ros = str.substring(1);

        List<String> rres = letterCombinations(ros);

        for (int i = 0; i < codes[ch - '2'].length(); i++) {

            for (String s : rres) {

                mres.add(codes[ch - '2'].charAt(i) + s);
            }
        }

        return mres;
    }
}