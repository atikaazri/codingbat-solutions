public String stringX(String str) {
  String news = "";
  if(str.length()<=2) return str;
  news+=str.charAt(0);
  for(int i =1; i<str.length()-1; i++){
    if(str.charAt(i) !='x'){
      news+=str.charAt(i);
    }
  }
  news+=str.charAt(str.length()-1);
  return news;
}
