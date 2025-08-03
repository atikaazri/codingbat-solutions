public int[] copyEndy(int[] nums, int count) {
  int[] evens = new int[count];
  int j = 0;
  for(int i = 0; i<count; i++){
    while(!isEndy(nums[j])) j++;
    evens[i] = nums[j];
    j++;
  }
  return evens;
}
public boolean isEndy(int n){
  if((n>=0 && n<=10) || (n>=90 && n<=100)) return true;
  return false;
}
