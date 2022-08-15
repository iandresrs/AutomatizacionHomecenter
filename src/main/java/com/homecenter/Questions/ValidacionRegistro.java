package com.homecenter.Questions;

import com.homecenter.UserUi.MensajeRegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionRegistro implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return MensajeRegistroPage.MSJ_VALIDACION_REGISTRO.resolveFor(actor).isVisible();
    }

    public static Question validarRegistro(){
        return new ValidacionRegistro();
    }
}
