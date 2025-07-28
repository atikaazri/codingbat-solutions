public String repeatSeparator(String word, String sep, int count) {
  String news = "";
  if(count ==0) return "";
  for(int i =0; i<count-1; i++){
    news+=word +sep;
  }
  return news+word;
}
