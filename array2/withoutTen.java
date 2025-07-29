public int[] withoutTen(int[] nums) {
  int[] arr = new int[nums.length];
  int count = 0;
  int idx = 0;
  for(int i = 0; i<nums.length; i++){
    if(nums[i]==10) count++;
    else{
      arr[idx] = nums[i];
      idx++;
    }
  }
  for(int i = idx; i<nums.length; i++) arr[i] = 0;
  return arr;
}