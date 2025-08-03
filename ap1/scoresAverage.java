public int scoresAverage(int[] scores) {
  int mid = scores.length/2;
  return Math.max(average(scores, 0, mid), average(scores, mid, scores.length));
}
int average(int[] scores, int start, int end){
  int sum = 0;
  for(int i = start; i<end; i++)
    sum+=scores[i];
  return sum/ (end-start);
  
}