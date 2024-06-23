package Model;

public class ComNum{

    private double x;
    private double y;

    public ComNum(){}
    
    public ComNum(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // private char signY;

    private char getSignY(double y){
        if (y<0){
            return '-';
        }
        return '+';
    }

    @Override
    public String toString() {
        return "Complex number " + this.getX() + " " + this.getSignY(this.getY()) + " " + "i" +Math.abs(this.getY());
    }
}