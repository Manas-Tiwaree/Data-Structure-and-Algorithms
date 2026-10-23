class Solution {
     private void helper(int[] arr, int index, int target,List<List<Integer>> ans, List<Integer> ds){
        if(index == arr.length ){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
            }
            if(arr[index] <= target){
            ds.add(arr[index]);
             helper(arr,index, target - arr[index], ans, ds);
            ds.remove(ds.size()-1);
        }
        
        helper(arr,index + 1, target, ans, ds);
    }
     public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<> ();
         helper( candidates, 0, target, ans, new ArrayList<>());
         return ans;
        
}
}