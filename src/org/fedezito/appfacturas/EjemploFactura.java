package org.fedezito.appfacturas;

import org.fedezito.appfacturas.models.*;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNif("1234-4");
        cliente.setNombre("Federico Zito");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la descripción de la factura: ");
        String desc = scanner.nextLine();
        Factura factura = new Factura(desc, cliente);
        Producto producto;
        System.out.println();

        for (int i = 0; i < 5; i++) {
            producto = new Producto();
            System.out.println("Ingrese producto n°  " + producto.getCodigo() + ": ");
            producto.setNombre(scanner.next());
            System.out.println("Ingrese el precio : ");
            producto.setPrecio(scanner.nextFloat());
            System.out.println("Ingrese la cantidad : ");
            factura.addItemFactura(new ItemFactura(scanner.nextInt(), producto));
            System.out.println();
        }
        System.out.println(factura);
    }
}
