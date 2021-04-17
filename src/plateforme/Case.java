package plateforme;
import factory.*;
import builder.*;

public class Case {
    private int abscisse;
    private int ordonne;
    private int numberType ;
    private CaseContent type ;

    public Case(int abscisse,int ordonne){
        this.abscisse=abscisse;
        this.ordonne=ordonne;
    }

    public void setAbscisse(int abscisse) {
        this.abscisse = abscisse;
        
    }

    public void setOrdonne(int ordonne) {
        this.ordonne = ordonne;
    }

    public int getAbscisse() {
        return abscisse;
    }

    public int getOrdonne() {
        return ordonne;
    }

    public CaseContent getType() {
        return type;
    }

    public void setNumberType(int numberType) {
        this.numberType = numberType;
    }

    public int getNumberType() {
        return numberType;
    }

    public void setType() {
        type = new RessourcesFactory(numberType,abscisse,ordonne).getCaseType();
    }
}

