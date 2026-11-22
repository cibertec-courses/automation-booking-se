package pe.edu.cibertec.booking.stepdefinitions;

import io.cucumber.java.DataTableType;
import io.cucumber.java.ParameterType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import pe.edu.cibertec.booking.models.Mensaje;

import java.util.Map;

public class ParameterDefinitions {
  
    @ParameterType(".*")
    public Actor actor(String nombre){
        return OnStage.theActorCalled(nombre);
    }

    @DataTableType
    public Mensaje menssje( Map<String, String> fila){
        return new Mensaje(
          fila.get("nombre"),
          fila.get("correo"),
          fila.get("telefono"),
          fila.get("asunto"),
          fila.get("mensaje")
        );
    }

}
