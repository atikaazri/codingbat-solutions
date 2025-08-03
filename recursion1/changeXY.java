public String changeXY(String str) {
  if(str.length() == 0) return "";
  else if(str.charAt(0) == 'x') return "y"+changeXY(str.substring(1));
  else return String.valueOf(str.charAt(0))+changeXY(str.substring(1));
}