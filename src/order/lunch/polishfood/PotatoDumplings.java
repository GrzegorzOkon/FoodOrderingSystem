package order.lunch.polishfood;

import order.lunch.polishfood.PolishCuisine;

/**
 * Zapewnia utworzenie konkretnego obiektu kopytek po wybraniu w menu
 * 
 * @author gokon
 */
public class PotatoDumplings extends PolishCuisine{
   /**
    * Inicjalizuje wartość name dziedziczoną z klasy Lunch
    */    
    public PotatoDumplings() {
        name = "dumplings";
    }

   /**
    * Służy do pobierania wartości ceny
    * 
    * @return wartość liczbowa ceny kopytek
    */    
    public double getPrice() {
        return 5.99;
    }       
}
