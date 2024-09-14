package com.amazon.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class UiFloristeria {

    public static final Target BTN_AMOR = Target.the("CLICK EN BOTON AMOR")
            .locatedBy("//ul[@id=\"primary-menu\"]/li[3]/a");

    public static final Target LBL_PRIMER_PRODUCTO = Target.the("CLICK EN LBL PRIMER_PRODUCTO")
            .locatedBy("//h3[@class='name' ]/a[text()= 'MDF 0001']");

    public static final Target LBL_ANADIR_PRODUCTO = Target.the("CLICK EN LBL ANADIR_PRODUCTO")
            .locatedBy("//button[@name='add-to-cart']");

    public static final Target LBL_SEGUNDO_PRODUCTO = Target.the("CLICK EN LBL SEGUNDO_PRODUCTO")
            .locatedBy("//h3[@class='name' ]/a[text()= 'MDF 00010']");

    public static final Target LBL_PRODUCTOS_CARRITO = Target.the("PRODUCTOS CARRITO")
            .locatedBy("//span[@class='mini-cart-items']");

    public static final Target add_second_item = Target.the("second item").locatedBy("//a[contains(.,'{0}')]");

//h3[@class='name' ]/a[text()= 'MDF 0001']


}
