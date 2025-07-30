public int[] fix34(int[] nums) {
  int four = 0;
  for (int i=0; i < nums.length-1; i++) {
    if (nums[i] == 3) {
      while (four < nums.length && nums[four] != 4) {
        four++;
      }
      if (four<nums.length) {
        int x = nums[i + 1];
        nums[i + 1] = nums[four];
        nums[four] = x;
      }
    }
  }
  return nums;
}
