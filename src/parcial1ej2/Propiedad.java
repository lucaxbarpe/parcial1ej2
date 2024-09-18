package parcial1ej2;

import javax.swing.JOptionPane;

public class Propiedad {
private String propietario;
private String calle;
private String ubicacion;
private double metros2;
private String disponible;



public Propiedad(String propietario, String calle, String ubicacion) {
	super();
	this.propietario = propietario;
	this.calle = calle;
	this.ubicacion = ubicacion;
}



public String getpropietario() {
	return propietario;
}



public void setpropietario(String propietario) {
	this.propietario = propietario;
}



public String getCalle() {
	return calle;
}



public void setCalle(String calle) {
	this.calle = calle;
}



public String getUbicacion() {
	return ubicacion;
}



public void setUbicacion(String ubicacion) {
	this.ubicacion = ubicacion;
}



public double getMetros2() {
	return metros2;
}



public void setMetros2(int metros2) {
	this.metros2 = metros2;
}

public void Estadisponible() {
	
	String respuesta;
	
	respuesta = JOptionPane.showInputDialog("esta disponible? si o no");
	
	if (respuesta.equalsIgnoreCase("si")) {
		
		this.disponible = "si";
		this.propietario = null;
		JOptionPane.showMessageDialog(null, "la propiedad esta disponible para su compra");
	} else {
		this.disponible = "no";
		String propietarioactual;
		propietarioactual = JOptionPane.showInputDialog("introduzca el nombre del propietario");
		this.propietario = propietarioactual;
		JOptionPane.showMessageDialog(null, "la propiedad no esta disponible para la compra, pertenece a " + propietarioactual);
	}
	
}


public void Terminaralquiler() {
	this.disponible = "si";
	this.propietario = null;
	
	
}

public void Calcularprecio() {
	double metros2totales = 0;
	this.metros2 = metros2totales;
	double precioxmetro2;
	double preciofinal;
	precioxmetro2 = 150;
	metros2totales = Double.parseDouble(JOptionPane.showInputDialog("cuantos metros cuadrados tiene la propiedad"));
	preciofinal = metros2totales * precioxmetro2;
	
	JOptionPane.showMessageDialog(null, "la propiedad tiene un precio de " + preciofinal + "$");

	
	
}























}
