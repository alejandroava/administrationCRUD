package org.example.persistence.imodel;

import org.example.entities.Vacant;
import org.example.persistence.CRUD.CreateModel;
import org.example.persistence.CRUD.DeleteModel;
import org.example.persistence.CRUD.ReadByTitle;
import org.example.persistence.CRUD.UpdateModel;

public interface IModelVacant extends
        CreateModel<Vacant>,
        DeleteModel<Integer>,
        ReadByTitle<Vacant>,
        UpdateModel<Vacant> {
}
