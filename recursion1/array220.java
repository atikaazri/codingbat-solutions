public boolean array220(int[] nums, int index) {
  if(index+1 == nums.length || nums.length == 0) return false;
  else if(nums[index]*10 == nums[index+1] ) return true;
  else return array220(nums, index+1);
}