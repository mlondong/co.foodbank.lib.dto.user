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
public class RequestProviderData {

    @NotNull
    @NotBlank
    private String id;

    @NotNull
    @NotBlank
    @Pattern(regexp = "^[0-9]{12,12}$",
            message = "cuil must be numeric with 12 digits.")
    @Size(min = 12, max = 12)
    public String cuil;
}
