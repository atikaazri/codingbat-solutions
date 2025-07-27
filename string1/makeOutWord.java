public String makeOutWord(String out, String word) {
  String news = out.substring(0,2) + word + out.substring(2, out.length());
  return news;
}