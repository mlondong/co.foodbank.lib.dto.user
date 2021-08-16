package co.com.foodbank.user.dto.response;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class information general about User.
 * 
 * @author mauricio.londono@gmail.com co.com.foodbank.user.response 13/08/2021
 */

@Data
@NoArgsConstructor
public class UserData implements Serializable, IUserData {

    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private String email;
    private String phones;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPhones() {
        return phones;
    }



}
