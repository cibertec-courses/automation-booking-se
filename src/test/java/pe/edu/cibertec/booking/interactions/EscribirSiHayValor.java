package pe.edu.cibertec.booking.interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.targets.Target;


public class EscribirSiHayValor {

    public static Performable en(Target campo, String valor) {
        return Check.whether(!valor.isBlank())
                .andIfSo(Enter.theValue(valor).into(campo));
    }

    private EscribirSiHayValor(){}

}
