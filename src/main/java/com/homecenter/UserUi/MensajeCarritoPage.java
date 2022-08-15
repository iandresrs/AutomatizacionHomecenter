package com.homecenter.UserUi;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MensajeCarritoPage {
    public static final Target MSJ_PRODUCTO_AGREGADO = Target.the("Mensaje de validacion de producto agregado al carrito").located(By.xpath("//h1[text()='Carro de compras']"));
}
