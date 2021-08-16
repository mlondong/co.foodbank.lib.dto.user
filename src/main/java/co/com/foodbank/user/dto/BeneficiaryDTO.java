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
 * @author mauricio.londono@gmail.com co.com.foodbank.user.dto 16/05/2021
 */
@Data
@NoArgsConstructor
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
    @Pattern(regexp = "^[0-9]{0,20}$", message = "Phone only numbers.")
    @Size(min = 8, max = 20,
            message = "phone must be numeric between 8 to 20 digits.")
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


}
