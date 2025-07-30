public boolean canBalance(int[] nums) {
  int total =0;
  for(int i: nums) total+=i;
  
  int splitSum =0;
  for(int i:nums){
    splitSum+=i;
    if(splitSum == total-splitSum) return true;
    
  }
  return false;
}