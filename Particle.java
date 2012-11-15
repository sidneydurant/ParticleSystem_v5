// sdurant12
// 11/14/2012

package particlesystem_v5;

public class Particle {
    
    private float xPos, yPos, xVel, yVel;
    private float pxVel, pyVel;
    private int age = 0;
    
    public void setParticle(float xPos, float yPos, float xVel, float yVel){
        this.xPos = xPos;
        this.yPos = yPos;
        this.xVel = xVel;
        this.yVel = yVel;
    }
    public float getxPos(){
      return xPos;
    }
    public float getyPos(){
      return yPos;
    }
    public float getxVel(){
      return xVel;
    }
    public float getyVel(){
      return yVel;
    }
    public float getpxVel(){
      return pxVel;
    }
    public float getpyVel(){
      return pyVel;
    }
    public int getAge(){
      return age;
    }
    
    public void setxPos(float xp){
      xPos = xp;
    }
    public void setyPos(float yp){
      yPos = yp;
    }
    public void setxVel(float xv){
      xVel = xv;
    }
    public void setyVel(float yv){
      yVel = yv;
    }
    public void setpxVel(float pxv){
      pxVel = pxv;
    }
    public void setpyVel(float pyv){
      pyVel = pyv;
    }
    public void setAge(int a){
      age = a;
    }
    
}