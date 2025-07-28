public String plusOut(String str, String word) {
 String news = "";
 for(int i=0; i<str.length();){
   if(i<=str.length()-word.length() && str.substring(i,i+word.length()).equals(word)){
     news+=word;
     i+=word.length();
   }
   else{
     news+="+";
     i++;
   }
 }
 return news;
}
