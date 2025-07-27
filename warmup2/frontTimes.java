public String frontTimes(String str, int n) {
  String news = "";
  for(int i = 0; i<n; i++){
    news+=str.substring(0, Math.min(str.length(), 3));
  }
  return news;
}