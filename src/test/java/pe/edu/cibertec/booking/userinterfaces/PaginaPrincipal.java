package pe.edu.cibertec.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaPrincipal {

    public static final Target TITULO_BIENVENIDA = Target.the("titulo bienvenida")
            .locatedBy("//h1[contains(normalize-space(), 'Welcome to Shady Meadows B&B')]");

    private PaginaPrincipal() {}

}
