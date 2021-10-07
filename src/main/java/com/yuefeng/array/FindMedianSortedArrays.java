package main.java.com.yuefeng.array;

//给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
//
// 
//
//示例 1：
//
//输入：nums1 = [1,3], nums2 = [2]
//输出：2.00000
//解释：合并数组 = [1,2,3] ，中位数 2
//示例 2：
//
//输入：nums1 = [1,2], nums2 = [3,4]
//输出：2.50000
//解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
//示例 3：
//
//输入：nums1 = [0,0], nums2 = [0,0]
//输出：0.00000
//示例 4：
//
//输入：nums1 = [], nums2 = [1]
//输出：1.00000
//示例 5：
//
//输入：nums1 = [2], nums2 = []
//输出：2.00000
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class FindMedianSortedArrays {

    public static void main(String[] args) {
        int[] a = new int[]{3};
        int[] b = new int[]{-1, -2};
        FindMedianSortedArrays findMedianSortedArrays = new FindMedianSortedArrays();
        double value = findMedianSortedArrays.findMedianSortedArrays(a, b);
        System.out.println(value);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] r = merge(nums1, nums2);
        if (r.length % 2 == 1) return r[r.length / 2];
        return (Double.valueOf(r[r.length / 2 - 1]) + Double.valueOf(r[r.length / 2])) / 2;
    }

    public int[] merge(int[] nums1, int[] nums2) {
        if (nums1.length == 0) return nums2;
        if (nums2.length == 0) return nums1;
        int length = nums1.length + nums2.length;

        int[] r = new int[length];
        int j = 0;
        int k = 0;
        int i=0;

        for (;i < length; i++) {
            if (j < nums1.length && k < nums2.length) {
                if ( nums1[j] <= nums2[k]) {
                    r[i] = nums1[j];
                    j++;
                } else {
                    r[i] = nums2[k];
                    k++;
                }
            } else {
                break;
            }
        }

        if (j == nums1.length) { // 把num2的剩下元素添加过来
            while (k < nums2.length) {
                r[i] = nums2[k];
                i++;
                k++;
            }
        }

        if (k == nums2.length) {
            while (j < nums1.length) {
                r[i] = nums1[j];
                i++;
                j++;
            }
        }

        return r;
    }

}
