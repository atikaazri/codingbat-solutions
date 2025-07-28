public int maxBlock(String str) {
  if(str.length()==0) return 0;
  int max = 0;
  int counter=1;
  int i = 0; 
  while(i<str.length()-1){
    counter =1;
    while(i+1<str.length() && str.charAt(i) == str.charAt(i+1)){
      counter++;
      i++;
    }
    if(counter> max) max = counter;
    i++;
  }
  return max;
}
