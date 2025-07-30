public int[] fix45(int[] nums) {
  int four = 0;
  for (int i=0; i < nums.length-1; i++) {
    if (nums[i] == 4) {
      while (four < nums.length && !(nums[four] == 5 && (four == 0 || nums[four - 1] != 4))) {
        four++;
      }
      if (four<nums.length) {
        int x = nums[i + 1];
        nums[i + 1] = nums[four];
        nums[four] = x;
      }
    }
  }
  return nums;
}
