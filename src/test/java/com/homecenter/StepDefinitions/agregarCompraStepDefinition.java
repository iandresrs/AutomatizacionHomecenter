package com.homecenter.StepDefinitions;

import com.homecenter.Questions.ValidacionCarrito;
import com.homecenter.Tasks.CarritoCompra;
import com.homecenter.Tasks.SegundoProducto;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class agregarCompraStepDefinition {
    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor juan = Actor.named("juan");

    @Before
    public void configuracion() {
        juan.can(
                BrowseTheWeb.with(navegador)
        );
    }
    @Cuando("el usuario agregara el producto al carrito de compra")
    public void el_usuario_agregara_el_producto_al_carrito_de_compra() {
        juan.attemptsTo(
                CarritoCompra.agregarCarrito(),
                SegundoProducto.elegir()
        );
    }
    @Entonces("el usuario visualizara todos los productos")
    public void el_usuario_visualizara_todos_los_productos() {
        juan.should(seeThat(
                "el actor puede ver", ValidacionCarrito.validarCarrito(), Matchers.equalTo(true)
        ));
    }
}
