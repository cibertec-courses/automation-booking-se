package pe.edu.cibertec.booking.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hooks {

    @Before (order = 0)
    public void beforeScenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @After
    public void afterScenario() {
        OnStage.drawTheCurtain();
    }
}
