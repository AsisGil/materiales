public class Main {
	public static void main(String[] args) {

		Principal principal = new Principal();
		Registro registro = new Registro();
		Mantenimiento mantenimiento = new Mantenimiento();
		Anadirpropiedad anadirpropiedad = new Anadirpropiedad();
		Anadirformato anadirformato = new Anadirformato();
		Anadirmaterial anadirmaterial = new Anadirmaterial();
		Anadiredificio anadiredificio = new Anadiredificio();
		Anadirfabricante anadirfabricante = new Anadirfabricante();
		Anadiruso anadiruso = new Anadiruso();

		principal.setmantenimientoyregistro(mantenimiento, registro); //desde principal se accede al material y al sinign
		registro.setprincipalymantenimiento(principal,mantenimiento);//desde singin se accede a principal y al material
		mantenimiento.settodo (principal,anadirpropiedad,anadirformato,anadirmaterial,anadiredificio,anadirfabricante,anadiruso);//desde el material se accede al principal, a la nueva propiedad, a la nuevo formato y nuevo material.
		
		anadirpropiedad.setNewMaterial(mantenimiento);//desde la pagina nueva propiedad  se accede a mantenimiento
		anadirformato.setNewMaterial(mantenimiento);//desde la pagina nuevo formato  se accede a mantenimiento
		anadirmaterial.setNewMaterial(mantenimiento);//desde la pagina nuevo material se accede a mantenimiento
		anadiredificio.setNewMaterial(mantenimiento);//desde la pagina nuevo edificio  se accede a mantenimiento
		anadirfabricante.setNewMaterial(mantenimiento);
		
		principal.setVisible(true);

	}

}