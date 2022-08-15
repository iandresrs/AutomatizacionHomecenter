package com.homecenter.UserUi;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;

public class MensajeLoginPage {
    public static final Target MSJ_LOGIN = Target.the("Mensaje de validacion login").located(By.xpath("//div[text()='¡Hola']"));
}
