public class Road
{
  /* In this program, the road accellerates, instead of the car.
   * The car always stays in the center of the screen, and doesn't actually move except when steering left
   * and right.*/
  private int accel;
  //Generates a left turn in the road
  private boolean curveL = false;
  //Generates a right turn in the road
  private boolean curveR = false;
  //Creates sections of straight road in between turns
  private int straight;

  public Road(int accel, boolean curveL, boolean curveR, int straight)
  {
    this.accel = accel;
    this.curveL = curveL;
    this.curveR = curveR;
    this.straight = straight;
  }
  //Get and set methods
  public int getAccel()
  {
    return accel;
  }
//*************************************
    public int getStraight()
  {
    return straight;
  }
//*************************************
  public void applyGas(int increment)
  {
    accel += increment;
  }
//*************************************
  public void applyBrake(int decrement)
  {
    accel -= decrement;
  }
}
