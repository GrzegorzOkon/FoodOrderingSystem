package order.lunch.italianfood;

/**
 * Zapewnia utworzenie konkretnego obiektu pizzy po wybraniu w menu
 * 
 * @author gokon
 */
public class Pizza extends ItalianCuisine{
   /**
    * Inicjalizuje wartość name dziedziczoną z klasy Lunch
    */     
    public Pizza() {
        name = "pizza";
    }

   /**
    * Służy do pobierania wartości ceny
    * 
    * @return wartość liczbowa ceny pizzy
    */    
    public double getPrice() {
        return 12.99;
    }      
}
