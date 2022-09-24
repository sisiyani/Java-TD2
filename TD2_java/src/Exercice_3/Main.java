package Exercice_3;

public class Main {
    public static void main(String[] args){
        Expr val = new Value(1337.0);
        System.out.println(val.eval()); //affiche 1337.0
        Expr add = new Add(new Value(327.0), val);
        System.out.println(add.eval()); //affiche 1664.0
        Expr e = new Add(new Value(350.0), add);
        System.out.println(e.eval()); //affiche 2014.0
        Expr e1 = new Mult(e, new Value(2));
        System.out.println(e1.eval()); //affiche 2014.0
        Expr e2 = new Sqrt(new Value(16));
        System.out.println(e2.eval()); //affiche 2014.0
        System.out.println(val.toString());
        System.out.println(add.toString());
        System.out.println(e.toString());
        System.out.println(e1.toString());
        System.out.println(e2.toString());
    }
}
