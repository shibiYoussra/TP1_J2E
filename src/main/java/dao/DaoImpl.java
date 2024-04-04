package dao;

public class DaoImpl implements IDao{

    @Override
    public double getDate() {
        System.out.println("Version base de données");
        double data=66;
        return data;
    }
}
