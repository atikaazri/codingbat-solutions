public String oneTwo(String str) {
  String news = "";
  for(int i = 0; i<str.length(); i+=3){
    if(i+2<str.length()){
    news+=str.substring(i+1,i+3);
    news+=String.valueOf(str.charAt(i));
    }
    /*else{
      news+=str.substring(i);
    }*/
  }
  return news;
}
