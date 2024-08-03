package org.example.persistence.imodel;

import org.example.entities.Hiring;
import org.example.persistence.CRUD.CreateModel;
import org.example.persistence.CRUD.DeleteModel;

public interface IModelHiring extends
        CreateModel<Hiring>,
        DeleteModel<Integer>{
}
