package order.lunch.mexicanfood;

import order.lunch.mexicanfood.MexicanCuisine;

/**
 * Zapewnia utworzenie konkretnego obiektu burito po wybraniu w menu
 * 
 * @author gokon
 */
public class Burrito extends MexicanCuisine{
   /**
    * Inicjalizuje wartość name dziedziczoną z klasy Lunch
    */    
    public Burrito() {
        name = "burrito";
    }

   /**
    * Służy do pobierania wartości ceny
    * 
    * @return wartość liczbowa ceny burito
    */    
    public double getPrice() {
        return 9.99;
    }     
}
