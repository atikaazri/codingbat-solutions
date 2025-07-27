public String lastChars(String a, String b) {
  if( a.length() == 0&& b.length() == 0) return "@@";
  else if(a.length() ==0 &&  b.length() != 0) return  "@" +String.valueOf(b.charAt(b.length()-1));
  else if(b.length() ==0 &&  a.length() != 0) return  String.valueOf(a.charAt(0)) + "@";
  else return String.valueOf(a.charAt(0)) +String.valueOf(b.charAt(b.length()-1));
}