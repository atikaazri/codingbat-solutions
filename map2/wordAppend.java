public String wordAppend(String[] strings) {
  Map<String, Integer> map = new HashMap<>();
  String news = "";
  for(String s: strings){
    if(map.containsKey(s)) {
      news+=s;
      map.remove(s);
    }
    else map.put(s, 1);
  }
  return news;
}
