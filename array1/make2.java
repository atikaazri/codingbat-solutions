public int[] make2(int[] a, int[] b) {
  if(a.length>=2) return Arrays.copyOfRange(a, 0, 2);
  else if(a.length ==1) return new int[] {a[0], b[0]};
  else return Arrays.copyOfRange(b, 0, 2);
}
