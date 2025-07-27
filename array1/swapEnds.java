public int[] swapEnds(int[] nums) {
  int last = nums[0];
  nums[0] = nums[nums.length-1];
  nums[nums.length-1] = last;
  return nums;
}