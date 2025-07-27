public int[] rotateLeft3(int[] nums) {
  int last = nums[0];
  for(int i = 0; i<nums.length-1; i++){
    nums[i] = nums[i+1];
  }
  nums[nums.length-1] = last;
  return nums;
}