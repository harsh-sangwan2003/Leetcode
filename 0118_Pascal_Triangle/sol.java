import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        a.add(1);
        res.add(a);

        if (numRows == 1)
            return res;

        List<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(1);
        res.add(b);

        if (numRows == 2)
            return res;

        List<Integer> temp = b;

        for (int i = 3; i <= numRows; i++) {

            List<Integer> list = new ArrayList<>();
            list.add(1);

            for (int j = 1; j < temp.size(); j++) {

                list.add(temp.get(j - 1) + temp.get(j));
            }

            list.add(1);
            temp = list;

            res.add(list);
        }

        return res;
    }
}