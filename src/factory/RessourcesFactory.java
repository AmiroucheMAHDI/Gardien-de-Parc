package factory;

import builder.CaseBuilder;
import builder.CaseContent;
import com.sun.corba.se.spi.legacy.interceptor.UnknownType;
import plateforme.*;
import ressources.*;
import javax.lang.model.type.UnknownTypeException;

public class RessourcesFactory {
    private int caseType,abscisse,ordonne;
    private CaseContent type ;
    public RessourcesFactory(int caseType,int abscisse,int ordonne){
        this.caseType=caseType;
        this.abscisse=abscisse;
        this.ordonne=ordonne ;
    }
    //first push
    public CaseContent getCaseType() {
        switch (caseType){
            case 0 : type =  ( new CaseBuilder()).setArbre(new Arbre(abscisse,ordonne)).getCaseInstance();
            break;
            case 1 : type =  (new CaseBuilder()).setEau(new Eau(abscisse,ordonne)).getCaseInstance();
            break;
            case 2 : type =  (new CaseBuilder()).setGardien(new Gardien(abscisse,ordonne)).getCaseInstance();
            break ;
            case 3 : type =  (new CaseBuilder()).setHerbe(new Herbe(abscisse,ordonne)).getCaseInstance();
            break ;
            case 4 : type =  (new CaseBuilder()).setIntru(new Intru(abscisse,ordonne)).getCaseInstance();
            break ;
            case 5 : type =  (new CaseBuilder()).setMur(new Mur(abscisse,ordonne)).getCaseInstance();
            break ;
            default: type= null;
        }
        return type;
    }
}
