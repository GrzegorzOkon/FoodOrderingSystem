package order.lunch.desserts;

import order.lunch.Lunch;

/**
 * Zapewnia utworzenie konkretnego obiektu opakowującego przesłany obiekt lunch
 * 
 * @author gokon
 */
public class IceCream extends DessertsDecorator {
    Lunch lunch;

   /**
    * Inicjalizuje wartość lunch przesłaną parametrem
    */     
    public IceCream(Lunch lunch) {
        this.lunch = lunch;
    }

   /**
    * Wypisuje wartość name z przechowywanego obiektu lunch wraz z wybraną nazwą lodów 
    * 
    * @return wartość tekstowa dotychczasowego zamówienia lunch z deserem
    */    
    public String getName() {
        return lunch.getName() + ", ice cream";
    }

   /**
    * Oblicza wartość dotychczasowego zamówienia
    * 
    * @return wartość tekstowa dotychczasowego zamówienia lunch z sumowaną wartością lodów
    */    
    public double getPrice() {
        return lunch.getPrice() + 5.99;
    }    
}
