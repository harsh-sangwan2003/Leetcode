class Solution {
    public int reverse(int x) {
        
        boolean flag = false;

        if(x<0){

            flag = true;
            x = -x;
        }

        long res = 0;

        while(x!=0){

            int d = x%10;
            res = res*10+d;
            x/=10;
        }

        if(flag)
        res = -res;

        if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE)
        return 0;

        return (int)res;
    }
}