public int centeredAverage(int[] nums) {
  int smallest = 9999999;
  int largest = -1;
  int sum = 0;
  for(int x: nums){
    if(x<smallest)smallest = x;
    if(x>largest) largest = x;
    sum+=x;
  }
  return (sum-largest-smallest) / (nums.length-2);

}