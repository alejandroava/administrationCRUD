package org.example.persistence.CRUD;

import java.util.List;

public interface ReadByClan <Entity>{
    public List<Entity> readByClan(String clan);
}
