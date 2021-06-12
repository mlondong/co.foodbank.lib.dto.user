package co.com.foodbank.user.model;

import co.com.foodbank.vehicule.dto.IVehicule;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.user.v1.model 15/05/2021
 */
public interface IVolunter {

    public Long getDni();

    public IVehicule getVehicule();
}
