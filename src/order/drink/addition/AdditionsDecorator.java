package order.drink.addition;

import order.drink.Drink;

/**
 * Klasa abstrakcyjna zapewniająca wspólny intefejs klasom potomnym opakowujacym obiekty drink 
 * niezbędnym do wykorzystywana we wzorcu Dekorator
 * 
 * @author gokon
 */
public abstract class AdditionsDecorator extends Drink {
   /**
    * Służy do pobierania wartości name 
    * 
    * @return wartość tekstowa nazwy
    */     
    public abstract String getName();
}
