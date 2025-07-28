public int caughtSpeeding(int speed, boolean isBirthday) {
  if(isBirthday &&speed<=65) return 0;
  else if(isBirthday &&speed<=85) return 1;
  else if(isBirthday &&speed>85) return 2;
  else if(!isBirthday &&speed<=60) return 0;
  else if(!isBirthday &&speed<=80) return 1;
  else return 2; //if(!isBirthday &&speed>80)
}
