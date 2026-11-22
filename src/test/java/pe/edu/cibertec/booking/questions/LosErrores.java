package pe.edu.cibertec.booking.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.Collection;

import static pe.edu.cibertec.booking.userinterfaces.FormularioContacto.ERRORES;

public class LosErrores {

    public static Question<Collection<String>> delFormulario(){
        return Question.about("los errores del formulario")
                .answeredBy( actor -> {
                    ERRORES.resolveFor(actor).waitUntilVisible();
                    return Text.ofEach(ERRORES).answeredBy(actor);
                });

    }

    private LosErrores(){}

}
