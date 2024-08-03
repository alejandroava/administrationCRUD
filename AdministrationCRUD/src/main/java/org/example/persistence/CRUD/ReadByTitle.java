package org.example.persistence.CRUD;

import java.util.List;

public interface ReadByTitle <Entity>{
    public List<Entity> readByTitle(String title);
}
