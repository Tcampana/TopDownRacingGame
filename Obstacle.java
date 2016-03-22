//This class generates obstacles on the road
public class Obstacle
{
  //code to randomly generate an obstacle
  private boolean randomGen;
  //code to slow the road
  private int slowing;
  
  public Obstacle(boolean randomGen, int slowing)
  {
    this.randomGen = randomGen;
    this.slowing = slowing;
  }
}