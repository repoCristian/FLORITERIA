package com.amazon.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class AdicionarEliminarUi {

    public static final Target btn_cumple = Target.the("click cumple ").locatedBy("//ul[@id=\"primary-menu\"]/li[4]/a");
    public static final Target btn_producto = Target.the("click producto ").locatedBy("//h3[@class = 'name']/a[text()='MDF 00014']");
    public static final Target btn_adicionar = Target.the("click adicionar ").locatedBy("//button[@name = 'add-to-cart']");
    public static final Target btn_eliminar = Target.the("click a eliminar ").locatedBy("//a[@title='Remove this item']");

}