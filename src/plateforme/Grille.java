package plateforme;

public class Grille {

    private int nbrLine ;
    private int nbrCol ;
    private int nbrDeGardien;
    private int nbrMur;
    private int nbrEau;
    private Case[][] grille;

public Grille(int nbrLine,int nbrCol){
    //constructeur
    this.nbrCol=nbrCol;
    this.nbrLine=nbrLine;

}

    public int getNbrCol() {
        return nbrCol;
    }

    public void setNbrCol(int nbrCol) {
        this.nbrCol = nbrCol;
    }

    public int getNbrLine() {
        return nbrLine;
    }

    public void setNbrLine(int nbrLine) {
        this.nbrLine = nbrLine;
    }

    public int getNbrDeGardien() {
        return nbrDeGardien;
    }

    public void setNbrDeGardien(int nbrDeGardien) {
        this.nbrDeGardien = nbrDeGardien;
    }

    public int getNbrEau() {
        return nbrEau;
    }

    public void setNbrEau(int nbrEau) {
        this.nbrEau = nbrEau;
    }

    public int getNbrMur() {
        return nbrMur;
    }

    public void setNbrMur(int nbrMur) {
        this.nbrMur = nbrMur;
    }
}
