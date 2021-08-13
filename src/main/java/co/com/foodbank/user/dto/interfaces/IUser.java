package co.com.foodbank.user.dto.interfaces;

import co.com.foodbank.address.dto.interfaces.IAddress;

/**
 * Interface IUser to handle methods getters in User.
 * 
 * @author mauricio.londono@gmail.com co.com.foodbank.user.model 14/05/2021
 */

public interface IUser {

    public String getId();

    public String getEmail();

    public String getPassword();

    public boolean isState();

    public String getName();

    public String getPhones();

    public IAddress getAddress();

}
