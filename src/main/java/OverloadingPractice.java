import java.util.Arrays;

    /*
       Welcome to assignment five,
       Where you will practice with using visibility modifiers and overloading.
       In this task you will make your own classes, and learn to use encapsulation
       to protect the attributes inside them. from unwanted access.

       ------------------------------------------------------------
       Visibility
       -------------------------------------------------------------
       One of the most important aspects of object-oriented design is data hiding, or encapsulation.
       By default, the variables and methods of a class are accessible to members
       of the class itself and to other classes in the same package.
       However, for security reasons we might want to limit this to only accessible
       from same class, by using "private" access modifier. On the other side,
       some methods need to be accessible outside their package, because of
       the program functionality, that can be achieved by using "public" access modifier.
       It is considered to be good practise to make all class attributes private
       and create getters and setters to access them.

       ------------------------------------------------------------
       Overriding
       -------------------------------------------------------------
       Sometimes in programming it is necessary to perform the same operation
       several times with slightly different parameters. For example, we might want to
       make create a new user with a name and lastname, and another user with name last name and middle name.
       In this case we can use constructor overloading and make User(String name, String lastname) and
       User(String name, String middleName, String lastname) constructors. Overloading can also
       be used in methods that have the same name, but different attributes.
       For example: createUser(String name, String password) and createUser(String name, String password, String role)

       In this exercise, you will practice using visibility modifiers and overloading
       to create a pizzeria software program, for making pizzas, calculating prices and printing receipts.
       Scroll down to STEP 1:
       */

/**
 * This is the Main method,
 * Uncomment the lines of code for each method you implement
 * to test your solution.
 */

public class OverloadingPractice {
    public static void main(String[] args) {
        OverloadingPractice op = new OverloadingPractice();
        System.out.println("Task 1: " ); op.getPizzaInfo();
        System.out.println("Task 2: " ); op.createPizzas();
        System.out.println("Task 3: " ); op.printPizzas();
        System.out.println("Task 4: " ); op.createOrder();
        System.out.println("Task 5: " ); op.calculateTotalPrice();


    }
    /**
     * Task 1
     * Create a Pizza class, with name, price, size and ingredients attributes.
     * See the UML diagram provided in the UML folder to see attribute types.
     * We will only implement the Pizza class from the diagram in this step.
     * Make a constructor that allows to create a new pizza using a name.
     * The constructor must also det pizza price to 80, and ingredients array to {"crust","cheese","ketchup"}
     * Since all attributes must be private, create getters for all the attributes.
     * Uncomment the getPizzaInfo method to test your solution.
     * You can read more about implementing UML diagrams as code in:
     * "Introduction to Java Programming and Data Structures book" 9.2 Defining Classes for Objects
     * Points: 2
     * New skills: visibility and getters
     * Difficulty: 2
     */

    public void getPizzaInfo(){
        Pizza standardPizza = new Pizza("Margherita");
        System.out.println(
                "Pizza name: " + standardPizza.getName() +
                        " price: "+ standardPizza.getPrice() +
                        " ingredients: "+  Arrays.toString(standardPizza.getIngredients()));
    }



