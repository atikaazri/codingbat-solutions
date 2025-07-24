public String frontBack(String str) {
  if(str.length()<2)return str;
  String news = "";
  char first = str.charAt(0);
  news+= str.charAt(str.length()-1);
  news+=str.substring(1,str.length()-1);
  news+=first;
  return news;
}
