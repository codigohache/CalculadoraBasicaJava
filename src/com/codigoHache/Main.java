package com.codigoHache;

import javax.swing.*;

public class Main {
    //variables del menu
    static int option;
   static String menu;

    public static void main(String[] args) {
        OperacionesBasicas object = new OperacionesBasicas();
        do {
            menu = JOptionPane.showInputDialog("Menu Principal\n" + "1. Sumar\n" + "2. Restar\n" + "3.Division\n" + "4.Multiplicacion\n" + "5.Salir");
            option = Integer.parseInt(menu);

            switch  (option) {
                case 1:
                    object.suma();
                    break;
                case 2:
                     object.resta();
                     break;
                case 3:
                    object.division();
                    break;
                case 4:
                    object.multiplicacion();
                    break;
                case 5:
                    break;
                    default:
                        JOptionPane.showMessageDialog(null, "La opcion " + option + " es incorrecta ");
                        break;

            }

        }while (option != 5);

    }
}
