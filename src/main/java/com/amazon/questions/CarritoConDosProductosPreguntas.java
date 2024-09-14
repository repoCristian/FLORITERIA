package com.amazon.questions;

import com.amazon.userinterface.CartUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


import static com.amazon.userinterface.UiFloristeria.LBL_PRODUCTOS_CARRITO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.Text.of;

import net.serenitybdd.screenplay.waits.WaitUntil;

public class CarritoConDosProductosPreguntas implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(LBL_PRODUCTOS_CARRITO, isVisible()).forNoMoreThan(100).seconds());
        String text = of(LBL_PRODUCTOS_CARRITO).answeredBy(actor);

        if ("2".equals(text)) {
            return true;
        } else {

            throw new AssertionError("Expected value '2' but found '" + text + "'");
        }
    }

    public static CarritoConDosProductosPreguntas ProductsCart() {
        return new CarritoConDosProductosPreguntas();
    }
}
