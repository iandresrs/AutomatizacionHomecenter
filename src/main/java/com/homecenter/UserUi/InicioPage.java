package com.homecenter.UserUi;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.homecenter.com.co/homecenter-co/")
public class InicioPage extends PageObject {
    public static final Target BTN_MICUENTA = Target.the("Click en el boton mi cuenta").located(By.xpath("//a[@class='Account-module_icon-container__2GQEb']"));

}
