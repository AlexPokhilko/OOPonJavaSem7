package Service;


import Model.ComNum;

public class Methods {

    public ComNum addition(ComNum a, ComNum b){

        ComNum z = new ComNum(0, 0);
        z.setX(a.getX() + b.getX());
        z.setY(a.getY() + b.getY());
        System.out.println("Result z = " + z.toString());
        return z;
    }

    public ComNum abstraction(ComNum a, ComNum b){

        ComNum z = new ComNum(0, 0);
        z.setX(a.getX() - b.getX());
        z.setY(a.getY() - b.getY());
        System.out.println("Result z = " + z.toString());
        return z;
    }

    public ComNum multiplication(ComNum a, ComNum b){

        ComNum z = new ComNum(0, 0);
        z.setX(a.getX()*b.getX() - a.getY()*b.getY());
        z.setY(b.getX()*a.getY() + a.getX()*b.getY());
        System.out.println("Result z = " + z.toString());
        return z;
    }

}
