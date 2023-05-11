/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;
import paquetedos.Usuario;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        // Crear el objeto Usuario
        Usuario usuario = new Usuario();
        
        usuario.establecerNombre("María");
        usuario.establecerApellido("Paute");
        usuario.establecerIdentificacion("111122223");
        
        // Crear el objeto FacturaTelefonica
        FacturaTelefonica factura = new FacturaTelefonica("098763211", 100, 
                0.5, usuario);
        factura.calcularValorFactura();
        System.out.printf("%s\n",factura);
    }
}
