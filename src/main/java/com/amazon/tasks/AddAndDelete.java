package com.amazon.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


public class  AddAndDelete  implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

              //  Click.on(btn_go_cart),
               // WaitUntil.the(btn_delete_from_cart, isVisible()).forNoMoreThan(100).seconds(),
              //  Click.on(btn_delete_from_cart)
        );
    }
    public static AddAndDelete Item(){
        return Tasks.instrumented(AddAndDelete.class);
    }
}
