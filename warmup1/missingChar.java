public String missingChar(String str, int n) {
  String mod = str.substring(0, n) + str.substring(n+1);
  return mod;
}
