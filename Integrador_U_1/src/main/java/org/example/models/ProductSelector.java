package org.example.models;

public class ProductSelector  {
    public Resultado selectProduct(String Class ){
        switch (Class){
            case "Ropa":
                Resultado<ProductFactory_Ropa> resultadoRopa=new Resultado<>();
                resultadoRopa.setSucces(true);
                return resultadoRopa;
            case "Vehiculos":
                Resultado<ProductFactory_Vehiculos> resultadoVehiculos=new Resultado<>();
                resultadoVehiculos.setSucces(true);
                return resultadoVehiculos;
            case "Electronica":
                Resultado<ProductFactory_Electronica> resultadoElectronica=new Resultado<>();
                resultadoElectronica.setSucces(true);
                return resultadoElectronica;
            default:
                Resultado<String> resultadoDefault=new Resultado<>();
                resultadoDefault.setSucces(false);
                return resultadoDefault;
        }
    };
}
