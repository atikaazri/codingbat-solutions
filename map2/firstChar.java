public Map<String, String> firstChar(String[] strings) {
  Map<String, String> map = new HashMap<>();
  for(String s: strings){
    if(map.containsKey(String.valueOf(s.charAt(0)))) map.put(String.valueOf(s.charAt(0)), map.get(String.valueOf(s.charAt(0)))+s);
    else map.put(String.valueOf(s.charAt(0)), s);
  }
  return map;
}