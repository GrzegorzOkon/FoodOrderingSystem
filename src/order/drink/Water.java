package order.drink;

/**
 * Zapewnia utworzenie konkretnego obiektu wody po wybraniu w menu
 * 
 * @author gokon
 */
public class Water extends Drink {
   /**
    * Inicjalizuje wartość name dziedziczoną z klasy Drink
    */    
    public Water() {
        name = "water";
    }
 
   /**
    * Służy do pobierania wartości ceny wody 
    * 
    * @return wartość liczbowa ceny
    */    
    public double getPrice() {
        return 1.99;
    }
}
