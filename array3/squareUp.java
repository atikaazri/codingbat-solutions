public int[] squareUp(int n) {
  int[] arr= new int[n*n];
  int idx = 0;
  for(int i = 1; i<=n; i++){
    for(int j = n; j>0; j--){
      if(j>i) arr[idx] = 0;
      else arr[idx] = j;
      idx++;
    }
  }
  return arr;
}
