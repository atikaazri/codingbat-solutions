public String[] wordsWithout(String[] words, String target) {
  int count = 0;
  for(String s: words) if(!s.equals(target)) count++;
  String[] newWords = new String[count];
  int idx = 0;
  for(String s: words){
    if(!s.equals(target)){
      newWords[idx] = s;
      idx++;
    }
  }
  return newWords;
}
