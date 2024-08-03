package org.example.persistence.imodel;

import org.example.entities.Company;
import org.example.persistence.CRUD.CreateModel;
import org.example.persistence.CRUD.DeleteModel;

public interface IModelCompany extends
        CreateModel<Company>,
        DeleteModel<Integer> {
}
