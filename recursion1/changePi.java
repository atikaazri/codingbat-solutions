public String changePi(String str) {
  if(str.length() == 0 || str.length() == 1) return str;
  else if(str.substring(0,2).equals("pi")) return "3.14"+changePi(str.substring(2));
  else return String.valueOf(str.charAt(0)) + changePi(str.substring(1));
}
