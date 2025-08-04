public Map<String, Integer> wordCount(String[] strings) {
  Map<String, Integer> map = new HashMap<>();
  for(String s: strings){
    if(map.containsKey(s)) map.put(s, 1+map.get(s));
    else map.put(s, 1);
  }
  return map;
}
