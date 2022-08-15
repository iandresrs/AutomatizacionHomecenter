package com.homecenter.UserUi;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MensajeRegistroPage {

    public static final Target MSJ_VALIDACION_REGISTRO = Target.the("Mensaje valida el registro").located(By.xpath("//span[text()='Tu cuenta fue creada con éxito']"));
}
