public String middleThree(String str) {
  // String news = String.valueOf(str.charAt(0));
  // news+= String.valueOf(str.charAt(str.length()/2));
  // news+= String.valueOf(str.charAt(str.length()-1));
  String news = str.substring(str.length()/2-1, str.length()/2+2);
  return news;
}
