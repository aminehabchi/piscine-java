public class CelestialObject{
    public double x;
    public double y;
    public double z;
    public String name;
    public CelestialObject(){
        x=0.0;
        y=0.0;
        z=0.0;
        name="Soleil";
    }
    public CelestialObject(String name,double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
        this.name=name;
    }
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
    public void setZ(double z){
        this.z=z;
    }
    public void setName(String name){
        this.name=name;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return this.y;
    }

    public double getZ(){
        return this.z;
    }

    public String getName(){
        return this.name;
    }

}