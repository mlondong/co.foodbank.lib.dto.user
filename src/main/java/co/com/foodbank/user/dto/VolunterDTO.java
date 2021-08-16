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
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.user.dto 10/08/2021
 */
@Data
@NoArgsConstructor
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
    @Size(min = 8, max = 20, message = "dni must be numeric.")
    public String dni;


    @Valid
    public VehiculeDTO vehicule;

    @Valid
    private AddressDTO address;


}
