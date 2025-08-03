public List wordsWithoutList(String[] words, int len) {
  ArrayList<String> newWords = new ArrayList<>();
  for(String s: words){
    if(s.length() != len) newWords.add(s);
  }
  return newWords;
}