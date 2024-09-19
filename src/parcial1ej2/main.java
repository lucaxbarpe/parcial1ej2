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
		Propiedad propiedad2 = new Propiedad(null, "juana manso 720", "puerto madero");
		Propiedad propiedad3 = new Propiedad(null, "antezana 247", "caballito");
		Propiedad propiedad4 = new Propiedad(null, "legarreta 990", "monte grande");
		
		Propiedad usar1 = new Propiedad();

		
		
		int usar;
		usar = Integer.parseInt(JOptionPane.showInputDialog("que propiedad deseas usar \n " + "1. "+propiedad1.getCalle() + "\n "+ "2. "+propiedad2.getCalle()+ "\n "+ "3. "+ propiedad3.getCalle()+ "\n "+ "4. "+propiedad4.getCalle()));
		
		switch (usar) {
		case 1:
			usar1 = propiedad1;
			break;
		case 2:
			usar1 = propiedad2;
			break;
		case 3:
			usar1 = propiedad3;
	break;
		case 4:
			usar1 = propiedad4;
	break;

		default:
			break;
		}
		
		
		int opcion;

		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog("seleccione una opcion" + "\n" + "1 = cambiar disponibilidad" + "\n" + "2 = consultar disponibilidad" + "\n" +
		"3 = terminar alquiler" + "\n" + "4 = calcular precio de una propiedad" + "\n" + "5 = salir"));
			
			
			
			switch (opcion) {
			case 1:
				
				usar1.Estadiponible();
				JOptionPane.showMessageDialog(null, "departamento en = " + direcciondeldepto + "\n"+"barrio = "+ ubic + "\n" + "inquilino = " + usar1.getpropietario());
				
				break;
			case 2:
				
				usar1.disponibilidad();
				
				break;
			case 3:
				usar1.Terminaralquiler();
	break;
			case 4:
				usar1.Calcularprecio();
	break;
			case 5:
				JOptionPane.showMessageDialog(null, "cerrando sistema...");
	break;
			default:
				break;
			}
			
			
			
			
			
		} while (opcion !=5);
		
		
		
	
	
	}

}
