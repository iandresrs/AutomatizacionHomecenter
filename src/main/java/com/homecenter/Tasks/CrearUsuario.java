package com.homecenter.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.homecenter.UserUi.RegistroPage.BTN_CREAR_CUENTA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CrearUsuario implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CREAR_CUENTA)
        );
    }

    public static CrearUsuario crear(){
        return instrumented(CrearUsuario.class);
    }
}
