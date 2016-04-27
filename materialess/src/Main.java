public class Main {
	public static void main(String[] args) {

		login login = new login();
		singin singin = new singin();
		NewMaterial nuevomaterial = new NewMaterial();
		
		
		login.setNewMaterialysingin(nuevomaterial, singin);
		singin.setloginyNewMaterial(login, nuevomaterial);
		nuevomaterial.setloginysingin(login, singin);
		
		login.setVisible(true);

		
	}

}