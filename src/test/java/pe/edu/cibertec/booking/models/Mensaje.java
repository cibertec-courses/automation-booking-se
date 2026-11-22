package pe.edu.cibertec.booking.models;

import static java.util.Objects.requireNonNullElse;

public record Mensaje (String nombre, String correo, String telefono, String asunto, String mensaje) {
    public  Mensaje {
        nombre= requireNonNullElse(nombre,"");
        correo= requireNonNullElse(correo,"");
        telefono= requireNonNullElse(telefono,"");
        asunto= requireNonNullElse(asunto,"");
        mensaje= requireNonNullElse(mensaje,"");
    }
}
