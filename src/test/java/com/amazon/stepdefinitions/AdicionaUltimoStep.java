package com.amazon.stepdefinitions;

import com.amazon.questions.CartWithoutItemsQuestion;
import com.amazon.tasks.SeleccionaUltimo;
import com.amazon.userinterface.CartUI;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.Is.is;

public class AdicionaUltimoStep {

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Cuando("el adiciona el ultimo producto de nuevos productos")
    public void cuandoelAdicionaElUltimoProductoDeNuevosProductos(){
        theActorInTheSpotlight().attemptsTo(SeleccionaUltimo.Item());
    }

    @Entonces("el deberia ver un producto en el carrito")
    public void entoncesElDeberiaVerUnProductoEnElCarrito(){
        theActorInTheSpotlight().should(seeThat(CartWithoutItemsQuestion.ProductsCart(), is(true)));
    }

}
