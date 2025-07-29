public int bigDiff(int[] nums) {
  int smallest = 9999999;
  int largest = -1;
  for(int x: nums){
    if(x<smallest)smallest = x;
    if(x>largest) largest = x;
  }
  return largest - smallest;
}
