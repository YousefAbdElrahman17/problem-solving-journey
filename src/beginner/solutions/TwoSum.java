package beginner.solutions;

public class TwoSum {
    public static void main(String[] args){
        //no need to print
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j;
        int[] Arr = new int[2];
        for(i=0 ; i<nums.length ; i++){
            for(j=i+1 ; j<nums.length ; j++){
                if(nums[i]+nums[j] == target){
                    Arr[0] = i;
                    Arr[1] = j;
                }
            }
        }
        return Arr;
    }
}