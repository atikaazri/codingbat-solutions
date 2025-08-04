public String[] allSwap(String[] strings) {
  Map<String, Integer> map = new HashMap<>();
  for (int i = 0; i<strings.length; i++){
    if(map.containsKey(String.valueOf(strings[i].charAt(0)))){
      String s = strings[map.get(String.valueOf(strings[i].charAt(0)))];
      strings[map.get(String.valueOf(strings[i].charAt(0)))] = strings[i];
      strings[i] =s;
      map.remove(String.valueOf(strings[i].charAt(0)));
    }
    else{
      map.put(String.valueOf(strings[i].charAt(0)), i);
    }
  }
  return strings;
}
