import java.io.IOException;

class Mere {
    public void a() {System.out.println("Mere_a"); }
    void b(Fille fille) {System.out.println("Mere_b(Fille)");}

    void c() {System.out.println("Mere_c");}
    void c(Mere mere) {System.out.println("Mere_c(Mere)"); }

    static void d() {System.out.println("static Mere_d");}

    protected void e() {System.out.println("Mere_e");}
    private void f() {System.out.println("Mere_f");}
    public void printF() { f(); }

    Object g() {System.out.println("Mere_g"); return 2;}
    int h() {System.out.println("Mere_h"); return 2;}
    void i() {System.out.println("Mere_i");}

    void j() throws Exception {System.out.println("Mere_j");  }
    void k() throws IOException {System.out.println("Mere_k");  }
    void l() throws Exception {System.out.println("Mere_l");  }
    void m() throws Exception, ArrayIndexOutOfBoundsException {System.out.println("Mere_m");  }

}
class Fille extends Mere{
    void miage() {System.out.println("Miage");}

    public void a() {System.out.println("Fille_a"); }

    protected void b(Fille fille) {System.out.println("Fille_b(Fille)");}

    public void c(Mere mere) {System.out.println("Fille_c(Mere)");}
    void c(Fille b) {System.out.println("Fille_c(Fille)"); }

    static void d() {System.out.println("static Fille_d");}
    static void d(Mere mere) {System.out.println("Fille_d(Mere)");}

    //private void e() {System.out.println("Fille_e");}
    protected void f() {System.out.println("Fille_f");}

    String g() {System.out.println("Fille_g"); return "c";}



    void j() throws IOException {System.out.println("Fille_j");  }

    void l() {System.out.println("Fille_l");}
    void m() throws IOException, IllegalArgumentException {System.out.println("Fille_m");  }



    public static void main(String[] args) throws Exception {
        Mere mere=new Mere();
        Mere mereFille=new Fille();
        Fille fille=new Fille();
        fille.miage();// Affichage de miage
        ((Fille)mereFille).miage();//On a redéfini le type d'objet pour appeler la méthode fille
        mere.a();// Affichage de mere_a
        mereFille.a();// On appelle la méthode de la classe fille car l'instance est Fille
        fille.a();// On appelle la méthode a de fille
        ((Mere)mereFille).a();/// On appelle la méthode de la classe fille car l'instance est Fille . Le cast ne sert à rien car le type est déjà Mère
        mereFille.b(null);// On appelle la méthode de la classe fille car l'instance est Fille

        mereFille.c();//  La méthode c avec ce profile est dans la classe mere
        mereFille.c(mere);//  La méthode c avec ce profile est dans la classe fille. Dans le profile, le paramètre est de type Mere
        mereFille.c(mereFille);//  La méthode c avec ce profile est dans la classe fille. Dans le profile, le paramètre est de type Mere
        mereFille.c(fille);//  La méthode c avec ce profile est dans la classe fille. Dans le profile, le paramètre est de type Mere

        mere.d();// méthode statique donc on prend mère
        mereFille.d();// méthode statique donc on prend mère

        mere.printF();// méthode propre à la classe Mère
        mereFille.printF();// méthode propre à la classe Mère

        mereFille.j();// On appelle la méthode redéfinie car l'instance affecté est de type Fille
        mereFille.k();// méthode propre à la classe Mère
        mereFille.l();// On appelle la méthode redéfinie car l'instance affecté est de type Fille
        mereFille.m();// On appelle la méthode redéfinie car l'instance affecté est de type Fille
    }
}