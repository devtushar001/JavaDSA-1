344, 283, 3074

88, 2540, 881, 189

Brute force -------> Better,
1) nums!, 0 ----> nums2
2) nums! sort (0log(nlogn))

n [1,2,3,0,0,0], m [2,5,6]

[1,2,3,3,5,6] soluted array

<!-- class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int i = m -1, j = n - 1, k = m + n-1;
       while(i>=0 && j>=0) {
           if(nums1[i] > nums2[j]) nums1[k--] = nums1[i--];
           else nums1[k--] = nums2[j--];
       }
       while(j>=0) {
        nums1[k--] = nums2[j--];
       }
    }
} --> two pointer questions