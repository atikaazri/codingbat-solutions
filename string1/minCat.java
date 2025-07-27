public String minCat(String a, String b) {
  int al = a.length();
  int bl = b.length();
  if(al > bl){
    return a.substring(al-bl, al) + b;
  }
  else if(bl>al){
    return a+ b.substring(bl-al, bl);
  }
  else{
    return a+b;
  }
}