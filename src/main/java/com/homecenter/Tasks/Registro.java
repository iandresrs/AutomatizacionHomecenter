package com.homecenter.Tasks;

import com.homecenter.Utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.homecenter.UserUi.InicioPage.BTN_MICUENTA;
import static com.homecenter.UserUi.LoginPage.BTN_CREARCUENTA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.Tasks.instrumented;


import static com.homecenter.UserUi.RegistroPage.*;

public class Registro implements Task {
    Datos datosExcel = new Datos();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    WaitUntil.the(BTN_MICUENTA, isVisible()),
                    Click.on(BTN_MICUENTA),
                    WaitUntil.the(BTN_CREARCUENTA, isVisible()),
                    Click.on(BTN_CREARCUENTA),
                    Enter.theValue(datosExcel.leerDatosExcel("Datos.xlsx", "Registro", 1, 0)).into(TXT_NOMBRE),
                    Enter.theValue(datosExcel.leerDatosExcel("Datos.xlsx", "Registro", 1, 1)).into(TXT_APELLIDO),
                    Click.on(LST_TIPO_DOCUMENTO),
                    Click.on(SLC_TIPO_CEDULA),
                    Enter.theValue(datosExcel.leerDatosExcel("Datos.xlsx", "Registro", 1, 3)).into(TXT_NUM_DOCUMENTO),
                    Enter.theValue(datosExcel.leerDatosExcel("Datos.xlsx", "Registro", 1, 4)).into(TXT_NUM_TELEFONO),
                    Click.on(LST_CONTRIBUYENTE),
                    Click.on(SLC_CONTRIBUYENTE),
                    Enter.theValue(datosExcel.leerDatosExcel("Datos.xlsx","Registro",1,6)).into(TXT_EMAIL),
                    Click.on(CHK_TERMINOS),
                    Enter.theValue(datosExcel.leerDatosExcel("Datos.xlsx","Registro",1,7)).into(TXT_CLAVE),
                    WaitUntil.the(BTN_CREAR_CUENTA,isVisible()),
                    Click.on(BTN_CREAR_CUENTA)

            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Registro registroUsuario() {
        return instrumented(
                Registro.class
        );
    }
}
