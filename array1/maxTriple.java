public int maxTriple(int[] nums) {
  int largest = -1;
  if(nums[0]>largest) largest = nums[0];
  if(nums[nums.length/2]>largest) largest = nums[nums.length/2];
  if(nums[nums.length-1]> largest) largest = nums[nums.length-1];
  return largest;
}