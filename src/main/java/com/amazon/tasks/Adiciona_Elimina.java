package com.amazon.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.amazon.userinterface.AdicionarEliminarUi.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class  Adiciona_Elimina  implements Task {
        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(btn_cumple),
                    Click.on(btn_producto),
                    Click.on(btn_adicionar),
                    WaitUntil.the(btn_eliminar, isVisible()).forNoMoreThan(100).seconds(),
                    Click.on(btn_eliminar)

                    //  Click.on(btn_go_cart),
                    // WaitUntil.the(btn_delete_from_cart, isVisible()).forNoMoreThan(100).seconds(),
                    //  Click.on(btn_delete_from_cart)
            );
        }
        public static com.amazon.tasks.Adiciona_Elimina Item(){
            return Tasks.instrumented(com.amazon.tasks.Adiciona_Elimina.class);
        }
    }

