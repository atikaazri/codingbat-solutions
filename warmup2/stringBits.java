public String stringBits(String str) {
  String news = "";
  for(int i = 0; i<str.length(); i+=2){
    news+=str.charAt(i);
  }
  return news;
}