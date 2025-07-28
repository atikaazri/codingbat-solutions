public boolean evenlySpaced(int a, int b, int c) {
  if(a<b && b<c) return c-b == b-a;
  else if(a<b && c<a) return a-c==b-a;
  else if(c<b && a<c) return b-c==c-a;
  else if(b<c && c<a) return c-b == a-c;
  else if(a>b && c>a) return a-b == c-a;
  else if(a==b && b==c) return true;
  else return false;
}
