public String repeatEnd(String str, int n) {
  String news = "";
  for(int i=0; i<n; i++){
    news+=str.substring(str.length()-n);
  }
  return news;
}
