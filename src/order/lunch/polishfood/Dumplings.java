package order.lunch.polishfood;

/**
 * Zapewnia utworzenie konkretnego obiektu pierogów po wybraniu w menu
 * 
 * @author gokon
 */
public class Dumplings extends PolishCuisine{
   /**
    * Inicjalizuje wartość name dziedziczoną z klasy Lunch
    */    
    public Dumplings() {
        name = "dumplings";
    }

   /**
    * Służy do pobierania wartości ceny
    * 
    * @return wartość liczbowa ceny pierogów
    */    
    public double getPrice() {
        return 6.99;
    }      
}
