import java.util.HashMap;

class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        // key:value value:index
        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if(!map.containsKey(complement)){
                map.put(nums[i],i);
            }
            else if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
        }
        return new int[]{};
    }
}