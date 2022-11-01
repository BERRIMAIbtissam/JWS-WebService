package metier;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    String code;
    double solde;
    @XmlTransient
    Date dateCreation;

    public Compte() {

    }

    public Compte(String code, double solde, Date dateCreation) {

        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
