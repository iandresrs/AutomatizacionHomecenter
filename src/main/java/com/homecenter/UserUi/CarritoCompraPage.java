package com.homecenter.UserUi;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CarritoCompraPage {
    public static final Target BTN_CATEGORIA = Target.the("Click en categoria decoracion").located(By.xpath("//li/a[text()='Decoración, Menaje e Iluminación']"));
    public static final Target LLB_SUB_CATEGORIA = Target.the("Click en subcategoria").located(By.xpath("//li/a[@href='https://www.homecenter.com.co/homecenter-co/category/cat10116/espejos/']"));
    public static final Target BTN_MANTENER = Target.the("Click en boton mantener").located(By.xpath("//button[text()='Mantener']"));
    public static final Target IMG_PRODUCTO_UNO = Target.the("Click en la imagen producto").located(By.xpath("//a[@href='/homecenter-co/product/CS5164/combo-x-2-espejos-plateados-50x70cm/CS5164/']"));

    public static final Target BTN_AGREGAR_CARRITO = Target.the("Click boton agregar carrito").located(By.xpath("(//button[@class='jsx-1943825418 button button-primary    jsx-441486922'])[1]"));

    public static final Target BTN_VER_MAS_PRODUCTO = Target.the("Click boton ver mas productos").located(By.id("testId-btn-view-products-button"));
    public static final Target TXT_BUSCAR_SUB_CATEGORIA = Target.the("Busca el nombre de la sub categoria").located(By.id("testId-input-typeahead-desktop"));
    public static final Target TXT_ELEGIR_SUBCATEGORIA = Target.the("Elige la sub categoria").located(By.xpath("(//*[@id=\"testId-Link-keyword-suggestion-item-cuadros laminas\"]/span)[2]"));

    public static final Target IMG_PRODUCTO_DOS = Target.the("Click en la imagen segundo producto").located(By.xpath("(//a[@href='/homecenter-co/product/879470/cuadro-african-pano-80x60cm/879470/'])[1]"));

    public static final Target BTN_IR_CARRITO = Target.the("Click ir al carrito").located(By.id("testId-btn-goto-cart-button"));
}
