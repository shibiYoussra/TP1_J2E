package Metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier{
    @Autowired
/*Couplage Faible*/
    private IDao dao;
    @Override
    public double calcul() {
        double t=dao.getDate();
        double res=t*66;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
