package de.hrw.swep.biblio.service.benutzer;

import de.hrw.swep.biblio.service.Gebuehr;

public class Normal implements Benutzerstatus {

	private Benutzer benutzer;

	
	public Normal(Benutzer b) {
		this.benutzer = b;
	}

	public void mahnen(Gebuehr geb) {
		benutzer.getGebuehren().add(geb);
		benutzer.setStatus(new Gesperrt(benutzer));
	}

	public void freischalten() {
		// TODO Status�bergang
	}

}