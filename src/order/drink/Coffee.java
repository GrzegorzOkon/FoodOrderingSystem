package order.drink;

/**
 * Zapewnia utworzenie konkretnego obiektu kawy po wybraniu w menu
 * 
 * @author gokon
 */
public class Coffee extends Drink {
   /**
    * Inicjalizuje wartość name dziedziczoną z klasy Drink
    */     
    public Coffee() {
        name = "coffee";
    }

   /**
    * Służy do pobierania wartości ceny kawy 
    * 
    * @return wartość liczbowa ceny
    */     
    public double getPrice() {
        return 3.99;
    }      
}
