package com.amazon.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.amazon.userinterface.AdicionarEliminarUi.*;
import static com.amazon.userinterface.AdicionarEliminarUi.btn_eliminar;
import static com.amazon.userinterface.UltimoProductoUi.BTN_CUMPLE;
import static com.amazon.userinterface.UltimoProductoUi.LBL_ULTIMO_PRODUCTO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionaUltimo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CUMPLE),
                WaitUntil.the(LBL_ULTIMO_PRODUCTO, isVisible()).forNoMoreThan(100).seconds(),
                Click.on(LBL_ULTIMO_PRODUCTO)
//                WaitUntil.the(btn_eliminar, isVisible()).forNoMoreThan(100).seconds()

                //  Click.on(btn_go_cart),
                // WaitUntil.the(btn_delete_from_cart, isVisible()).forNoMoreThan(100).seconds(),
                //  Click.on(btn_delete_from_cart)
        );
    }
    public static com.amazon.tasks.SeleccionaUltimo Item(){
        return Tasks.instrumented(com.amazon.tasks.SeleccionaUltimo.class);
    }
}
