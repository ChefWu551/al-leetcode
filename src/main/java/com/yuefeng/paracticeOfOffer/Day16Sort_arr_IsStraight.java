package main.java.com.yuefeng.paracticeOfOffer;

public class Day16Sort_arr_IsStraight {

    public static void main(String[] args) {
        int[] nums = new int[]{8,11,0,7,9};

        Day16Sort_arr_IsStraight d = new Day16Sort_arr_IsStraight();
        d.isStraight(nums);

    }

    public boolean isStraight(int[] nums) {
            int length = nums.length;
            int rand = 0;
            for (int i=0; i<length; i++) {
                int min = nums[i];
                int swapIndex = i;
                for (int j = i+1; j<length; j++) {
                    if (min !=0 && min == nums[j]) return false;
                    else if ( min > nums[j] ) {
                        min = nums[j];
                        swapIndex = j;
                    }

                }
                if (min == 0) rand++;
                if (swapIndex != i) {
                    int tmp = nums[i];
                    nums[i] = min;
                    nums[swapIndex] = tmp;
                }
            }

            for (int i = length - 1; i >0; i--) {
                int value = nums[i] - nums[i-1];
                if (nums[i-1]==0 || value == 1) continue;
                if (value-1 > rand) return false;
                rand = rand - value+1;
            }

            return true;
        }
}
