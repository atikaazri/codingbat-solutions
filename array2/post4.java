public int[] post4(int[] nums) {
  int count = 0;
  for(int i = 0; i<nums.length; i++){
    if(nums[i] == 4) count = i;
  }
  return Arrays.copyOfRange(nums, count+1, nums.length);
}
