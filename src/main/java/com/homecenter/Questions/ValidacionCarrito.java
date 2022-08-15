package com.homecenter.Questions;

import com.homecenter.UserUi.MensajeCarritoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionCarrito implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return MensajeCarritoPage.MSJ_PRODUCTO_AGREGADO.resolveFor(actor).isVisible();
    }

    public static Question validarCarrito(){
        return new ValidacionCarrito();
    }
}
