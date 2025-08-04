public Map<String, String> pairs(String[] strings) {
  Map<String, String> map = new HashMap<>();
  for(String s: strings){
    map.put(String.valueOf(s.charAt(0)), String.valueOf(s.charAt(s.length()-1)));
  }
  return map;
}