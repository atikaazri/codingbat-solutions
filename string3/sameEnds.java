public String sameEnds(String string) {
  String sub = "";
  for(int i = 0; i<string.length()/2; i++){
    if(string.substring(0,i+1).equals(string.substring(string.length()-i-1))) sub=string.substring(0,i+1) ;
  }
  return sub;
}
