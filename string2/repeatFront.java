public String repeatFront(String str, int n) {
  String news = "";
  for(int i=0; i<n; i++){
    news+=str.substring(0, n-i);
  }
  return news;
}
