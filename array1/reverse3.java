public int[] reverse3(int[] nums) {
  int last = nums[0];
  nums[0] = nums[2];
  nums[2] = last;
  return nums;
}