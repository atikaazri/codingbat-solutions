public boolean dividesSelf(int n) {
  int x = n;
  while(x > 0){
    int digit = x%10;
    if(digit == 0 || n%digit != 0) return false;
    x = x/10;
    
  }
  return true;
}

