public boolean parrotTrouble(boolean talking, int hour) {
  if(talking) return hour < 7 || hour >20;
  return false;
  
  
}