    /**
     * Task 2
     * Our pizzeria will be making different types of pizzas,
     * for that we will be overloading the Pizza constructor
     * with different attributes, to make 3 different constructors.
     * Constructor 1: (created in step 1) Pizza(String name)
     * Constructor 2: Pizza(String name, String extraIngredient)
     * this constructor sets the price to 90 and ingredients to {"crust","cheese","ketchup", extraIngredient}
     * Constructor 3: Pizza(String name, String extraIngredient1, String extraIngredient2)
     * this constructor sets the price to 100 and ingredients to {"crust","cheese","ketchup", extraIngredient, extraIngredient}
     * See the UML diagram provided in the UML folder to see attribute types.
     * Uncomment the method below to test the solution
     * Points: 2
     * New skills: overloading constructors
     * Difficulty: 2
     */
    public void createPizzas(){
        Pizza standardPizza = new Pizza("Margherita");
        System.out.println("Pizza name: " + standardPizza.getName() + " price: "+ standardPizza.getPrice() + " ingredients: "+  Arrays.toString(standardPizza.getIngredients()));
        Pizza peperoniPizza = new Pizza("Peperoni", "peperoni");
        System.out.println("Pizza name: " + peperoniPizza.getName() + " price: "+ peperoniPizza.getPrice() + " ingredients: "+  Arrays.toString(peperoniPizza.getIngredients()));
        Pizza hawaiiPizza = new Pizza("Hawaii", "ham", "pineapple");
        System.out.println("Pizza name: " + hawaiiPizza.getName() + " price: "+ hawaiiPizza.getPrice() + " ingredients: "+  Arrays.toString(hawaiiPizza.getIngredients()));
    }
    /**
     * Task 3
     * Since the Visibility for all attributes in this task is private
     * You need to create setter methods to change pizza name, price, ingredients etc.
     * on existing pizza objects
     * Use UML diagram as reference to create setters.
     * Also make a printPizza method in your Pizza class, to print
     * pizza descriptions nicely, you can reuse print statements from
     * createPizza method from task 2 to make your own printPizza method
     * Output of print can look as you like. Hint! Use the keyword "this" for this method
     * Points: 3
     * New skills: creating setters
     * Difficulty: 3
     */
    // Task 3
    // setters and print
    public void printPizzas(){
        Pizza standardPizza = new Pizza("Margherita");
        standardPizza.printPizza();
        standardPizza.setName("Pizza Margherita");
        standardPizza.setPrice(50.00);
        standardPizza.setIngredients(new String[] {"crust", "mozzarella", "tomatoes"});
        standardPizza.printPizza();

    }
    /**
     * Task 4
     * Create an Order class, one attribute, which is
     * an array of pizzas in this order.
     * You also need to create an empty constructor for this class,
     * which creates a new Pizza[] for each order and sets it to 10 places.
     * Your Order class needs to have two methods one for adding a new Pizza to
     * the pizzas array, and another for printing the pizzas from this array (in the format you like)
     * See the UML diagram provided in the UML folder to see attribute types.
     * Remember private visibility attributes.
     * Create a setter and a getter for the pizzas attribute.
     * Points: 3
     * New skills: overriding methods
     * Difficulty: 4
     */

    public void createOrder(){
        Order order = new Order();
        Pizza standardPizza = new Pizza("Margherita");
        order.addPizza(standardPizza);
        Pizza peperoniPizza = new Pizza("Peperoni", "peperoni");
        order.addPizza(peperoniPizza);
        Pizza hawaiiPizza = new Pizza("Hawaii", "ham", "pineapple");
        order.addPizza(hawaiiPizza);
        System.out.println("Order details: ");
        order.printPizzas();

    }

    /**
     * Task 5
     * Create a PizzaManager class, with no attributes and an empty constructor.
     * See the UML diagram provided in the UML folder to see attribute types.
     * This class needs to have two methods one for
     * calculating the total price of all pizzas in an order
     * and one more method for calculating the same total price with a 10kr discount
     * You can read more about overloading methods in:
     * "Introduction to Java Programming and Data Structures book" 6.8 Overloading Methods
     * You can also make a method that prints out the receipt with all pizzas and total price just for fun (no test)
     * Points: 2
     * New skills: creating an empty constructor, print statements
     * Difficulty: 2
     */


    public void calculateTotalPrice(){
        PizzaManager pizzaManager = new PizzaManager();
        Order order = new Order();
        Pizza standardPizza = new Pizza("Margherita");
        order.addPizza(standardPizza);
        Pizza peperoniPizza = new Pizza("Peperoni", "peperoni");
        order.addPizza(peperoniPizza);
        Pizza hawaiiPizza = new Pizza("Hawaii", "ham", "pineapple");
        order.addPizza(hawaiiPizza);
        System.out.println("The total price is: "+ pizzaManager.calculateTotalPrice(order));
        System.out.println("The total price with 10 kr discount is: " + pizzaManager.calculateTotalPrice(order,10.0));
    }
}

/**
 * @author Maria Hansen
 */