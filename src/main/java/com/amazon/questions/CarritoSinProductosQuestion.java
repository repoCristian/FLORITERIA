package com.amazon.questions;

import com.amazon.userinterface.CartUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.Text.of;

public class CarritoSinProductosQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(CartUI.productos_carrito, isVisible()).forNoMoreThan(100).seconds());
                String text = of(CartUI.productos_carrito).answeredBy(actor);
        if ("0".equals(text)) {
            return true;
        } else {
            throw new AssertionError("Expected value '0' but found '" + text + "'");
        }
    }

    public static CarritoSinProductosQuestion ProductsCart() {
        return new CarritoSinProductosQuestion();
    }

}
