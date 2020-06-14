package bd;

import Conexion.BD;
import controlador.VeguitaController;

public class MainBD {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instancia Base De Datos
		new BD("Veguita");
		
		//instancia controlador
		VeguitaController vc = new VeguitaController();
	}
}
