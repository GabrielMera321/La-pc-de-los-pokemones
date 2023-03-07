package co.edu.unbosque.controller;

import co.edu.unbosque.view.View;

public class AplMain {

	public static Object View;

	public class Main {
	    public static void main(String[] args) {
	        View almacenamiento = new View(View);
	        View vista = new View(almacenamiento);
	        Controller controlador = new Controller(vista, almacenamiento);
	        // Aquí se podría agregar más código para iniciar la conexión con el PC y recibir eventos de transferencia
	    }
	}

}
