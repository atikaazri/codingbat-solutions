public String[] mergeTwo(String[] a, String[] b, int n) {
  int i =0; int j =0; int idx = 0;
  String[] arr = new String[n];
  while(idx<n){
    if(a[i].compareTo(b[j])<0){
      arr[idx] = a[i];
      i++;
    }
    else if(a[i].compareTo(b[j]) == 0){
      arr[idx] = a[i];
      i++;
      j++;
    }
    else{
      arr[idx] = b[j];
      j++;
    }
    idx++;
  }
  return arr;
}
