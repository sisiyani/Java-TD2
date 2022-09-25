package Exercice_3;

public class Value implements Expr{
    private double val;
    public Value(double val){
        this.val=val;
    }

    @Override
    public double eval() {
        return val;
    }

    public String toString(){
        return Double.toString(val);
    }
}
