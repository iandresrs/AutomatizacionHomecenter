package com.homecenter.StepDefinitions;

import com.homecenter.Questions.ValidacionRegistro;
import com.homecenter.Tasks.Registro;
import com.homecenter.Tasks.CrearUsuario;
import com.homecenter.UserUi.InicioPage;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegistroStepDefinition {
    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor juan = Actor.named("juan");
    private InicioPage inicioPage = new InicioPage();

    @Before
    public void configuracion() {
        juan.can(
                BrowseTheWeb.with(navegador)
        );
    }
    @Dado("el usuario se encuentre en la pagina web")
    public void el_usuario_se_encuentre_en_la_pagina_web() {
        juan.wasAbleTo(
                Open.browserOn(inicioPage)
        );
    }
    @Cuando("el usuario llene el formulario de registro")
    public void el_usuario_llene_el_formulario_de_registro() {
        juan.attemptsTo(
                Registro.registroUsuario(),
                CrearUsuario.crear()
        );
    }
    @Entonces("visualizara un mensaje de registro extiso")
    public void visualizara_un_mensaje_de_registro_extiso() {
        juan.should(seeThat(
                "el actor puede ver", ValidacionRegistro.validarRegistro(), Matchers.equalTo(true)
        ));
    }
}
