class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
       Set<List<Integer>> res = new HashSet<>();
        if(arr.length==0){
            return new ArrayList<>(res);
        }
       Arrays.sort(arr);
       for(int i=0;i<arr.length;i++){
           int j = i+1;
           int k = arr.length-1;
           while(j<k){
               int sum = arr[j]+arr[k];
               if(sum == -arr[i]){
                   res.add(Arrays.asList(arr[i],arr[j++],arr[k--]));
               }else if(sum>-arr[i]){
                   k--;
               }else if(sum<-arr[i]){
                   j++;
               }
           }
       }
       return new ArrayList<>(res);
    }
}
