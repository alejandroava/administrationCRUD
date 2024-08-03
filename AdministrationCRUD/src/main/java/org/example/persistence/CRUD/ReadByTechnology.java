package org.example.persistence.CRUD;

import java.util.List;

public interface ReadByTechnology <Entity>{
    public List<Entity> readByTechnology(String technology);
}
