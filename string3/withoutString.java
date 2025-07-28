public String withoutString(String base, String remove) {
  String news = "";
  for(int i = 0; i<base.length();){
    if(i+remove.length()<=base.length() &&base.toLowerCase().substring(i, i+remove.length()).equals(remove.toLowerCase())) i+=remove.length();
    else{
      news+=String.valueOf(base.charAt(i));
      i++;
    }
    
  }
  return news;
}
