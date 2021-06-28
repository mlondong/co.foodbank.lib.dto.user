package co.com.foodbank.user.dto;

import java.util.Collection;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import co.com.foodbank.address.dto.AddressDTO;
import co.com.foodbank.validaton.ValidPassword;
import co.com.foodbank.validaton.ValidateEmail;
import co.com.foodbank.vault.dto.VaultDTO;

public class ProviderDTO {

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
    @Size(min = 8, max = 20,
            message = "phone must be numeric between 8 to 20 digits.")
    private String phones;


    @NotNull
    @NotBlank
    @Pattern(regexp = "^[0-9]{12,12}$",
            message = "cuil must be numeric with 12 digits.")
    @Size(min = 12, max = 12)
    public String cuil;

    @NotNull
    @NotBlank
    public String legalRepresentation;

    @Valid
    private AddressDTO address;

    public Collection<VaultDTO> sucursal;


    /**
     * Default constructor
     */
    public ProviderDTO() {}



    /**
     * Constructor with parameters.
     * 
     * @param name
     * @param email
     * @param password
     * @param phones
     * @param cuil
     * @param legalRepresentation
     * @param sucursal
     * @param address
     */
    public ProviderDTO(String name, String email, String password,
            String phones, String cuil, String legalRepresentation,
            Collection<VaultDTO> sucursal, AddressDTO address) {
        super();
        this.name = name;
        this.email = email;
        this.password = password;
        this.phones = phones;
        this.cuil = cuil;
        this.legalRepresentation = legalRepresentation;
        this.sucursal = sucursal;
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

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public String getLegalRepresentation() {
        return legalRepresentation;
    }

    public void setLegalRepresentation(String legalRepresentation) {
        this.legalRepresentation = legalRepresentation;
    }

    public Collection<VaultDTO> getSucursal() {
        return sucursal;
    }

    public void setSucursal(Collection<VaultDTO> sucursal) {
        this.sucursal = sucursal;
    }



}
