package conversorMonedas;
import javax.swing.JOptionPane;

// Clase ConvertirMonedasAPesos
public class ConvertirMonedasAPesos {

	// Método para convertir dólares estadounidenses a pesos mexicanos
	public void ConvertirDolaresAPesosMXN(double valor) {
		// Conversión multiplicando la cantidad en dólares por el tipo de cambio aproximado de 1 USD = 16.72 MXN
		double monedaDolar = valor * 16.72;
		// Redondeamos el resultado a dos decimales
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
		// Mostramos el resultado en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Pesos Mexicanos");
	}
	
	// Método para convertir euros a pesos mexicanos
	public void ConvertirEurosAPesosMXN(double valor) {
		// Conversión multiplicando la cantidad en euros por el tipo de cambio aproximado de 1 EUR = 18.41 MXN
		double monedaEuro = valor * 18.41;
		// Redondeamos el resultado a dos decimales
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		// Mostramos el resultado en un cuadro de diálogo
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Pesos Mexicanos");
	}
	
	// Método para convertir libras esterlinas a pesos mexicanos
	public void ConvertirLibrasAPesosMXN(double valor) {
		// Conversión multiplicando la cantidad en libras por el tipo de cambio aproximado de 1 GBP = 21.49 MXN
		double monedaLibra = valor * 21.49;
        // Redondeamos el resultado a dos decimales
        monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
        // Mostramos el resultado en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Pesos Mexicanos");
	}
	
	// Método para convertir yenes japoneses a pesos mexicanos
	public void ConvertirYenAPesosMXN(double valor) {
		// Conversión multiplicando la cantidad en yenes por el tipo de cambio aproximado de 1 JPY = 0.12 MXN
		double monedaYen = valor * 0.12;
        // Redondeamos el resultado a dos decimales
        monedaYen = (double) Math.round(monedaYen * 100d) / 100;
        // Mostramos el resultado en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Pesos Mexicanos");
	}
	
	// Método para convertir wons surcoreanos a pesos mexicanos
	public void ConvertirWonAPesosMXN(double valor) {
		// Conversión multiplicando la cantidad en wons por el tipo de cambio aproximado de 1 KRW = 0.013 MXN
		double monedaWon = valor * 0.013;
        // Redondeamos el resultado a dos decimales
        monedaWon = (double) Math.round(monedaWon * 100d) / 100;
        // Mostramos el resultado en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Pesos Mexicanos");
	}
	
	// Método para convertir rublos rusos a pesos mexicanos
	public void ConvertirRubloAPesosMXN(double valor) {
		// Conversión multiplicando la cantidad en rublos por el tipo de cambio aproximado de 1 RUB = 0.18 MXN
        double monedaRublo = valor * 0.18;
        // Redondeamos el resultado a dos decimales
        monedaRublo = (double) Math.round(monedaRublo * 100d) / 100;
        // Mostramos el resultado en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaRublo+ " Pesos Mexicanos");
	}
	
	// Método para convertir yuanes chinos a pesos mexicanos
	public void ConvertirYuanAPesosMXN(double valor) {
		// Conversión multiplicando la cantidad en yuanes por el tipo de cambio aproximado de 1 CNY = 2.34 MXN
		double monedaYuan = valor * 2.34;
        // Redondeamos el resultado a dos decimales
        monedaYuan = (double) Math.round(monedaYuan * 100d) / 100;
        // Mostramos el resultado en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYuan+ " Pesos Mexicanos");
	}
	
	// Método para convertir dinares kuwaitíes a pesos mexicanos
	public void ConvertirDinarKuwaitAPesosMXN(double valor) {
		// Conversión multiplicando la cantidad en dinares kuwaitíes por el tipo de cambio aproximado de 1 KWD = 54.67 MXN
		double monedaDinarKuwait = valor * 54.67;
        // Redondeamos el resultado a dos decimales
        monedaDinarKuwait = (double) Math.round(monedaDinarKuwait * 100d) / 100;
        // Mostramos el resultado en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDinarKuwait+ " Pesos Mexicanos");
	}
}
