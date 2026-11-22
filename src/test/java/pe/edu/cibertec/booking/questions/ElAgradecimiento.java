package pe.edu.cibertec.booking.questions;

import net.serenitybdd.screenplay.Question;

import static pe.edu.cibertec.booking.userinterfaces.FormularioContacto.AGRADECIMIENTO;

public class ElAgradecimiento {

    public static Question<String> mostrado() {
        return Question.about("el mensaje de agradicimiento")
                .answeredBy(actor -> AGRADECIMIENTO.resolveFor(actor).waitUntilVisible().getText());
    }
    private ElAgradecimiento(){}

}
