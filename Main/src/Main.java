import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // try code
        int arr[] = { -15, 5, 3, 9, 13, 1, 10, 23 };
        System.out.println(subarraySum(arr,2));
    }

    public static boolean subarraySum(int[] nums, int k) {
        // hashmap for lower Big-o complexity
        Map<Integer,Integer> p = new HashMap();

        // declare variables
        p.put(0,1);
        int sum=0;

        // start to get sum from beginning as subarray
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            // if there is a target after substion of sum-target get in if statement
            // for ex. at 4th step sum is 30. Previous sum 16 at 2th step from map. 30-16=14 so target is reached
             if(p.containsKey(sum-k)){
                 return true;
             }
            p.put(sum,p.getOrDefault(sum,0)+1);
        }
        return false;

    }}

