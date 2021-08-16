package co.com.foodbank.user.dto.response;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Information about Beneficiary.
 * 
 * @author mauricio.londono@gmail.com co.com.foodbank.user.dto.response
 *         16/08/2021
 */

@Data
@NoArgsConstructor
public class BeneficiaryData implements IUserData, Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private String email;
    private String phones;
    private String socialReason;
    private String category;


    @Override
    public String getId() {
        // TODO Auto-generated method stub
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
