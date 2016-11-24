package order.lunch.desserts;

import order.lunch.Lunch;

/**
 * Zapewnia utworzenie konkretnego obiektu opakowującego przesłany obiekt lunch
 * 
 * @author gokon
 */
public class FruitSalad extends DessertsDecorator{
    Lunch lunch;

   /**
    * Inicjalizuje wartość lunch przesłaną parametrem
    */    
    public FruitSalad(Lunch lunch) {
        this.lunch = lunch;
    }

   /**
    * Wypisuje wartość name z przechowywanego obiektu lunch wraz z wybraną nazwą sałatki owocowej 
    * 
    * @return wartość tekstowa dotychczasowego zamówienia lunch z deserem
    */    
    public String getName() {
        return lunch.getName() + ", fruit salad";
    }

   /**
    * Oblicza wartość dotychczasowego zamówienia
    * 
    * @return wartość tekstowa dotychczasowego zamówienia lunch z sumowaną wartością sałatki owocowej
    */      
    public double getPrice() {
        return lunch.getPrice() + 6.99;
    }      
}
