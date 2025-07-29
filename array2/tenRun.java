public int[] tenRun(int[] nums) {
  int i =0;
  while(i<nums.length){
    if (nums[i]%10 == 0){
      int ten = nums[i];
      i++;
      while(i<nums.length && nums[i]%10 != 0){
        nums[i] = ten;
        i++;
      }
    }
    else i++;
  }
  return nums;
}
