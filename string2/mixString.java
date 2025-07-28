public String mixString(String a, String b) {
  int i = 0;
  int j = 0;
  String news = "";
  while(i<a.length() && j<b.length()){
    news+=String.valueOf(a.charAt(i));
    news+=String.valueOf(b.charAt(j));
    i++; j++;
  }
  while (i<a.length()) {
    news+=String.valueOf(a.charAt(i));
    i++;
  }
  while(j<b.length()){
    news+=String.valueOf(b.charAt(j));
    j++;
  }
  return news;
}