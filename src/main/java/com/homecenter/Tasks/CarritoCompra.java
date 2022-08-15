package com.homecenter.Tasks;


import com.homecenter.Utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.homecenter.UserUi.CarritoCompraPage.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class CarritoCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Click.on(BTN_MANTENER),
                    WaitUntil.the(BTN_CATEGORIA, isVisible()),
                    Click.on(BTN_CATEGORIA),
                    WaitUntil.the(LLB_SUB_CATEGORIA, isVisible()),
                    Click.on(LLB_SUB_CATEGORIA),
                    Click.on(IMG_PRODUCTO_UNO),
                    Click.on(BTN_AGREGAR_CARRITO),
                    WaitUntil.the(BTN_VER_MAS_PRODUCTO, isVisible()),
                    Click.on(BTN_VER_MAS_PRODUCTO)
            );
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
    public static CarritoCompra agregarCarrito() {
        return instrumented(CarritoCompra.class);
    }

}
