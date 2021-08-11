package co.com.foodbank.user.interfaces;

import java.util.Collection;
import co.com.foodbank.vault.dto.IVault;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.user.v1.model 15/05/2021
 */
public interface IProvider {

    public Long getCuil();

    public String getLegalRepresentation();

    public Collection<IVault> getSucursal();
}
