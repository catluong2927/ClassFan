public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    int speed = SLOW;
    private boolean on = false;
    private int radius = 5;
    private String color = "blue";

    public Fan(int speed, boolean on, int radius,String color){
        this.speed =speed;
        this.on = on;
        this.radius =radius;
        this.color =color;
    }

    public String getSpeed() {
        return (speed ==1)?"Slow" : (speed == 2)? "medium" : "fast";
    }

    public boolean isOn() {
        return on;
    }

    public int getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return (on == true)? "speed: "+this.getSpeed()+", color: "+this.getColor()+", radius: "+this.getRadius()+", fan is on" : "speed: "+this.getSpeed()+", color: "+this.getColor()+", radius: "+this.getRadius()+", fan is off";
    }
}
