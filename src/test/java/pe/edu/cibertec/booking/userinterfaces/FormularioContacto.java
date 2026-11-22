package pe.edu.cibertec.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioContacto {

    public static final Target NOMBRE = Target.the("campo nombre")
            .locatedBy("#name");
    public static final Target CORREO = Target.the("campo correo")
            .locatedBy("#email");
    public static final Target TELEFONO = Target.the("campo telefono")
            .locatedBy("#phone");
    public static final Target ASUNTO = Target.the("campo asunto")
            .locatedBy("#subject");
    public static final Target MENSAJE = Target.the("campo mensaje")
            .locatedBy("#description");
    public static final Target BOTON_ENVIAR = Target.the("boton enviar")
            .locatedBy("//button[text()='Submit']");

    public static final Target AGRADECIMIENTO = Target.the("mensaje de agradecimiento")
            .locatedBy("//section[@id='contact']//h3[starts-with(normalize-space(),'Thanks')]");

    public static final Target ASUNTO_CONFIRMADO = Target.the("asunto confirmado")
            .locatedBy("#contact p[style*='bold']");

    public static final Target ERRORES = Target.the("mensajes de error")
            .locatedBy("#contact .alert-danger p");

    private FormularioContacto() {}

}
