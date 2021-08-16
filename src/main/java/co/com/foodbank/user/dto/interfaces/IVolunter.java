package co.com.foodbank.user.dto.interfaces;

import co.com.foodbank.vehicule.dto.interfaces.IVehicule;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.user.v1.model 15/05/2021
 */
public interface IVolunter {

    public Long getDni();

    public IVehicule getVehicule();
}
