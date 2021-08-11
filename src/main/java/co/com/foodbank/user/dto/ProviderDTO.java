package co.com.foodbank.user.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import co.com.foodbank.address.dto.AddressDTO;
import co.com.foodbank.validaton.ValidPassword;
import co.com.foodbank.validaton.ValidateEmail;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.user.dto 10/08/2021
 */
@Data
@NoArgsConstructor
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

    // private Collection<VaultDTO> sucursal;



}
