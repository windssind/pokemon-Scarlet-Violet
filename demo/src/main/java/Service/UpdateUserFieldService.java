package Service;

import Common.R;

public interface UpdateUserFieldService {
    R UpdateField(Integer uid,String FieldName, String value);
}
