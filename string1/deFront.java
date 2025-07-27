public String deFront(String str) {    
  boolean first = false;
  boolean second = false;
  if(str.charAt(0) == 'a') first = true;
  if(str.charAt(1) == 'b') second = true;
  if(first && !second) return 'a' + str.substring(2);
  else if(!first && second) return 'b'+ str.substring(2);
  else if( first && second) return "ab" + str.substring(2);
  else return str.substring(2);
}
