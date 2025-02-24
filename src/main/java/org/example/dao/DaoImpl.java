package org.example.dao;

public class DaoImpl implements IDao {

    @Override
    public double getData() {
        System.out.println("Database Version");
        return 23;
    }
}
