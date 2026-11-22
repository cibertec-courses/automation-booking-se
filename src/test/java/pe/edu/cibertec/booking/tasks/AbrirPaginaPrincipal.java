package pe.edu.cibertec.booking.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static pe.edu.cibertec.booking.userinterfaces.PaginaPrincipal.TITULO_BIENVENIDA;

public class AbrirPaginaPrincipal {

    public static Performable delHotel() {
        return Task.where("{0} abre la pagina principal del hotel",
                Open.browserOn().thePageNamed("home.page"),
                WaitUntil.the(TITULO_BIENVENIDA, isVisible())
                        .forNoMoreThan(Duration.ofSeconds(15))
        );


    }
    private AbrirPaginaPrincipal(){}
}
