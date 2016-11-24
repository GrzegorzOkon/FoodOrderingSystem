package order.lunch.mexicanfood;

/**
 * Zapewnia utworzenie konkretnego obiektu taco po wybraniu w menu
 * 
 * @author gokon
 */
public class Taco extends MexicanCuisine{
   /**
    * Inicjalizuje wartość name dziedziczoną z klasy Lunch
    */    
    public Taco() {
        name = "taco";
    }

   /**
    * Służy do pobierania wartości ceny
    * 
    * @return wartość liczbowa ceny taco
    */    
    public double getPrice() {
        return 10.99;
    }     
}
