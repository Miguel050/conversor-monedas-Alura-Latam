package principal;
import javax.swing.JOptionPane;

import conversorMonedas.function;

// Clase principal llamada "Principal"
public class Principal {

    public static void main(String[] args) {
        function monedas = new function();

        // Bucle infinito para que el programa se ejecute siempre
        while (true) {
            // Cuadro de diálogo con opciones para el usuario
            String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", "Menu",
                    JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Conversor de Moneda", "Salir" }, "Seleccion"))
                    .toString();

            // Estructura "switch" para manejar las opciones seleccionadas
            switch (opciones) {
                case "Conversor de Moneda":
                    // Si el usuario selecciona "Conversor de Moneda," solicitamos la cantidad a convertir
                    String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
                    // Entrada es un número válido
                    if (validarNumero(input)) {
                        // Si es válido, lo convertimos a un número decimal
                        double Minput = Double.parseDouble(input);
                        // Llamamos al método "ConvertirMonedas" de la clase "function" para realizar la conversión
                        monedas.ConvertirMonedas(Minput);

                        // Preguntamos al usuario si desea realizar otra conversión
                        int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
                        if (JOptionPane.OK_OPTION == respuesta) {
                            // Si el usuario quiere continuar, mostramos un mensaje
                            System.out.println("Selecciona opción Afirmativa");
                        } else {
                            // Si el usuario no quiere continuar, mostramos un mensaje y salimos del programa
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                            System.exit(0); // Salir del programa cuando el usuario no quiere hacer más conversiones
                        }
                    } else {
                        // Si la entrada no es válida (no es un número), mostramos un mensaje de error
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;

                case "Salir":
                    // Si el usuario selecciona "Salir," mostramos un mensaje y salimos del programa
                    JOptionPane.showMessageDialog(null, "Programa terminado");
                    System.exit(0); // Salir del programa cuando el usuario selecciona "Salir"
                    break;
            }
        }
    }

    // Método para validar si una cadena es un número decimal válido
    public static boolean validarNumero(String input) {
        try {
            // Intentamos convertir la cadena a un número decimal
            double x = Double.parseDouble(input);
            return true; // Si la conversión es exitosa, la cadena es un número válido
        } catch (NumberFormatException e) {
            return false; // Si ocurre una excepción, la cadena no es un número válido
        }
    }
}

