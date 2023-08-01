package conversorMonedas;
import javax.swing.JOptionPane;


// Clase ConvertirMonedas
public class ConvertirMonedas {
	
	// Método para convertir pesos mexicanos a dólares estadounidenses
	public void ConvertirPesosMXNADolares(double valor) {
		// Conversión dividiendo la cantidad en pesos por el tipo de cambio aproximado de 1 MXN = 0.0598 USD
		double monedaDolar = valor / 16.72;
		// Redondeamos el resultado a dos decimales
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
		// Mostramos el resultado en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Dolares");
	}
	
	// Método para convertir pesos mexicanos a euros
	public void ConvertirPesosMXNAEuros(double valor) {
		// Conversión dividiendo la cantidad en pesos por el tipo de cambio aproximado de 1 MXN = 0.0543 EUR
		double monedaEuro = valor / 18.41;
		// Redondeamos el resultado a dos decimales
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		// Mostramos el resultado en un cuadro de diálogo
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Euros");
	}
	
	// Método para convertir pesos mexicanos a libras esterlinas
	public void ConvertirPesosMXNALibras(double valor) {
		// Conversión dividiendo la cantidad en pesos por el tipo de cambio aproximado de 1 MXN = 0.0466 GBP
		double monedaLibra = valor / 21.49;
        // Redondeamos el resultado a dos decimales
        monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
        // Mostramos el resultado en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Libras Esterlinas");
	}
	
	// Método para convertir pesos mexicanos a yenes japoneses
	public void ConvertirPesosMXNAYen(double valor) {
		// Conversión dividiendo la cantidad en pesos por el tipo de cambio aproximado de 1 MXN = 8.33 JPY
		double monedaYen = valor / 0.12;
        // Redondeamos el resultado a dos decimales
        monedaYen = (double) Math.round(monedaYen * 100d) / 100;
        // Mostramos el resultado en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Yenes");
	}
	
	// Método para convertir pesos mexicanos a wons surcoreanos
	public void ConvertirPesosMXNAWon(double valor) {
		// Conversión dividiendo la cantidad en pesos por el tipo de cambio aproximado de 1 MXN = 0.013 KRW
		double monedaWon = valor / 0.013;
        // Redondeamos el resultado a dos decimales
        monedaWon = (double) Math.round(monedaWon * 100d) / 100;
        // Mostramos el resultado en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Wons");
	}
	
	// Método para convertir pesos mexicanos a rublos rusos
	public void ConvertirPesosMXNARublo(double valor) {
		// Conversión dividiendo la cantidad en pesos por el tipo de cambio aproximado de 1 MXN = 0.18 RUB
        double monedaRublo = valor / 0.18;
        // Redondeamos el resultado a dos decimales
        monedaRublo = (double) Math.round(monedaRublo * 100d) / 100;
        // Mostramos el resultado en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaRublo+ " Rublos");
	}
	
	// Método para convertir pesos mexicanos a yuanes chinos
	public void ConvertirPesosMXNAYuan(double valor) {
		// Conversión dividiendo la cantidad en pesos por el tipo de cambio aproximado de 1 MXN = 2.34 CNY
		double monedaYuan = valor / 2.34;
        // Redondeamos el resultado a dos decimales
        monedaYuan = (double) Math.round(monedaYuan * 100d) / 100;
        // Mostramos el resultado en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYuan+ " Yuanes");
	}
	
	// Método para convertir pesos mexicanos a dinares kuwaitíes
	public void ConvertirPesosMXNADinarKuwait(double valor) {
		// Conversión dividiendo la cantidad en pesos por el tipo de cambio aproximado de 1 MXN = 54.67 KWD
		double monedaDinarKuwait = valor / 54.67;
        // Redondeamos el resultado a dos decimales
        monedaDinarKuwait = (double) Math.round(monedaDinarKuwait * 100d) / 100;
        // Mostramos el resultado en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDinarKuwait+ " Dinares Kuwaitíes");
	}
}

