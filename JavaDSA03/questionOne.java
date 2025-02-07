public class questionOne {
  public static void main(String[] args) {

    int m = 3, n = 3;
    int[] nums1 = { 1, 2, 3, 0, 0, 0 };
    int[] nums2 = { 5, 4, 2 };

    int i = m - 1, j = n - 1, k = m + n - 1;
    while (i >= 0 && j >= 0) {
      if (nums1[i] > nums2[j])
        nums1[k--] = nums1[i--];
      else
        nums1[k--] = nums2[j--];
    }
    while (j >= 0) {
      nums1[k--] = nums2[j--];
    }

    for (int x : nums1) {
      System.out.print(x+ ", ");
    }
  }
}
