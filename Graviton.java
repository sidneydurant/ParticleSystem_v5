// sdurant12
// 11/14/2012

package particlesystem_v5;

public class Graviton {
    
    private float xPos = 0, yPos = 0, xPull = 0, yPull = 0;
    
    public Graviton(){
        this.xPos = 0;
        this.yPos = 0;
        this.xPull = 0;
        this.yPull = 0;
    }
    
    public void setGraviton(float xPos, float yPos, float xPull, float yPull){
        this.xPos = xPos;
        this.yPos = yPos;
        this.xPull = xPull;
        this.yPull = yPull;
    }
    public float getxPos(){
      return xPos;
    }
    public float getyPos(){
      return yPos;
    }
    public float getxPull(){
      return xPull;
    }
    public float getyPull(){
      return yPull;
    }
    
    public void setxPos(float xp){
      xPos = xp;
    }
    public void setyPos(float yp){
      yPos = yp;
    }
    public void setxPull(float xp){
      xPull = xp;
    }
    public void setyPull(float yp){
      yPull = yp;
    }
    
    
}
