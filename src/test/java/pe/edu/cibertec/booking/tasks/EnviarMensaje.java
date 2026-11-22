package pe.edu.cibertec.booking.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import pe.edu.cibertec.booking.models.Mensaje;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static pe.edu.cibertec.booking.interactions.EscribirSiHayValor.en;
import static pe.edu.cibertec.booking.userinterfaces.FormularioContacto.*;

public class EnviarMensaje implements Task {

    private final Mensaje mensaje;

    public EnviarMensaje(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    public static EnviarMensaje conLosDatos(Mensaje mensaje){
        return instrumented(EnviarMensaje.class, mensaje);
    }

    @Override
    @Step("{0} envia un mensaje de contacto: #mensaje")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                en(NOMBRE, mensaje.nombre()),
                en(CORREO, mensaje.correo()),
                en(TELEFONO, mensaje.telefono()),
                en(ASUNTO, mensaje.asunto()),
                en(MENSAJE, mensaje.mensaje()),
                Click.on(BOTON_ENVIAR)
        );

    }
}
