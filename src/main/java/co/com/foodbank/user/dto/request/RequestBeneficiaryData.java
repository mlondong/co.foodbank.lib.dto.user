package co.com.foodbank.user.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class to represent a minimal information about Beneficiary.
 * 
 * @author mauricio.londono@gmail.com co.com.foodbank.user.dto.request
 *         16/08/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestBeneficiaryData {

    @NotNull
    @NotBlank
    private String id;

    @NotNull
    @NotBlank
    @Size(min = 8, max = 20,
            message = "Complete social reason, size between 8-20 characters")
    private String socialReason;

}
