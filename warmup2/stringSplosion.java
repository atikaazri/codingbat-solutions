public String stringSplosion(String str) {
  String news = "";
  for (int i= 0; i<str.length(); i++){
    news+= str.substring(0, i+1);
  }
  return news;
}
