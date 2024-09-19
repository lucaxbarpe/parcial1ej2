package parcial1ej2;

import javax.swing.JOptionPane;

public class Propiedad {
private String propietario;
private String calle;
private String ubicacion;
private double metros2;
private boolean disponible = true;



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

public void Estadiponible() {
	
	String respuesta;
	
	respuesta = JOptionPane.showInputDialog("esta disponible? si o no");
	
	if (respuesta.equalsIgnoreCase("si")) {
		
		this.disponible = true;
		this.propietario = null;
		JOptionPane.showMessageDialog(null, "la propiedad esta disponible para su compra");
	} else {
		this.disponible = false;
		String propietarioactual;
		propietarioactual = JOptionPane.showInputDialog("introduzca el nombre del propietario");
		this.propietario = propietarioactual;
		JOptionPane.showMessageDialog(null, "la propiedad no esta disponible para la compra, pertenece a " + propietarioactual);
		this.disponible = false;
	}
	
}

public void disponibilidad(){
	if (this.disponible == true) {
		JOptionPane.showMessageDialog(null, "la propiedad esta disponible para su compra");
	} else {
		JOptionPane.showMessageDialog(null, "la propiedad no esta disponible para la compra, pertenece a " + this.propietario);
	}
}


public void Terminaralquiler() {
	this.disponible = true;
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
	
	String zonadepto = JOptionPane.showInputDialog("¿en que barrio esta el departamento?" + "\n"
	+ "puerto madero" + "\n" + "recoleta" + "\n" + "otro");
	
	if (zonadepto.equalsIgnoreCase("puerto madero")) {
		preciofinal = preciofinal * 12;
	} else {
		if (zonadepto.equalsIgnoreCase("recoleta")) {
			preciofinal = preciofinal * 8;
		} else {
			preciofinal = preciofinal *2;
		}
	}
	  
JOptionPane.showMessageDialog(null, "el precio final del departamento es de " + preciofinal + "$");
	
	
}























}
