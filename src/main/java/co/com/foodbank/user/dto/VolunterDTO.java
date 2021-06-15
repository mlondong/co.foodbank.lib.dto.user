package co.com.foodbank.user.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import co.com.foodbank.address.dto.AddressDTO;
import co.com.foodbank.validaton.ValidPassword;
import co.com.foodbank.validaton.ValidateEmail;
import co.com.foodbank.vehicule.dto.VehiculeDTO;

public class VolunterDTO {

    @NotNull
    @NotBlank
    @Size(min = 8, max = 20,
            message = "Complete your full name, min 8 characters.")
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

    @NotBlank
    @NotNull
    @Pattern(regexp = "^[0-9]{8,8}$", message = "Only numbers for dni min 8.")
    @Size(min = 8, max = 8)
    public String dni;


    @Valid
    public VehiculeDTO vehicule;

    @Valid
    private AddressDTO address;



    /**
     * Default constructor
     */
    public VolunterDTO() {

    }



    /**
     * Constructor with parameters.
     * 
     * @param name
     * @param email
     * @param password
     * @param phones
     * @param dni
     * @param vehicule
     * @param address
     */
    public VolunterDTO(String name, String email, String password,
            String phones, String dni, VehiculeDTO vehicule,
            AddressDTO address) {
        super();
        this.name = name;
        this.email = email;
        this.password = password;
        this.phones = phones;
        this.dni = dni;
        this.vehicule = vehicule;
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


    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
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


    public VehiculeDTO getVehicule() {
        return vehicule;
    }


    public void setVehicule(VehiculeDTO vehicule) {
        this.vehicule = vehicule;
    }



    public String getDni() {
        return dni;
    }



    public void setDni(String dni) {
        this.dni = dni;
    }



}
