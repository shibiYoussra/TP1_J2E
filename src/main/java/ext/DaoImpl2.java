package ext;

import dao.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public double getDate() {
        System.out.println("Version Capteurs");
        double temp=800;
        return temp;
    }
}
