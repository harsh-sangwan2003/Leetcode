class Solution {
    public int trap(int[] arr) {
        
        int[] lmax = new int[arr.length];
        int[] rmax = new int[arr.length];
        int ans = 0;

        lmax[0] = arr[0];
        for(int i=1; i<lmax.length; i++)
        lmax[i] = Math.max(arr[i],lmax[i-1]);

        rmax[rmax.length-1] = arr[rmax.length-1];
        for(int i=rmax.length-2; i>=0; i--)
        rmax[i] = Math.max(arr[i],rmax[i+1]);

        for(int i=1; i<arr.length-1; i++){

            int left = lmax[i-1];
            int right = rmax[i+1];
            int water = Math.min(left,right) - arr[i];

            if(water>0)
            ans += water;
        }

        return ans;
    }
}