public boolean sameEnds(int[] nums, int len) {
  int[] first = new int[len];
  int[] last = new int[len];
  for(int i =0; i<len; i++){
    first[i] = nums[i];
  }
  int idx = 0;
  for(int i =nums.length-len; i<nums.length; i++){
    last[idx] = nums[i];
    idx++;
  }
  
  return Arrays.equals(first, last);
}