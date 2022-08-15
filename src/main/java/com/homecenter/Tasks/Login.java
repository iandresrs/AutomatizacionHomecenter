package com.homecenter.Tasks;


import com.homecenter.Utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.homecenter.UserUi.InicioPage.BTN_MICUENTA;
import static com.homecenter.UserUi.LoginPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {
    Datos datosExcel = new Datos();

    @Override
        public <T extends Actor> void performAs(T actor) {
            try {
                actor.attemptsTo(
                        WaitUntil.the(BTN_MICUENTA,isVisible()),
                        Click.on(BTN_MICUENTA),
                        Enter.theValue(datosExcel.leerDatosExcel("Datos.xlsx","Login",1,0)).into(TXT_EMAIL),
                        Enter.theValue(datosExcel.leerDatosExcel("Datos.xlsx","Login",1,1)).into(TXT_CLAVE),
                        WaitUntil.the(BTN_INGRESAR,isClickable()),
                        Click.on(BTN_INGRESAR)
                );
            }catch (Exception e){
                e.printStackTrace(System.out);
            }
        }
    public static Login InicioSesion(){
        return instrumented(Login.class);
    }
}
