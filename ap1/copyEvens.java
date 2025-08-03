public int[] copyEvens(int[] nums, int count) {
  int[] evens = new int[count];
  int j = 0;
  for(int i = 0; i<count; i++){
    while(nums[j]%2 !=0) j++;
    evens[i] = nums[j];
    j++;
  }
  return evens;
}
