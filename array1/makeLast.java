public int[] makeLast(int[] nums) {
  int[] newArr = new int[nums.length*2];
  newArr[nums.length*2-1] = nums[nums.length-1];
  return newArr;
}