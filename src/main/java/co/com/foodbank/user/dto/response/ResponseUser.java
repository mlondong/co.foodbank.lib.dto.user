package co.com.foodbank.user.dto.response;

import java.io.Serializable;
import co.com.foodbank.address.dto.interfaces.IAddress;
import co.com.foodbank.user.dto.interfaces.IUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.user.response 13/08/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseUser implements IUser, Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private String email;
    private String password;
    private String phones;
    private boolean state;
    private IAddress address;



    @Override
    public String getId() {
        // TODO Auto-generated method stub
        return id;
    }

    @Override
    public String getEmail() {
        // TODO Auto-generated method stub
        return email;
    }

    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return password;
    }

    @Override
    public boolean isState() {
        // TODO Auto-generated method stub
        return state;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public String getPhones() {
        // TODO Auto-generated method stub
        return phones;
    }

    @Override
    public IAddress getAddress() {
        // TODO Auto-generated method stub
        return address;
    }

}
