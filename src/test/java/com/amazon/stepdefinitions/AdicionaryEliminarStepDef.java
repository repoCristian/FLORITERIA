package com.amazon.stepdefinitions;

import com.amazon.questions.CartWithoutItemsQuestion;
import com.amazon.tasks.AddAndDelete;
import com.amazon.tasks.Adiciona_Elimina;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.Is.is;

public class AdicionaryEliminarStepDef {
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Cuando("el adiciona un producto de cumpleanios para eliminarlo")
    public void cuandoElAdicionaUnProductoDeCumpleaniosParaEliminarlo(){
        theActorInTheSpotlight().attemptsTo(Adiciona_Elimina.Item());
    }

    @Entonces("el deberia ver el carrito vacio")
    public void entoncesElDeberiaVerElCarritoVacio(){
        theActorInTheSpotlight().should(seeThat(CartWithoutItemsQuestion.ProductsCart(), is(true)));
    }
}
