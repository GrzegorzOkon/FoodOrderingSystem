package consolemenu;

import order.*;
import order.drink.addition.*;
import order.drink.*;
import order.lunch.*;
import order.lunch.desserts.*;
import order.lunch.italianfood.*;
import order.lunch.mexicanfood.*;
import order.lunch.polishfood.*;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.util.*;

/**
 * Uruchamia menu w oknie konsoli wraz z przypisaniem akcji do poszczegolnych opcji.
 *
 * @author gokon
 */
public class ConsoleMenu {
    public static void main(String[] args) {
        //Tworzy zmienne lokalne        
        int mainMenuChoice;
        double price = 0;
        
        ArrayList<Order> order = new ArrayList<Order>();
        ConsoleMenu dane = new ConsoleMenu();
        DecimalFormat f = new DecimalFormat("####.00");  //służy do formatowania typu Double do formatu walutowego
        Scanner scanner;
               
        //Pętla tworzy główne menu 
        do {
            //Uruchamia metodę showMainMenu
            mainMenuChoice = dane.showMainMenu();;  
                
            //Pobiera wynik wyboru z menu głównego i wywołuje przypisane akcje
            switch (mainMenuChoice) {
                case 1:
                    int lunchMenuChoice;
                    
                    do {
                        // Uruchamia podmenu wyboru lunchu
                        lunchMenuChoice = showLunchMenu();
                        Lunch lunch = null;
                        
                        switch(lunchMenuChoice) {
                            case 1:
                                int italianMenuChoice;
                                
                                do {
                                    // Uruchamia podmenu wyboru dań włoskich
                                    italianMenuChoice = showItalianMenu();
                                    int dessertsMenuChoice;
                                    
                                    switch(italianMenuChoice) {
                                        case 1:
                                            lunch = new Pizza();                                            
                                                    
                                            do {
                                                // Uruchamia podmenu wyboru deserów
                                                dessertsMenuChoice = showDessertsMenu();
                                                
                                                switch(dessertsMenuChoice) {
                                                    case 1:     
                                                        lunch = new FruitSalad(lunch);                                        
                                                        break;  
                                                    case 2:
                                                        lunch = new IceCream(lunch);                                        
                                                        break;   
                                                    case 3:
                                                        break;
                                                }
                                            //Dopóki użytkwonik nie wybierze opcji wyboru pętla działa 
                                            } while(dessertsMenuChoice != 3);
                                            
                                            order.add(lunch);
                                            break;                                            
                                        case 2:
                                            lunch = new Spaghetti();
                                                    
                                            do {
                                                dessertsMenuChoice = showDessertsMenu();
                                                
                                                switch(dessertsMenuChoice) {
                                                    case 1:                                                        
                                                        lunch = new FruitSalad(lunch);                                        
                                                        break;  
                                                    case 2:
                                                        lunch = new IceCream(lunch);                                        
                                                        break;                                                         
                                                }
                                            } while(dessertsMenuChoice != 3);
                                            
                                            order.add(lunch);
                                            break;
                                        case 3:
                                            break;
                                    }
                                } while(italianMenuChoice != 3);
                                break;                            
                            case 2:                                
                                int mexicanMenuChoice;
                                
                                do {
                                    int dessertsMenuChoice;
                                    mexicanMenuChoice = showMexicanMenu();
                                    
                                    switch(mexicanMenuChoice) {
                                        case 1:
                                            lunch = new Burrito();                                            
                                                    
                                            do {
                                                dessertsMenuChoice = showDessertsMenu();
                                                
                                                switch(dessertsMenuChoice) {
                                                    case 1:                                                        
                                                        lunch = new FruitSalad(lunch);                                        
                                                        break;  
                                                    case 2:
                                                        lunch = new IceCream(lunch);                                        
                                                        break;   
                                                    case 3:
                                                        break;
                                                }
                                            } while(dessertsMenuChoice != 3);
                                            
                                            order.add(lunch);
                                            break; 
                                        case 2:
                                            lunch = new Taco();                                            
                                                    
                                            do {
                                                dessertsMenuChoice = showDessertsMenu();
                                                
                                                switch(dessertsMenuChoice) {
                                                    case 1:                                                        
                                                        lunch = new FruitSalad(lunch);                                        
                                                        break;  
                                                    case 2:
                                                        lunch = new IceCream(lunch);                                        
                                                        break;   
                                                    case 3:
                                                        break;
                                                }
                                            } while(dessertsMenuChoice != 3);
                                            
                                            order.add(lunch);
                                            break; 
                                        case 3:
                                            break;
                                    }
                                } while(mexicanMenuChoice != 3);
                                break;
                            case 3:
                                int polishMenuChoice;
                                
                                do {
                                    int dessertsMenuChoice;
                                    polishMenuChoice = showPolishMenu();
                                    
                                    switch(polishMenuChoice) {
                                        case 1:
                                            lunch = new Dumplings();                                            
                                                    
                                            do {
                                                dessertsMenuChoice = showDessertsMenu();
                                                
                                                switch(dessertsMenuChoice) {
                                                    case 1:                                                        
                                                        lunch = new FruitSalad(lunch);                                        
                                                        break;  
                                                    case 2:
                                                        lunch = new IceCream(lunch);                                        
                                                        break;   
                                                    case 3:
                                                        break;
                                                }
                                            } while(dessertsMenuChoice != 3);
                                            
                                            order.add(lunch);
                                            break;
                                        case 2:
                                            lunch = new PotatoDumplings();                                            
                                                    
                                            do {
                                                dessertsMenuChoice = showDessertsMenu();
                                                
                                                switch(dessertsMenuChoice) {
                                                    case 1:                                                        
                                                        lunch = new FruitSalad(lunch);                                        
                                                        break;  
                                                    case 2:
                                                        lunch = new IceCream(lunch);                                        
                                                        break;   
                                                    case 3:
                                                        break;
                                                }
                                            } while(dessertsMenuChoice != 3);
                                            
                                            order.add(lunch);
                                            break;
                                        case 3:
                                            break;
                                    }
                                } while(polishMenuChoice != 3);
                                break;                                
                            case 4:
                                break;                                
                        }                                                
                    } while(lunchMenuChoice != 4);  
                    
                    break;
                case 2:               
                     int drinkMenuChoice;
                     
                    //Tworzy podmenu wyboru kolejnych opcji
                    do {
                        //Wyświetla podmenu napojów
                        drinkMenuChoice = dane.showDrinkMenu();
                        int extrasMenuChoice;
                        Drink drink = null;
                        
                        //Pobiera wynik wyboru z podmenu i uruchamia akcje
                        switch(drinkMenuChoice) {                                                            
                            case 1:                                 
                                drink = new Coffee();
                                
                                do {                                
                                    extrasMenuChoice = dane.showExtrasMenu();
                                
                                    switch(extrasMenuChoice) {
                                        case 1: 
                                            drink = new IceCubes(drink);                                        
                                            break;
                                        case 2:
                                            drink = new Lemon(drink);
                                            break;
                                        case 3:
                                            break;
                                    }
                                } while (extrasMenuChoice != 3);
                                break;
                            case 2:  
                                drink = new Tea();
                                
                                do {                                
                                    extrasMenuChoice = dane.showExtrasMenu();
                                
                                    switch(extrasMenuChoice) {
                                        case 1: 
                                            drink = new IceCubes(drink);                                        
                                            break;
                                        case 2:
                                            drink = new Lemon(drink);
                                            break;
                                        case 3:
                                            break;
                                    }
                                } while (extrasMenuChoice != 3);
                                break;
                            case 3:  
                                drink = new Water();
                                
                                do {                                
                                    extrasMenuChoice = dane.showExtrasMenu();
                                
                                    switch(extrasMenuChoice) {
                                        case 1: 
                                            drink = new IceCubes(drink);                                        
                                            break;
                                        case 2:
                                            drink = new Lemon(drink);
                                            break;
                                        case 3:
                                            break;
                                    }
                                } while (extrasMenuChoice != 3);    
                                break;
                        }                        
                    
                        order.add(drink);
      
                    } while (drinkMenuChoice != 4);
                    
                    break;
                    
                //Tworzy raport
                case 3: 
                    System.out.println("\nMy order:");
                    
                    for (Order item: order) {
                        if (item instanceof Lunch) {
                            System.out.println(((Lunch)item).getName()); 
                            price += ((Lunch)item).getPrice();
                        }                        
                        if (item instanceof Drink) {
                            System.out.println(((Drink)item).getName()); 
                            price += ((Drink)item).getPrice();
                        }
                    }
                    //Formatuje cenę zamówienia do formatu waluty
                    System.out.println("\nPrice: " + f.format(price) + " zł");
                    break;
                    
                //Wychodzi z programu
                case 4:
                    System.out.println("");
                    System.exit(0);
            }   
        //Dopóki użytkownik nie zakończy programu pętla działa
        } while (mainMenuChoice != 4);
    }
        
