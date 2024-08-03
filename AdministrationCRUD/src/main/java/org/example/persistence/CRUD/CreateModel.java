package org.example.persistence.CRUD;

public interface CreateModel <Entity>{
    public Entity create(Entity request);
}
