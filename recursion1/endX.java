public String endX(String str) {
  if(str.length() == 0) return str;
  else if (str.length() == 1) return str;
  else if (str.charAt(0) == 'x') return endX(str.substring(1)) +"x";
  else return String.valueOf(str.charAt(0)) +endX(str.substring(1));
}
