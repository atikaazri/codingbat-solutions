public String lastTwo(String str) {
  if(str.length()<2) return str;
  return str.substring(0, str.length()-2) + String.valueOf(str.charAt(str.length()-1)) +String.valueOf(str.charAt(str.length()-2));
}