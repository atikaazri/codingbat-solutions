public int makeChocolate(int small, int big, int goal) {
  int bs = goal/5; //how many big bricks i can use
  if(bs<=big) goal-=bs*5;
  else goal-=big*5;
  if(goal<=small) 
    return goal;
  // if(goal==0) return true;
  return -1;
}
