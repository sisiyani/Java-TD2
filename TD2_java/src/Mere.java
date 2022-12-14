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
        ((Fille)mereFille).miage();//On a red??fini le type d'objet pour appeler la m??thode fille
        mere.a();// Affichage de mere_a
        mereFille.a();// On appelle la m??thode de la classe fille car l'instance est Fille
        fille.a();// On appelle la m??thode a de fille
        ((Mere)mereFille).a();/// On appelle la m??thode de la classe fille car l'instance est Fille . Le cast ne sert ?? rien car le type est d??j?? M??re
        mereFille.b(null);// On appelle la m??thode de la classe fille car l'instance est Fille

        mereFille.c();//  La m??thode c avec ce profile est dans la classe mere
        mereFille.c(mere);//  La m??thode c avec ce profile est dans la classe fille. Dans le profile, le param??tre est de type Mere
        mereFille.c(mereFille);//  La m??thode c avec ce profile est dans la classe fille. Dans le profile, le param??tre est de type Mere
        mereFille.c(fille);//  La m??thode c avec ce profile est dans la classe fille. Dans le profile, le param??tre est de type Mere

        mere.d();// m??thode statique donc on prend m??re
        mereFille.d();// m??thode statique donc on prend m??re

        mere.printF();// m??thode propre ?? la classe M??re
        mereFille.printF();// m??thode propre ?? la classe M??re

        mereFille.j();// On appelle la m??thode red??finie car l'instance affect?? est de type Fille
        mereFille.k();// m??thode propre ?? la classe M??re
        mereFille.l();// On appelle la m??thode red??finie car l'instance affect?? est de type Fille
        mereFille.m();// On appelle la m??thode red??finie car l'instance affect?? est de type Fille
    }
}