public boolean has12(int[] nums) {
  int i = 0;
  while(i<nums.length){
    if(nums[i]==1){
      i++;
      while(i<nums.length && nums[i]!=2) {
        i++;
        continue;
      }
      if(i<nums.length && nums[i] ==2) return true;
    }
    else if(i<nums.length){
      i++;
    }
      
    
  }
  return false;
}
