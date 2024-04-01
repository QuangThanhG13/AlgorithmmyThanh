package baicodethieunhi;

public class TwoSum {
    public static int[] twoSum(int [] nums , int target){
        for (int i = 0; i < nums.length; i++ ) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] + nums[j] == target) {
                  return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int [] num1 = {2,7,11,15};
        int target1 = 9;
        int[] result =twoSum(num1,target1);
        System.out.println("["+ result[0] + " " + result[1] + "]");

        int[] num2 = {3, 2, 4};
        int target2 = 6;
        int[] result1 = twoSum(num2, target2);
        System.out.println("[" + result1[0] + " " + result1[1] + "]");

        int [] num3 = {3,3};
        int target3 = 6;
        int[] result3 =twoSum(num3,target3);
        System.out.println("["+ result3[0] + " " + result3[1] + "]");

// cach hash map


    }
//    public static int twoSum1 (int[] nums, int target) { }
}
