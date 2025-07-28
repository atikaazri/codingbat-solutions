public boolean equalIsNot(String str) {
  int is = 0;
  int not = 0;
  for(int i = 0; i<str.length();){
    if(i+2<=str.length() &&str.substring(i, i+2).equals("is")){
      is++;
      i+=2;
    } 
    else if(i+3<=str.length() &&str.substring(i, i+3).equals("not")){
      not++;
      i+=3;
    }
    else{
      i++;
    }
    
  }
  return is==not;
}
