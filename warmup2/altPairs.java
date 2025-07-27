public String altPairs(String str) {
  int[] idx = new int[] {0, 1, 4, 5, 8, 9};
  String news = "";
  for (int i=0; i<str.length(); i++){
    if(i%4 == 0 || i%4 == 1) news+=str.charAt(i);
  }
  return news;
}
