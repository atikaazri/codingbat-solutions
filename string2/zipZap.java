public String zipZap(String str) {
  String news = "";
  if(str.length()<3) return str;
  for(int i = 0; i<str.length()-2;){
    if(str.charAt(i) == 'z' && str.charAt(i+2) == 'p'){
      news+= String.valueOf(str.charAt(i))+ String.valueOf(str.charAt(i+2));
      i+=3;
    }
    else{
      if(i== str.length()-3) {news+= str.substring(i); break;}
      else{
        news+= String.valueOf(str.charAt(i));
        i++;
      }
      
    }
  }
  return news;

}