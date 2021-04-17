package builder;
import ressources.*;

public class CaseContent {
    private Arbre arbre ;
    private Eau eau ;
    private Gardien gardien ;
    private Herbe herbe ;
    private Intru intru ;
    private Mur mur ;

    public CaseContent(Arbre arbre, Eau eau, Gardien gardien, Herbe herbe, Intru intru, Mur mur){
        this.arbre=arbre;
        this.eau=eau;
        this.gardien=gardien;
        this.herbe=herbe;
        this.intru=intru;
        this.mur=mur;
    }
}
