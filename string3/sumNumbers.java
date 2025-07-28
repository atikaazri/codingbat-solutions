public int sumNumbers(String str) {
  int sum = 0;
  String num = "";
  for(int i = 0; i<str.length();){
    if(Character.isDigit(str.charAt(i))){
      while(i<str.length() && Character.isDigit(str.charAt(i))){
      num += String.valueOf(str.charAt(i));
      i++;
     } 
    sum+=Integer.parseInt(num);
    num = "";
    }
    
    i++;
  }
  return sum;
}
