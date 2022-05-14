class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        helper(candidates,0,target,new ArrayList<>(), res);
        
        return res;
    }
    
    private void helper(int[] arr, int idx, int tar, List<Integer> list, List<List<Integer>> res){
        
        if(tar==0)
            res.add(list);
        
        for(int i=idx; i<arr.length; i++){
         
            if(tar-arr[i]>=0)
            {
                list.add(arr[i]);
                helper(arr,i,tar-arr[i],new ArrayList<>(list),res);
                list.remove(list.size()-1);
            }
        }
        
    }
}