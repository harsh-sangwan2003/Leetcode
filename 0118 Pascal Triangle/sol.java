import java.util.*;

class sol {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        list.add(1);
        res.add(list);

        for (int i = 2; i <= numRows; i++) {

            List<Integer> temp = new ArrayList<>();
            temp.add(1);

            for (int j = 1; j < list.size(); j++)
                temp.add(list.get(j) + list.get(j - 1));

            temp.add(1);

            list = temp;
            res.add(temp);
        }

        return res;
    }
}