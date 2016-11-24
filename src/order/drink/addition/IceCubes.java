package order.drink.addition;

import order.drink.Drink;

/**
 * Zapewnia utworzenie konkretnego obiektu opakowującego przesłany obiekt drink
 * 
 * @author gokon
 */
public class IceCubes extends AdditionsDecorator {
    Drink drink;

   /**
    * Inicjalizuje wartość drink przesłaną parametrem
    */     
    public IceCubes(Drink drink) {
        this.drink = drink;
    }

   /**
    * Wypisuje wartość name z przechowywanego obiektu drink wraz z wybraną nazwą dodatku kostek lodu
    * 
    * @return wartość tekstowa dotychczasowego zamówienia drink z dodatkiem
    */      
    public String getName() {
        return drink.getName() + ", ice cubes";
    }

   /**
    * Oblicza wartość dotychczasowego zamówienia
    * 
    * @return wartość tekstowa dotychczasowego zamówienia drink z sumowaną wartością dodatku kostek lodu
    */     
    public double getPrice() {
        return drink.getPrice() + 0.20;
    }
}
