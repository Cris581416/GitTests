package psuedomotor;

public class Motor {
    private int port;
    private boolean following = false;
    private double speed;
    private Motor leader;

    public Motor(int port){
        this.port = port;
    }

    public void setSpeed(double speed){
        if(!following){
            if(speed > 1.0){
                speed = 1.0;
            } else if(speed < -1.0){
                speed = -1.0;
            }
        } else if(following) {
            speed = leader.speed;
        }
        this.speed = speed;
        System.out.println(this.speed);
    }

    public void follow(Motor motor){
        leader = motor;
        following = true;
    }
}
