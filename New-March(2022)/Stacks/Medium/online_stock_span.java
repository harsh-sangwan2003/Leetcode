import java.util.ArrayList;

class StockSpanner {

    ArrayList<Integer> list;

    public StockSpanner() {

        list = new ArrayList<>();
    }

    public int next(int price) {

        int nod = 1;
        int idx = list.size() - 1;

        while (idx >= 0 && list.get(idx) <= price) {

            nod++;
            idx--;
        }

        list.add(price);
        return nod;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */