package co.com.foodbank.user.dto.response;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class information about Volunteer.
 * 
 * @author mauricio.londono@gmail.com co.com.foodbank.user.dto.response
 *         16/08/2021
 */
@Data
@NoArgsConstructor
public class VolunteerData implements IUserData {


    private String id;
    private String name;
    private String email;
    private String phones;
    private String dni;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public String getEmail() {
        // TODO Auto-generated method stub
        return email;
    }

    @Override
    public String getPhones() {
        // TODO Auto-generated method stub
        return phones;
    }

}
