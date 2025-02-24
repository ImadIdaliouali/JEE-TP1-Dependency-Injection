package org.example.dao;

import org.springframework.stereotype.Component;

@Component
public class DaoImpl implements IDao {

    @Override
    public double getData() {
        System.out.println("Database Version");
        return 23;
    }
}
