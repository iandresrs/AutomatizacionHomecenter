package com.homecenter.Tasks;

import com.homecenter.Utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.homecenter.UserUi.CarritoCompraPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SegundoProducto implements Task {
    Datos datosExcel = new Datos();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Enter.theValue(datosExcel.leerDatosExcel("Datos.xlsx", "Producto", 1, 0)).into(TXT_BUSCAR_SUB_CATEGORIA),
                    Click.on(TXT_ELEGIR_SUBCATEGORIA),
                    Click.on(IMG_PRODUCTO_DOS),
                    Click.on(BTN_AGREGAR_CARRITO),
                    Click.on(BTN_IR_CARRITO)
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SegundoProducto elegir() {
        return instrumented(SegundoProducto.class);
    }
}
