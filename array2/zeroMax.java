public int[] zeroMax(int[] nums) {
  if(nums.length ==0) return nums;
  int idx= 0;
  int largeOdd = 0;
  for(int i = nums.length-1; i>=0; i--){
    if(nums[i]%2==1){
      largeOdd = nums[i];
      idx = i;
      break;
    }
  }
  for(int i = idx; i>=0; i--){
    if(nums[i] == 0) nums[i] = largeOdd;
    if(nums[i]%2==1 && largeOdd<nums[i]) largeOdd = nums[i];
  }
  return nums;
}
