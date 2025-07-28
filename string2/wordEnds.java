public String wordEnds(String str, String word) {
  String news = "";
  for(int i = 0; i<str.length();){
    if(i<=str.length()-word.length() && str.substring(i,i+word.length()).equals(word)){
      if(i>0) news+=str.charAt(i-1);
      if(i+word.length()<str.length()) news+=str.charAt(i+word.length());
      i+=word.length();
    }
    else{
      i++;
    }
  }
  return news;
}