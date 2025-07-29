public boolean more14(int[] nums) {
  int ones = 0;
  int fours = 0;
  for(int x: nums){
    if(x==1)ones++;
    if(x==4)fours++;
  }
  return ones>fours;
}