    /** 
     * Metoda wyświetla menu główne i zwraca wynik wyboru
     *
     * @return wartośc liczbowa wyboru
     */
    public static int showMainMenu() {
        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("");
        System.out.println("Choose a number:");
        System.out.println("-------------------------\n");
        System.out.println("1 - Order lunch");
        System.out.println("2 - Order drink");
        System.out.println("3 - Show order");
        System.out.println("4 - Exit");
        System.out.println("");

        selection = input.nextInt();
        return selection;    
    }  

    /** 
     * Metoda wyświetla menu wyboru obiadu i zwraca wynik wyboru
     *
     * @return wartośc liczbowa wyboru
     */
    public static int showLunchMenu() {
        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("");
        System.out.println("Choose a cuisine:");
        System.out.println("-------------------------\n");
        System.out.println("1 - Italian cuisine");
        System.out.println("2 - Mexican cuisine");
        System.out.println("3 - Polish cuisine");
        System.out.println("4 - Return");
        System.out.println("");

        selection = input.nextInt();
        return selection;    
    } 
    
    /** 
     * Metoda wyświetla menu wyboru napoju i zwraca wynik wyboru
     *
     * @return wartośc liczbowa wyboru
     */
    public static int showDrinkMenu() {
        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("");
        System.out.println("Choose a drink:");
        System.out.println("-------------------------\n");
        System.out.println("1 - Coffee");
        System.out.println("2 - Tea");
        System.out.println("3 - Water");
        System.out.println("4 - Return");
        System.out.println("");

        selection = input.nextInt();
        return selection;    
    } 

