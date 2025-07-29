public int[] pre4(int[] nums) {
  int count = 0;
  for(int i = 0; i<nums.length; i++){
    if(nums[i] == 4)break;
    else count++;
  }
  return Arrays.copyOfRange(nums, 0, count);
}