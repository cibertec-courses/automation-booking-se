package pe.edu.cibertec.booking.questions;

import net.serenitybdd.screenplay.Question;

import static pe.edu.cibertec.booking.userinterfaces.FormularioContacto.ASUNTO_CONFIRMADO;

public class ElAsuntoConfirmado {

    public static Question<String> mostrado() {
        return Question.about("mensaje confirmado")
                .answeredBy(actor -> ASUNTO_CONFIRMADO.resolveFor(actor).waitUntilVisible().getText());
    }

    private ElAsuntoConfirmado(){}

}