    /** 
     * Metoda wyświetla menu wyboru dań włoskich i zwraca wynik wyboru
     *
     * @return wartośc liczbowa wyboru
     */
    public static int showItalianMenu() {
        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("");
        System.out.println("Choose a main course:");
        System.out.println("-------------------------\n");
        System.out.println("1 - Pizza");
        System.out.println("2 - Spaghetti");
        System.out.println("3 - Return");
        System.out.println("");

        selection = input.nextInt();
        return selection;          
    }    

    /** 
     * Metoda wyświetla menu wyboru dań meksykańskich i zwraca wynik wyboru
     *
     * @return wartośc liczbowa wyboru
     */
    public static int showMexicanMenu() {
        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("");
        System.out.println("Choose a main course:");
        System.out.println("-------------------------\n");
        System.out.println("1 - Burrito");
        System.out.println("2 - Taco");
        System.out.println("3 - Return");
        System.out.println("");

        selection = input.nextInt();
        return selection;          
    }

    /** 
     * Metoda wyświetla menu wyboru dań polskich i zwraca wynik wyboru
     *
     * @return wartośc liczbowa wyboru
     */    
    public static int showPolishMenu() {
        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("");
        System.out.println("Choose a main course:");
        System.out.println("-------------------------\n");
        System.out.println("1 - Dumplings");
        System.out.println("2 - Potato dumplings");
        System.out.println("3 - Return");
        System.out.println("");

        selection = input.nextInt();
        return selection;          
    } 

    /** 
     * Metoda wyświetla menu wyboru deserów i zwraca wynik wyboru
     *
     * @return wartośc liczbowa wyboru
     */
    public static int showDessertsMenu() {
        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("");
        System.out.println("Choose an addition:");
        System.out.println("-------------------------\n");
        System.out.println("1 - Fruit salad");
        System.out.println("2 - Ice cream");
        System.out.println("3 - Return");
        System.out.println("");

        selection = input.nextInt();
        return selection;          
    }

    /** 
     * Metoda wyświetla menu wyboru dodatków do napojów i zwraca wynik wyboru
     *
     * @return wartośc liczbowa wyboru
     */    
    public static int showExtrasMenu() {
        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("");
        System.out.println("Choose an addition:");
        System.out.println("-------------------------\n");
        System.out.println("1 - Ice cubes");
        System.out.println("2 - Lemon");
        System.out.println("3 - Return");
        System.out.println("");

        selection = input.nextInt();
        return selection;          
    }
}
