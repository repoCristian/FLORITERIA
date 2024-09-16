package com.amazon.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class UltimoProductoUi {
    public static final Target BTN_CUMPLE = Target.the("click cumple ").locatedBy("//ul[@id=\"primary-menu\"]/li[4]/a");
    public static final Target LBL_ULTIMO_PRODUCTO = Target.the("click ultimo_producto ").locatedBy("//*[@id=\"content\"]/div[2]/div/div[last()]/div/div[1]");
    public static final Target productos_carrito = Target.the("productos carrito").locatedBy("//span[@class='mini-cart-items']");
}
