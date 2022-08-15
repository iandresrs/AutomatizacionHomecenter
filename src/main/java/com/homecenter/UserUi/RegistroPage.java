package com.homecenter.UserUi;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class RegistroPage  {
    public static final Target TXT_NOMBRE = Target.the("Ingresar nombre").located(By.id("testId-firstName"));
    public static final Target TXT_APELLIDO = Target.the("Ingresar apellido").located(By.id("testId-lastName"));
    public static final Target LST_TIPO_DOCUMENTO = Target.the("CLICK EN TIPO").located(By.xpath("//*[@id='testId-Dropdown--value']"));
    public static final Target SLC_TIPODOCUMENTO = Target.the("Seleccionar tipo documento").located(By.xpath("//*[@id='testId-li-testId-DropdownList-testId-Dropdown--dropdown-list-item-1']"));
    public static final Target SLC_TIPO_CEDULA = Target.the("Selecciona tipo documento cedula").located(By.xpath("//*[@id='testId-li-testId-DropdownList-testId-Dropdown--dropdown-list-item-0']"));
    public static final Target TXT_NUM_DOCUMENTO = Target.the("Ingresa el numero de documento").located(By.id("testId-document"));
    public static final Target TXT_NUM_TELEFONO = Target.the("Ingresar numero de telefono").located(By.id("testId-input-phoneNumber"));
    public static final Target LST_CONTRIBUYENTE = Target.the("Click tipo contribuyente").located(By.xpath("//*[@id='testId-Dropdown-taxpayerType-value']"));
    public static final Target SLC_CONTRIBUYENTE = Target.the("Selecciona el contribuyente").located(By.xpath("//*[@id='testId-li-testId-DropdownList-testId-Dropdown-taxpayerType-dropdown-list-item-3']"));
    public static final Target TXT_EMAIL = Target.the("Ingresar email").located(By.id("testId-email"));
    public static final Target TXT_CLAVE = Target.the("Ingresar clave").located(By.id("testId-password"));
    public static final Target CHK_TERMINOS = Target.the("Click acepta terminos condiciones").located(By.xpath("//span[@id='checkbox-testId-acceptTermsAndConditions']"));
    public static final Target BTN_CREAR_CUENTA = Target.the("Click crear cuenta formulario").located(By.id("testId-btn-registration-submit"));
}
