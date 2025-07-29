public int[] evenOdd(int[] nums) {
  int[] arr = new int[nums.length];
  //will try to use 2 pointers
  int i = 0;
  int j = nums.length-1;
  while(i<nums.length && j>= 0 && i<j){
    while(i<nums.length && nums[i]%2==0) i++;
    while(j>=0 && nums[j]%2==1) j--;
    if(i<j){
      int x = nums[i];
    nums[i] = nums[j];
    nums[j] = x;
    i++;
    j--;
    }
    
  }
  return nums;
}