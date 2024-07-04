/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1;

import javax.swing.JOptionPane;

/**
 *
 * @author estef
 */
public class Examen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// pedimos al usuario datos correspondidos del cliente
        Agente agente = new Agente();

        String nombreClente = JOptionPane.showInputDialog("Digite su nombre");
        agente.setNombreAgente(nombreClente);

        String sucursal = JOptionPane.showInputDialog("Digite la sucursal");
        agente.setSucursalPerteneciente(sucursal);

        int cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de cedula"));
        agente.setNumeroCedula(cedula);

        String poseeVehiculo = JOptionPane.showInputDialog("Digite si posee vehiculo o no");
        agente.setPoseedorDeVehiculo(poseeVehiculo);

        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo"));
        agente.setCodigo(codigo);
        
        int cantidadFactura = 5;
        for (int i = 0; i < cantidadFactura; i++) {


            // pedimos al usuario la informacion sobre la factura
            Factura factura = new Factura();

            String nombre = JOptionPane.showInputDialog("Digite nombre del cliente");
            factura.setNombreCliente(nombre);

            int cedulaCliente = Integer.parseInt(JOptionPane.showInputDialog("Digite numero de cedula del cliente"));
            factura.setCedulaCliente(cedulaCliente);

            int codigoCliente = Integer.parseInt(JOptionPane.showInputDialog("Digite su codigo"));
            factura.setCodigoDeFactura(codigoCliente);

            double montoFactura = Double.parseDouble(JOptionPane.showInputDialog("Digite monto de la factura"));
            factura.setMontoFcatura(montoFactura);
            // verificacion de mes    
            Boolean mesValido = false;
            while (mesValido == false) {

                 int numeroMes = Integer.parseInt(JOptionPane.showInputDialog("Digite nuemro de mes"));


                 if (numeroMes >= 1 && numeroMes <= 12) {
                    factura.setNumeroMes(numeroMes);
                    mesValido = true;
                 } else {
                    JOptionPane.showMessageDialog(null, "el numero de mes dijitado es invalido");
                 }
            }

            String electricos = (JOptionPane.showInputDialog("la factura contiene productos electricos SI/NO"));
            factura.setElectricos(electricos);

            String automotrices = (JOptionPane.showInputDialog("la factura contiene productos automotrices SI/NO"));
            factura.setAutomotrices(automotrices);

            String contruccion = (JOptionPane.showInputDialog("la factura contiene productos construccion SI/NO"));
            factura.setContruccion(contruccion);
            
            if (electricos == "SI" && automotrices == "SI" && contruccion == "SI"){
            }
                
        }
    }

}
