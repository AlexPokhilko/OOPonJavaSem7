package Controller;

import Model.ComNum;
import Service.Methods;

public class Operations {

    Methods sv = new Methods();

    public ComNum addition(ComNum a, ComNum b){
        return sv.addition(a, b);
    }

    public ComNum abstraction(ComNum a, ComNum b){
        return sv.abstraction(a, b);
    }

    public ComNum multiplication(ComNum a, ComNum b){
        return sv.multiplication(a, b);
    }

}
