import java.util.Scanner;
import java.util.HashMap;
import java.util.Stack;

public class ngef {

    public static int[] next_gr_f(int[] arr) {

        int[] res = new int[arr.length];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        Stack<Integer> st = new Stack<>();
        res[arr.length - 1] = -1;
        st.push(arr.length - 1);

        for (int i = arr.length - 2; i >= 0; i--) {

            while (st.size() != 0 && map.get(arr[i]) >= map.get(arr[st.peek()]))
                st.pop();

            if (st.size() == 0)
                res[i] = -1;

            else
                res[i] = map.get(arr[st.peek()]);

            st.push(i);
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int[] res = next_gr_f(arr);

        for (int val : res)
            System.out.print(val + " ");

        scn.close();
    }
}
