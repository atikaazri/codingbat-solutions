public String doubleChar(String str) {
  String news = "";
  for(int i =0; i<str.length(); i++){
    news+= str.charAt(i);
    news+= str.charAt(i);
  }
  return news;
}