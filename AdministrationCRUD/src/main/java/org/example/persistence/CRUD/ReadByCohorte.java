package org.example.persistence.CRUD;

import java.util.List;

public interface ReadByCohorte <Entity>{
    public List<Entity> readByCohorte(int cohorte);
}
