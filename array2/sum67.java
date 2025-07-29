public int sum67(int[] nums) {
  int i = 0;
  int sum = 0;
  while(i<nums.length){
    if(nums[i]==6){
      i++;
      while(nums[i]!=7) {
        i++;
        continue;
      }
      if(nums[i] ==7) i++;
    }
    else if(i<nums.length){
      sum+=nums[i];
      i++;
    }
      
    
  }
  return sum;
}
