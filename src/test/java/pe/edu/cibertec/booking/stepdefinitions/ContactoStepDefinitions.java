package pe.edu.cibertec.booking.stepdefinitions;

import io.cucumber.java.Transpose;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import pe.edu.cibertec.booking.models.Mensaje;
import pe.edu.cibertec.booking.questions.ElAgradecimiento;
import pe.edu.cibertec.booking.questions.ElAsuntoConfirmado;
import pe.edu.cibertec.booking.questions.LosErrores;
import pe.edu.cibertec.booking.tasks.AbrirPaginaPrincipal;
import pe.edu.cibertec.booking.tasks.EnviarMensaje;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ContactoStepDefinitions {

    @Given("que {actor} esta en la pagina principal del hotel")
    public void estaEnlaPaginaPrincipal(Actor actor) {
        actor.wasAbleTo(AbrirPaginaPrincipal.delHotel());
    }

    @When("envia un mensaje con los siguiente datos")
    public void enviaUnMensaje(@Transpose Mensaje mensaje) {
        theActorInTheSpotlight().attemptsTo(EnviarMensaje.conLosDatos(mensaje));
    }

    @Then("ve el agradimiento {string}")
    public void veElAgradecimiento(String agradimiento) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(ElAgradecimiento.mostrado()).isEqualTo(agradimiento)
        );
    }

    @Then("ve que su consulta es sobre {string}")
    public void veQueSuConsultaEsSobre(String asunto) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(ElAsuntoConfirmado.mostrado()).isEqualTo(asunto)
        );
    }

    @Then("ve el error {string}")
    public void veElError(String error) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(LosErrores.delFormulario()).contains(error)
        );
    }


}
