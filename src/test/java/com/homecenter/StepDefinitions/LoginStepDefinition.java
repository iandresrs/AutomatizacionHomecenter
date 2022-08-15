package com.homecenter.StepDefinitions;

import com.homecenter.Questions.ValidacionLogin;
import com.homecenter.Tasks.Login;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor juan = Actor.named("juan");

    @Before
    public void configuracion(){
        juan.can(BrowseTheWeb.with(navegador));
    }
    @Cuando("el usuario ingrese sus credenciales")
    public void elUsuarioIngreseSusCredenciales() {
        juan.attemptsTo(
                Login.InicioSesion()
        );
    }
    @Entonces("visualizara la pagina inicio")
    public void visualizaraLaPaginaInicio() {
        juan.should(seeThat(
                "el actor puede ver", ValidacionLogin.validarLogin(), Matchers.equalTo(true)
        ));
    }
}
