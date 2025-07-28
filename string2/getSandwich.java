public String getSandwich(String str) {
  String between = "";
  int  firstB = -1;
  int secondB = -1;
  for(int i = 0; i<str.length()-4; i++){
    if(str.substring(i, i+5).equals("bread")){
      if(firstB<0) firstB = i;
      else{
        secondB = i;
      }
    }
  }
  if(firstB<0 || secondB<0 ) return "";
  else{
    return str.substring(firstB+5, secondB);
  }
}
