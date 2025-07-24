public String front3(String str) {
  if(str.length()<=3) return str+str+str;
  String three = str.substring(0,3);
  String news = three+three+three;
  return news;
}
