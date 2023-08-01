package conversorMonedas;
import javax.swing.JOptionPane;

// Clase function
public class function {

    // Instancias de las clases ConvertirMonedas y ConvertirMonedasAPesos para utilizar sus métodos
	ConvertirMonedas monedas = new ConvertirMonedas();
	ConvertirMonedasAPesos pesos = new ConvertirMonedasAPesos();
	
    // Método para realizar la conversión de monedas
    public void ConvertirMonedas(double Minput) {
    	// Cuadro de diálogo para que el usuario elija la moneda de conversión
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano","De Pesos a Rublo","De Pesos a Yuan","De Pesos a Dinar Kuwaiti","De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos","De Rublo a Pesos","De Yuan a Pesos","De Dinar Kuwaiti a Pesos"}, 
    			"Seleccion")).toString();
    	
        switch(opcion) {
        // Casos para conversiones de Pesos MXN a otras monedas
        case "De Pesos a Dólar":
        	monedas.ConvertirPesosMXNADolares(Minput);
        	break;
        case "De Pesos a Euro":
        	monedas.ConvertirPesosMXNAEuros(Minput);
        	break;
        case "De Pesos a Libras":
        	monedas.ConvertirPesosMXNALibras(Minput);
        	break;
        case "De Pesos a Yen":
        	monedas.ConvertirPesosMXNAYen(Minput);
        	break;
        case "De Pesos a Won Coreano":
        	monedas.ConvertirPesosMXNAWon(Minput);
        	break;
        case "De Pesos a Rublo":
        	monedas.ConvertirPesosMXNARublo(Minput);
        	break;
        case "De Pesos a Yuan":
        	monedas.ConvertirPesosMXNAYuan(Minput);
        	break; 
        case "De Pesos a Dinar Kuwaiti":
        	monedas.ConvertirPesosMXNADinarKuwait(Minput);
        	break;  
        
        // Casos para conversiones de otras monedas a Pesos MXN
        case "De Dólar a Pesos":
        	pesos.ConvertirDolaresAPesosMXN(Minput);
        	break;
        case "De Euro a Pesos":
        	pesos.ConvertirEurosAPesosMXN(Minput);
        	break;
        case "De Libras a Pesos":
        	pesos.ConvertirLibrasAPesosMXN(Minput);
        	break;
        case "De Yen a Pesos":
        	pesos.ConvertirYenAPesosMXN(Minput);
        	break;
        case "De Won Coreano a Pesos":
            pesos.ConvertirWonAPesosMXN(Minput);
            break;
        case "De Rublo a Pesos":
            pesos.ConvertirRubloAPesosMXN(Minput);
            break;
        case "De Yuan a Pesos":
            pesos.ConvertirYuanAPesosMXN(Minput);
            break;
        case "De Dinar Kuwaiti a Pesos":
            pesos.ConvertirDinarKuwaitAPesosMXN(Minput);
            break;
        }      
    }    
}
