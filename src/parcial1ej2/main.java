package parcial1ej2;

import javax.swing.JOptionPane;

class main {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "_______Baires rent_______" + "\n" + "accediendo al sistema...");
		
		
		String direcciondeldepto;
		String ubic;
		
		
		direcciondeldepto = JOptionPane.showInputDialog("ingrese direccion del departamento");
		ubic = JOptionPane.showInputDialog("ingrese ubicacion del propietario");
		Propiedad propiedad1 = new Propiedad(null, direcciondeldepto, ubic);
		
		int opcion;

		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog("seleccione una opcion" + "\n" + "1 = cambiar disponibilidad" + "\n" + "2 = consultar disponibilidad" + "\n" +
		"3 = terminar alquiler" + "\n" + "4 = calcular precio de una propiedad" + "\n" + "5 = salir"));
			
			
			
			switch (opcion) {
			case 1:
				
				propiedad1.Estadiponible();
				JOptionPane.showMessageDialog(null, "departamento en = " + direcciondeldepto + "\n"+"barrio = "+ ubic + "\n" + "inquilino = " + propiedad1.getpropietario());
				
				break;
			case 2:
				
				propiedad1.disponibilidad();
				
				break;
			case 3:
				propiedad1.Terminaralquiler();
	break;
			case 4:
				propiedad1.Calcularprecio();
	break;
			case 5:
	
	break;
			default:
				break;
			}
			
			
			
			
			
		} while (opcion !=4);
		
		
		
	
	
	}

}
