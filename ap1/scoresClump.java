public boolean scoresClump(int[] scores) {
  for(int i = scores.length-1; i>1; i--){
    if(scores[i] - scores[i-2] <=2) return true;
  }
  return false;
}