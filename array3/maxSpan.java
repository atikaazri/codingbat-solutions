public int maxSpan(int[] nums) {
  int largest = 0;
  if(nums.length == 0) return 0;
  for(int i = 0; i<nums.length; i++){
    for(int j=nums.length-1; j>=i; j--){
      if(nums[i] == nums[j] && j-i > largest) largest = j-i;
    }
  }
  return largest +1;
}