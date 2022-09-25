package Exercice_3;

public class Sqrt implements Expr{
    private Expr val;

    public Sqrt(Expr e){
        this.val=e;
    }
    @Override
    public double eval() {
        return Math.sqrt(val.eval());
    }

    public String toString(){
        return "\u221a("+val.toString()+")";
    }
}
