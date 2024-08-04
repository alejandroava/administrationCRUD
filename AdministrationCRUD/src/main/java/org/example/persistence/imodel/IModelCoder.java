package org.example.persistence.imodel;

import org.example.entities.Coder;
import org.example.persistence.CRUD.*;

public interface IModelCoder extends
        CreateModel<Coder>,
        ReadByClan<Coder>,
        ReadByCohorte<Coder>,
        UpdateModel<Coder>,
        DeleteModel<Coder> {
}
