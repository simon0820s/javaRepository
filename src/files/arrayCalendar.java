package files;

import javax.swing.*;

public class arrayCalendar {
    public static void main(String[] args) {
        String meses[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        int mes;
        int confirm=0;

        while (confirm==0) {
            JOptionPane.showMessageDialog(null, "ingrese por favor el numero del mes que desea consultar");
            String ent = JOptionPane.showInputDialog("EJ: 1 = Enero, 2 = Febrero, 3 = Marzo ...");
            mes = Integer.parseInt(ent);
            if (mes<1){
                JOptionPane.showMessageDialog(null,"no se admiten valores menores a 1");
            }
            else {
                if (mes > 12) {
                    JOptionPane.showMessageDialog(null, "recuerde que un año solo tiene 12 meses");

                } else {
                    if (mes == 2) {
                        JOptionPane.showMessageDialog(null, "el mes: " + meses[mes - 1] + " tiene un total de: 28 dias en el año 2022");
                        confirm = JOptionPane.showConfirmDialog(null, "desea consultar otro mes?");
                    } else {
                        if (mes % 2 == 0) {
                            JOptionPane.showMessageDialog(null, "el mes: " + meses[mes - 1] + " tiene un total de: 30 dias");
                            confirm = JOptionPane.showConfirmDialog(null, "desea consultar otro mes?");
                        } else {
                            if (mes % 2 != 0) {
                                JOptionPane.showMessageDialog(null, "el mes: " + meses[mes - 1] + " tiene un total de: 31 dias");
                                confirm = JOptionPane.showConfirmDialog(null, "desea consultar otro mes?");
                            }
                        }
                    }
                }

            }
        }
    }
}
