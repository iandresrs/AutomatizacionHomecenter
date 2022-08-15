package com.homecenter.UserUi;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target BTN_CREARCUENTA = Target.the("Click en el boton crear cuenta").located(By.xpath("(//button[@id='testId-btn-signup-button'])[2]"));


    public static final Target TXT_EMAIL = Target.the("Ingresar email").located(By.id("testId-input-email"));
    public static final Target TXT_CLAVE = Target.the("Ingresar clave").located(By.id("testId-input-password"));
    public static final Target BTN_INGRESAR = Target.the("Clic en el boton iniciar sesion").located(By.id("testId-btn-login-button"));
}

