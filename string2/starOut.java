public String starOut(String str) {
  String news = "";
  for(int i= 0; i<str.length(); i++){
    if(str.charAt(i) == '*') continue;
    else if(i>=1 && str.charAt(i-1) == '*') continue;
    else if (i<str.length()-1 && str.charAt(i+1) == '*') continue;
    else{
      news+= String.valueOf(str.charAt(i));
    }
  }
  return news;
}
