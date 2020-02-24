package anonimoXYZ.service;

public class servicioCaloriasImp implements servicioCaloria {

	public void caloriasComida(int a) {
		
		switch(a) {
		case 1:
			System.out.println("Las lentejas contienen 500 calorias");
			break;
		case 2:
			System.out.println("Las judias contienen 600 calorias");
			break;
		case 3:
			System.out.println("Los garbanzos contienen 800 calorias");
			break;
		case 4:
			System.out.println("Manteca de cacahuete contienen 3500 calorias");
			break;
			default:
				System.out.println("Se desconece las calorias");
		}
	}

}
