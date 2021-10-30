package main.java.com.yuefeng.paracticeOfOffer;

public class Day16Sort_arr_GetLeastNumbers {

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,2,4,2,2,3,1,4};
        Day16Sort_arr_GetLeastNumbers d = new Day16Sort_arr_GetLeastNumbers();
        d.getLeastNumbers(nums, 8);


    }

    int max = 0;
    int maxIndex = 0;

    public int[] getLeastNumbers(int[] arr, int k) {
        int[] values = new int[k];

        for (int i=0; i<k; i++) {
            values[i] = arr[i];
            if(max < values[i]) {
                maxIndex = i;
                max = values[i];
            }
        }

        for (int i=k; i<arr.length; i++){
            if (arr[i] < max) {
                values[maxIndex] = arr[i];
                max = arr[i];
                findMax(values);
            }
        }

        return values;
    }

    public void findMax(int[] values) {
        for (int i=0; i< values.length; i++) {
            if(max < values[i]) {
                max = values[i];
                maxIndex = i;
            }
        }
    }
}
