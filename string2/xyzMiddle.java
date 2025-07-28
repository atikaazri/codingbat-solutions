public boolean xyzMiddle(String str) {
  if(str.length()<3) return false;
  //if odd length
  if(str.length()%2 ==1){
    int mid = str.length()/2;
    if(str.substring(mid-1, mid+2).equals("xyz")) return true;
    // if(str.substring(mid-1, mid+2).equals("xyz")) return true;
    return false;
  }
  else{
    int mid = str.length()/2;
    if(str.substring(mid-1, mid+2).equals("xyz")) return true;
    if(str.substring(mid-2, mid+1).equals("xyz")) return true;
    return false;
  }
  
  
  //if even length
}
