package com.amazon.stepdefinitions;

import com.amazon.tasks.SeleccionaProducto;
import com.amazon.tasks.Abre;
import com.amazon.questions.CarritoConDosProductosPreguntas;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.Is.is;

public class AddToCartStepDefitinions {


    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Dado("que el {} abre un sitio web")
    public void  Dadoqueelusuarioabreunsitioweb(String actorName){
        theActorCalled(actorName).wasAbleTo(Abre.laUrl());
    }

    @Cuando("el adiciona productos al carrito")
    public void Cuandoeladicionaproductosalcarrito(DataTable data){
        theActorInTheSpotlight().attemptsTo(SeleccionaProducto.Form(data));
    }

    @Entonces("el deberia ver los productos")
    public void Entonceseldeberiaverlosproductos(){
    theActorInTheSpotlight().should(seeThat(CarritoConDosProductosPreguntas.ProductsCart(), is(true)));
    }

}
