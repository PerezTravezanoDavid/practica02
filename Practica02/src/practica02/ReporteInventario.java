/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica02;

/**
 *
 * @author DAVID
 */
public class ReporteInventario {
    public static void main (String [] args){
        
         String[] producto = {"Lapiz", "Lapicero", "Borrador", "Corrector"};
        int[] cantidad = {12, 30, 40, 50};
        double[] precio = {1.5, 1.0, 1.6, 4.0};

        double totalGeneral = 0;

        StringBuilder reporte = new StringBuilder();

        reporte.append("########################################\n");
        reporte.append(String.format("%-12s %-10s %-10s %-10s\n",
                "Nombre", "Cantidad", "Precio", "Total"));
        reporte.append("########################################\n");

        for (int i = 0; i < producto.length; i++) {

            double total = cantidad[i] * precio[i];
            totalGeneral += total;

            reporte.append(String.format("%-12s %-10d %-10.1f %-10.1f\n",
                    producto[i], cantidad[i], precio[i], total));
        }

        reporte.append("########################################\n");
        reporte.append(String.format("Total General: %.1f\n", totalGeneral));
        reporte.append("########################################");

        System.out.println(reporte.toString());
    }
}