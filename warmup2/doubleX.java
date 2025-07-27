boolean doubleX(String str) {
  boolean result = false;
  for(int i = 0; i<str.length()-1; i++){
    if(str.charAt(i) == 'x'){
      if(str.charAt(i+1) == 'x') result = true;
      break;
    } 
  }
  return result;
}