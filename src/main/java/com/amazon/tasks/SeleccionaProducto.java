package com.amazon.tasks;

import com.amazon.userinterface.UiFloristeria;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

import static com.amazon.userinterface.UiFloristeria.*;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class SeleccionaProducto implements Task {

    private DataTable data;


    public SeleccionaProducto(DataTable data) {
        this.data = data;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Map<String, String>> valores = data.asMaps(String.class, String.class);


        actor.attemptsTo(
            WaitUntil.the(BTN_AMOR, isVisible()).forNoMoreThan(10).seconds(),
            Click.on(BTN_AMOR),
            Click.on(LBL_PRIMER_PRODUCTO),
            Click.on(LBL_ANADIR_PRODUCTO),
            Click.on(BTN_AMOR),
            Click.on(LBL_SEGUNDO_PRODUCTO),
            Click.on(LBL_ANADIR_PRODUCTO),
            Click.on(LBL_PRODUCTOS_CARRITO)

//
        );
    }

    public static SeleccionaProducto Form(DataTable data) {
        return Tasks.instrumented(SeleccionaProducto.class, data);
    }
}
