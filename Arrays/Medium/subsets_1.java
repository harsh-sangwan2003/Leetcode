class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        int end = (int)Math.pow(2,arr.length);
        
        for(int i=0; i<end; i++){
            
            int temp = i;
            List<Integer> list = new ArrayList<>();
            
            for(int j=0; j<arr.length; j++){
                
                int rem = temp%2;
                temp/=2;
                
                if(rem!=0)
                    list.add(arr[j]);
            }
            
            res.add(list);
        }
        
        return res;
    }
    
}