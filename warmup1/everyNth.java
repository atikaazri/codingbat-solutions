public String everyNth(String str, int n) {
  String news = "";
  int i = 0;
  while(i<str.length()){
    news+=str.charAt(i);
    i+=n;
  }
  return news;
}
