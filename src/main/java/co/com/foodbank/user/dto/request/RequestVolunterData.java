package co.com.foodbank.user.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestVolunterData {

    @NotNull
    @NotBlank
    private String id;

    @NotBlank
    @NotNull
    @Pattern(regexp = "^[0-9]{8,8}$", message = "Only numbers for dni min 8.")
    @Size(min = 8, max = 20, message = "dni must be numeric.")
    public String dni;
}
