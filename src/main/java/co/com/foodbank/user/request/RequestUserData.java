package co.com.foodbank.user.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import co.com.foodbank.validaton.ValidateEmail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.user.model 9/08/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestUserData {


    @NotNull
    @NotBlank
    @Size(min = 8, max = 20,
            message = "Complete your full name, size between 8-20 characters")
    private String name;

    @NotNull
    @NotBlank
    @ValidateEmail
    private String email;


    @NotNull
    @NotBlank
    @Size(min = 8, max = 20,
            message = "phone must be numeric between 8 to 20 digits.")
    private String phones;



}
