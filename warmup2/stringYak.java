public String stringYak(String str) {
  String news = "";
  for(int i = 0; i<str.length(); ){
    if(i+2<=str.length()-1 && str.charAt(i) == 'y' && str.charAt(i+2) =='k'){
      i+=3;
      continue;
    }
    else{
      news+=str.charAt(i);
      i++;
      
    }
  }
  
  return news;
}
