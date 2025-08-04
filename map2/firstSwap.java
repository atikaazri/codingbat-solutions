public String[] firstSwap(String[] strings) {
  Map<String, Integer> map = new HashMap<>();
  for (int i = 0; i<strings.length; i++){
    if(map.containsKey(String.valueOf(strings[i].charAt(0)))){
      if(map.get(String.valueOf(strings[i].charAt(0))) ==-1) continue;
      String s = strings[map.get(String.valueOf(strings[i].charAt(0)))];
      strings[map.get(String.valueOf(strings[i].charAt(0)))] = strings[i];
      strings[i] =s;
      map.put(String.valueOf(strings[i].charAt(0)), -1);
    }
    else{
      map.put(String.valueOf(strings[i].charAt(0)), i);
    }
  }
  return strings;

}
