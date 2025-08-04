public List<String> noX(List<String> strings) {
  strings.replaceAll(x ->clean(x));
  return strings;
}
public String clean(String x){
  String news="";
  for(int i = 0; i<x.length(); i++){
    if(x.charAt(i)!='x') news+=String.valueOf(x.charAt(i));
  }
  return news;
}