
package boletin3.programacion;

//@author BraisDiaz
public class Consumo {
    //declaro atributos
    private float kilometros,litrosconsumidos,velocidadMedia,precioGasolina;
//    //constructor por defecto
    public Consumo(){
        kilometros = 0;
        litrosconsumidos = 0;
        velocidadMedia = 0;
        precioGasolina = 0;
    }
    //constructor con parámetros
    public Consumo(float km, float litros, float vMed, float pGas){
        
        kilometros = km;
        litrosconsumidos = litros;
        velocidadMedia = vMed;
        precioGasolina = pGas;
    }
    //creamos método de acceso
    public float getTiempo(){
        return (kilometros/velocidadMedia);
    }
    public float getConsumoMedio(){
        return (litrosconsumidos/kilometros)*100;
    }
    public float getConsumoEuros(){
        return (litrosconsumidos * precioGasolina);
    }
    public void setKm(float km){
        kilometros = km;
    }
    public void setLitros (float litros){
        litrosconsumidos = litros;
    }
    public void setVelocidadMedia (float vMed){
        velocidadMedia = vMed;
    }
    public void setPrecioGasolina (float pGas){
        precioGasolina = pGas;
    }
    //creo el método para poder visualizar la velocidad media
    public float getVelocidadMedia(){
        return velocidadMedia;
    }
}

