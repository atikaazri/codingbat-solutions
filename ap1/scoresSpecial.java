public int scoresSpecial(int[] a, int[] b) {
  return largestSpecial(a)+largestSpecial(b);
}
public int largestSpecial(int[] a){
  int largest = 0;
  for(int x:a){
    if(x%10 ==0 && x>largest) largest = x;
  }
  return largest;
}