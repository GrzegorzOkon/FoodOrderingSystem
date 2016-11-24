package order.lunch.desserts;

import order.lunch.*;

/**
 * Klasa abstrakcyjna zapewniająca wspólny intefejs klasom potomnym opakowujacym obiekty lunch 
 * niezbędnym do wykorzystywana we wzorcu Dekorator
 * 
 * @author gokon
 */
public abstract class DessertsDecorator extends Lunch{
   /**
    * Służy do pobierania wartości name 
    * 
    * @return wartość tekstowa nazwy
    */      
    public abstract String getName();    
}
