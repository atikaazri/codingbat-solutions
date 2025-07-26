public String startOz(String str) {
  String news= "";
  if(str.length()>0){
    if(str.charAt(0) == 'o') news+='o';
  }
  if(str.length()>1){
    if(str.charAt(1) == 'z') news+='z';
  }
  return news;
  
}
