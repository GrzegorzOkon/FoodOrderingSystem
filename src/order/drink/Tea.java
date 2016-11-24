package order.drink;

/**
 * Zapewnia utworzenie konkretnego obiektu herbaty po wybraniu w menu
 * 
 * @author gokon
 */
public class Tea extends Drink {
   /**
    * Inicjalizuje wartość name dziedziczoną z klasy Drink
    */    
    public Tea() {
        name = "tea";
    }

   /**
    * Służy do pobierania wartości ceny
    * 
    * @return wartość liczbowa ceny herbaty
    */    
    public double getPrice() {
        return 2.99;
    }    
}
