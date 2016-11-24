package order.drink;

import order.Order;
        
/**
 * Klasa abstrakcyjna zapewniająca wspólny intefejs klasom potomnym 
 * niezbędnym do wykorzystywana we wzorcu Dekorator
 * 
 * @author gokon
 */
public abstract class Drink extends Order{
    String name = "unknown";
    
   /**
    * Służy do pobierania wartości name 
    * 
    * @return wartość tekstowa nazwy
    */    
    public String getName(){
        return name;
    }

   /**
    * Służy do zaimplemetowania w klasach potomnych
    * 
    * @return wartość liczbowa ceny
    */    
    public abstract double getPrice();
}
