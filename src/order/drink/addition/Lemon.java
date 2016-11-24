package order.drink.addition;

import order.drink.Drink;

/**
 * Zapewnia utworzenie konkretnego obiektu opakowującego przesłany obiekt drink
 * 
 * @author gokon
 */
public class Lemon extends AdditionsDecorator {
    Drink drink;

   /**
    * Inicjalizuje wartość drink przesłaną parametrem
    */     
    public Lemon(Drink drink) {
        this.drink = drink;
    }

   /**
    * Wypisuje wartość name z przechowywanego obiektu drink wraz z wybraną nazwą dodatku cytryny
    * 
    * @return wartość tekstowa dotychczasowego zamówienia drink z dodatkiem
    */    
    public String getName() {
        return drink.getName() + ", lemon";
    }

   /**
    * Oblicza wartość dotychczasowego zamówienia
    * 
    * @return wartość tekstowa dotychczasowego zamówienia drink z sumowaną wartością dodatku cytryny
    */    
    public double getPrice() {
        return drink.getPrice() + 0.50;
    }    
}
