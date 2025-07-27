public String withoutX2(String str) {
  if(str.length()<2) return "";
  boolean first = false;
  boolean second = false;
  if(str.charAt(0) == 'x')first = true;
  if(str.charAt(1) == 'x')second = true;
  if(first && second) return str.substring(2);
  else if(!first && second)return String.valueOf(str.charAt(0)) + str.substring(2);
  else if(first && !second)return  str.substring(1);
  else return str;
  
}
