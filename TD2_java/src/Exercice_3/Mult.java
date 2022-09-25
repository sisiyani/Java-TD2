package Exercice_3;

public class Mult implements Expr{

    private Expr e1;
    private Expr e2;

    public Mult(Expr e1, Expr e2){
        this.e1=e1;
        this.e2=e2;
    }

    @Override
    public double eval() {
        return e1.eval()*e2.eval();
    }

    public String toString(){
        return "("+e1.toString()+"*"+e1.toString()+")";
    }
}
