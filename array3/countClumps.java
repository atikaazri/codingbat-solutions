public int countClumps(int[] nums) {
  int count = 0;
  for(int i = 0; i<nums.length-1;){
    if(nums[i] == nums[i+1] && i+1<nums.length){
      count++;
      while( i+1<nums.length && nums[i] == nums[i+1]) i++;
    }
    else i++;
    
  }
  return count;
}