package ws;


import metier.Compte;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.Date;


@WebService(serviceName = "BanqueWS")
public class BanqueService {

    @WebMethod(operationName = "ConversionEnEuro")
    public double convertToEuro(@WebParam(name = "montant") double mt)
    {
        return mt*11;
    }

     @WebMethod
    public Compte getCompte(@WebParam(name = "code") String code)
    {
        return new Compte(code,Math.random()*988, new Date());
    }



}
