package order.lunch.italianfood;

/**
 * Zapewnia utworzenie konkretnego obiektu spagetti po wybraniu w menu
 * 
 * @author gokon
 */
public class Spaghetti extends ItalianCuisine{
   /**
    * Inicjalizuje wartość name dziedziczoną z klasy Lunch
    */    
    public Spaghetti() {
        name = "spaghetti";
    }

   /**
    * Służy do pobierania wartości ceny
    * 
    * @return wartość liczbowa ceny spagetti
    */    
    public double getPrice() {
        return 10.99;
    }     
}
