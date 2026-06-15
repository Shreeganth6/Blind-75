package blind75;

class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int[] result = new int[k];
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,(a,b) -> b.getValue().compareTo(a.getValue()));
        int idx=0;
        for(Map.Entry<Integer, Integer> entry:list){
            if(idx<k){
                result[idx] = entry.getKey();
                idx++;
            }
            else{
                break;
            } 
        }
        return result;
    }
}