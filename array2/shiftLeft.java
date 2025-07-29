public int[] shiftLeft(int[] nums) {
  if(nums.length == 0)return nums;
  int[] arr = new int[nums.length];
  int last = nums[0];
  for(int i = 0; i<nums.length-1; i++){
    arr[i] = nums[i+1];
  }
  arr[nums.length-1] = last;
  return arr;
}