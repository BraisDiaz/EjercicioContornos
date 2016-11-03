
package boletin3.programacion;

import javax.swing.JOptionPane;
//@author BraisDiaz
public class Boletin3Programacion {

    public static void main(String[] args) {
    //creamos el objeto consume con el constructor por defecto.
    Consumo consume = new Consumo();
    //damos valores a litros y precio de gasolina
    consume.setLitros(50f);
    consume.setPrecioGasolina(1.57f);
    //creamos el objeto consume2 utilizando el constructor con parámetros
    //Consumo consume2 = new Consumo(100f,6.5f,57f,1.14f);
    //visualizamos a traves del objeto consume2 el consumo medio en litros cada 100 km
    //visalizamos a traves del objeto consume 2 el consumo medio al modificar los litros consumidos.
    //para ello convetimos en comentario el anterior objeto para poder probar con otros datos.
    Consumo consume2 = new Consumo(100f,7.1f,57f,1.14f);
    float consumoMedio = consume2.getConsumoMedio();
    //mostramos el consumo medio mediante un cuadro de salida.
    JOptionPane.showMessageDialog(null, "El consumo medio es de " + consumoMedio + "L/100Km");
    float velocidadMedia = consume2.getVelocidadMedia();
//visualizamos la velocidad media mediante un cuadro de salida.
    
        System.out.println("La velocidad media es de " + velocidadMedia + "en Km/h" );
    }
}
