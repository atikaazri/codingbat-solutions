public boolean scoresIncreasing(int[] scores) {
  for(int i = scores.length-1; i>0; i--){
    if(scores[i-1]>scores[i]) return false;
  }
  return true;
}