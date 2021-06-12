package co.com.foodbank.user.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import co.com.foodbank.address.dto.AddressDTO;
import co.com.foodbank.validaton.ValidPassword;
import co.com.foodbank.validaton.ValidateEmail;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.user.dto 16/05/2021
 */
public class BeneficiaryDTO {

    @NotNull
    @NotBlank
    @Size(min = 8, max = 20, message = "Complete your full name.")
    private String name;

    @NotNull
    @NotBlank
    @ValidateEmail
    private String email;

    @ValidPassword
    private String password;

    @NotNull
    @NotBlank
    @Size(min = 8, max = 20)
    private String phones;

    @NotNull
    @NotBlank
    public String socialReason;

    @NotNull
    @NotBlank
    public String category;

    @NotNull
    @NotBlank
    public String size;

    @Valid
    private AddressDTO address;



    /**
     * Default constructor.
     */
    public BeneficiaryDTO() {

    }


    /**
     * Constructor with fields.
     * 
     * @param name
     * @param email
     * @param password
     * @param phones
     * @param socialReason
     * @param category
     * @param size
     */
    public BeneficiaryDTO(String name, String email, String password,
            String phones, String socialReason, String category, String size,
            AddressDTO address) {
        super();
        this.name = name;
        this.email = email;
        this.password = password;
        this.phones = phones;
        this.socialReason = socialReason;
        this.category = category;
        this.size = size;
        this.address = address;
    }


    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhones() {
        return phones;
    }

    public void setPhones(String phones) {
        this.phones = phones;
    }


    public String getSocialReason() {
        return socialReason;
    }


    public void setSocialReason(String socialReason) {
        this.socialReason = socialReason;
    }


    public String getCategory() {
        return category;
    }


    public void setCategory(String category) {
        this.category = category;
    }


    public String getSize() {
        return size;
    }


    public void setSize(String size) {
        this.size = size;
    }



}
