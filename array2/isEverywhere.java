public boolean isEverywhere(int[] nums, int val) {
  for(int i =0; i<nums.length; i++){
    if(i>0 && nums[i]!= val && nums[i-1]!=val)return false;
    if(i<nums.length-1 && nums[i]!= val && nums[i+1]!=val)return false;
    
  }
  return true;
}