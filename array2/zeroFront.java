public int[] zeroFront(int[] nums) {
  int[] arr = new int[nums.length];
  int count = 0;
  for(int i = 0; i<nums.length; i++){
    if(nums[i]==0) count++;
  }
  for(int i = 0; i<count; i++) arr[i] = 0;
  
  for(int i = 0; i<nums.length; i++){
    if(nums[i]!=0 && count<nums.length){
      arr[count] = nums[i];
      count++;
    }
  }
  return arr;
}
