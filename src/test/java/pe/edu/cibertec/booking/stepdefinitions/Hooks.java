package pe.edu.cibertec.booking.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Hooks {

    private static final Logger LOG = LoggerFactory.getLogger(Hooks.class);

    @Before(order = 0)
    public void beforeScenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Before(order = 1)
    public void beforeTest(Scenario scenario) {
        LOG.info(">> Iniciando: {} {}", scenario.getName(), scenario.getId());
    }

    @After(order = 1)
    public void afterScenario(Scenario scenario) {
        LOG.info("<< Resultado {} -> {}", scenario.getName(), scenario.getStatus());
    }

    @After(order = 0)
    public void afterScenario() {
        OnStage.drawTheCurtain();
    }
}
