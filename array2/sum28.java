public boolean sum28(int[] nums) {
  int sum2s = 0;
  for(int x: nums){
    if(x==2) sum2s+=2;
  }
  return sum2s==8;
}