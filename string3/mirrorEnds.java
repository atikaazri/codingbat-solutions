public String mirrorEnds(String string) {
  String sub = "";
  for(int i = 0; i<string.length(); i++){
    if(string.charAt(i) == string.charAt(string.length()-i-1)) sub+= string.charAt(i);
    else break;
  }
  return sub;

}