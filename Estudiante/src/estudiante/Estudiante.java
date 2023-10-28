package estudiante;

import javax.swing.JOptionPane;

public class Estudiante {

    //Creación de las variables que utilizaremos.
    public String nomEstudiante, apeEstudiante;
    public int anhoNac;
    public char genEstudiante;
    public float promedioGeneral;
    public boolean esBecado;

    public static void main(String[] args) {

        //Se crea el objeto de clase estudiante para realizar los procesos.
        Estudiante alumno1 = new Estudiante();

        //Capturamos los datos del estudiante.
        while (true) {
            //El manejo de errores esta puesto para que, si hay un dato incorrecto, hay que llenar toda la información otra vez.
            try {
                alumno1.nomEstudiante = JOptionPane.showInputDialog("Digite el nombre del estudiante: ");
                alumno1.apeEstudiante = JOptionPane.showInputDialog("Digite el apellido del estudiante: ");
                alumno1.genEstudiante = JOptionPane.showInputDialog("Digite el género del estudiante M/F: ").charAt(0);
                alumno1.anhoNac = Integer.parseInt(JOptionPane.showInputDialog("Digite el año de nacimiento del estudiante: "));
                alumno1.promedioGeneral = Float.parseFloat(JOptionPane.showInputDialog("Digite el promedio general del estudiante: "));
                break; //Frena y da la salida del bucle si todas las entradas son válidas.
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error: Ingrese un valor que sea valido. ");
            }//Cierra el CATCH.
        }//Cierra el WHILE.

        //Aquí se calcula la edad con el año de nacimiento que digita el usuario.
        int edad = 2023 - alumno1.anhoNac;

        //Proceso para saber si el estudiante es becado o no.
        byte opc;
        try {
            opc = Byte.parseByte(JOptionPane.showInputDialog("1. ES BECADO\n2. NO ES BECADO\nDigite lo que le corresponda al estudiante. "));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Error: Ingrese 1 o 2 para indicar si el estudiante es becado o no. ");
            return;
        }//Cierra el CATCH.
        
        //Aquí se verifica si el estudiantes es becado o no según la opcion elegida.
        if (opc == 1) {
            alumno1.esBecado = true;
        } else {
            alumno1.esBecado = false;
        }//Cierra el ELSE.

        //Impresiones.
        System.out.println("**********DATOS DEL ALUMNO**********");
        System.out.println("Nombre del alumno: " + alumno1.nomEstudiante + " " + alumno1.apeEstudiante);
        System.out.println("Genero del alumno: " + alumno1.genEstudiante);
        System.out.println("La edad del alumno es: " + edad);
        System.out.println("El promedio general de alumno es de: " + alumno1.promedioGeneral);
        if (alumno1.esBecado) {
            System.out.println("El alumno cuenta con beca...");
        } else {
            System.out.println("El alumno NO cuenta con beca...");
        }//Cierra el ELSE.
        System.out.println("************************************");
    }//Cierra el main.
}//Cierra la clase.
