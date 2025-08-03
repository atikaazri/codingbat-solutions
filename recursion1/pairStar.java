public String pairStar(String str) {
  if(str.length() ==0) return "";
  else if(str.length() ==1) return str;
  else if(str.charAt(0) == str.charAt(1)) return String.valueOf(str.charAt(0)) + "*" + pairStar(str.substring(1));
  else return str.charAt(0) + pairStar(str.substring(1));
}