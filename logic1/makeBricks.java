public boolean makeBricks(int small, int big, int goal) {
  int bs = goal/5; //how many big bricks i can use
  if(bs<=big) goal-=bs*5;
  else goal-=big*5;
  int sms = goal;
  if(sms<=small) goal-=sms;
  else goal-=small;
  if(goal==0) return true;
  return false;
}