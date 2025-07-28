public boolean endOther(String a, String b) {
  if(a.length() <b.length()){
    if(b.substring(b.length()-a.length(), b.length()).toLowerCase().equals(a.toLowerCase())) return true;
    return false;
  }
  else if(a.length() > b.length()){
    if(a.substring(a.length()-b.length(), a.length()).toLowerCase().equals(b.toLowerCase())) return true;
    return false;
  }
  else return a.equals(b);
}