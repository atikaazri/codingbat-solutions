public String parenBit(String str) {
  if(str.charAt(0) == '('){
    String news = "";
    int idx = 0;
    while(str.charAt(idx) != ')'){
      idx++;
    }
    return str.substring(0, idx+1);
  }
  else return parenBit(str.substring(1));
}