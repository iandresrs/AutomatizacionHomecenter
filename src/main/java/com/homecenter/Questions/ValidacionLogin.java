package com.homecenter.Questions;

import com.homecenter.Models.EsperaImplicita;
import com.homecenter.UserUi.MensajeLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionLogin implements Question {
    EsperaImplicita esperaImplicita = new EsperaImplicita();
    @Override
    public Object answeredBy(Actor actor) {
        esperaImplicita.EsperaImplicita();
        return MensajeLoginPage.MSJ_LOGIN.resolveFor(actor).isVisible();
    }
    public static Question validarLogin(){
        return new ValidacionLogin();
    }
}
