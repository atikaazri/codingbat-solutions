public boolean either24(int[] nums) {
  boolean has22 = false;
  boolean has44= false;
  for(int i = 0; i<nums.length; i++){
    if(i>0 && nums[i] ==2 && nums[i-1]==2) has22 = true;
    if(i>0 && nums[i] ==4 && nums[i-1]==4) has44 = true;
  }
  if(has22 && has44) return false;
  else if(has22 || has44) return true;
  else return false;
}