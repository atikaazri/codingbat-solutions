public boolean no14(int[] nums) {
  boolean one = false;
  boolean four = false;
  for(int x : nums){
    if(x==1 ) one = true;
    else if(x==4) four = true;
  }
  return (one && !four) || (!one && four) || (!one && !four) ;

}