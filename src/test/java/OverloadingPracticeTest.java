import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.print.attribute.Attribute;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.fail;

// Overloading is ....
//

class OverloadingPracticeTest {
    OverloadingPracticeTest() {
    }

    // Step 1 Test
    @DisplayName("Checks pizza attributes")
    @Test
    void pizzaAttributesTest() throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // Checking if Player class exists
        if (!classExists("Pizza")) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 1:\n" +
                    " You need to create the Pizza class to pass Test 1 \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        // Checking if Player name attribute exists
        if (!fieldExists("Pizza", "name")) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 1:\n" +
                    " You need to create the Pizza name attribute to pass Test 1 \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        // Checking if Player life attribute exists
        if (!fieldExists("Pizza", "price")) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 1:\n" +
                    " You need to create the Pizza price attribute to pass Test 1 \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        // Checking if Pizza ingredients attribute exists
        if (!fieldExists("Pizza", "ingredients")) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 1:\n" +
                    " You need to create the Pizza ingredients attribute to pass Test 1 \n" +
                    "-------------------------------------------------------------------------\n"
            );
        } else {
            // Creating a new Pizza object and checking if it has a String attribute name
            Object testPizzaObject = createPizzaTestObject();
            Field nameField = getFieldFromClass("Pizza", testPizzaObject, "name");
            Object nameValue = nameField.get(testPizzaObject);
            // Feedback if Pizza attribute name is not string
            if (!(nameValue instanceof String)) {
                fail("\n" +
                        "-------------------------------------------------------------------------\n" +
                        "AUTO-FEEDBACK:\n" +
                        "Step 1:\n" +
                        " The name attribute in Pizza class must be a String \n" +
                        "          It looks like your Pizza name data type is not String \n" +
                        "          To see an example of creating classes and attributes, try \n" +
                        "          \"Introduction to Java Programming and Data Structures book\"\n" +
                        "          9.3 Example: Defining Classes and Creating Objects \n" +
                        "-------------------------------------------------------------------------\n"
                );
            }
            //Checking if Pizza class has an double attribute price
            Field priceField = getFieldFromClass("Pizza", testPizzaObject, "price");
            Object priceValue = priceField.get(testPizzaObject);
            // Feedback if Pizza attribute price is not a double
            if (!(priceValue instanceof Double)) {
                fail("\n" +
                        "-------------------------------------------------------------------------\n" +
                        "AUTO-FEEDBACK:\n" +
                        "Step 1:\n" +
                        " The price attribute in Pizza class must be an double \n" +
                        "          It looks like your Pizza price data type is not a double \n" +
                        "          To see an example of creating classes and attributes, try \n" +
                        "          \"Introduction to Java Programming and Data Structures book\"\n" +
                        "          9.3 Example: Defining Classes and Creating Objects \n" +
                        "-------------------------------------------------------------------------\n"
                );
            }
            // Checking if Pizza Class attribute ingredients array is a String[]
            Field ingredientsField = getFieldFromClass("Pizza", testPizzaObject, "ingredients");
            Object ingredientsValue = ingredientsField.get(testPizzaObject);
            // Checking if the first element in the ingredients array is a String
            String[] ingredients = (String[]) ingredientsValue;

            if (!(ingredients[0] instanceof String)) {
                fail("\n" +
                        "-------------------------------------------------------------------------\n" +
                        "AUTO-FEEDBACK:\n" +
                        "Step 1:\n" +
                        "          It looks like your Pizza ingredients array type is not String [] \n" +
                        "          You can find an example of creating a String array in\n" +
                        "          \"Introduction to Java Programming and Data Structures book\"\n" +
                        "          7.2.6 Processing Arrays \n" +
                        "          There is a months array example at the end of the chapter\n" +
                        "-------------------------------------------------------------------------\n"
                );
            }
            Assertions.assertEquals(true, nameValue instanceof String);
            Assertions.assertEquals(true, priceValue instanceof Double);
            String[] expected = new String[]{"crust", "cheese", "ketchup"};
            Assertions.assertArrayEquals(expected, ingredients);
        }
    }

    // Task 2 Test
    @DisplayName("Checks pizza constructors")
    @Test
    void pizzaConstructorsTest() throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // Checking if Player class exists
        if (!classExists("Pizza")) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 2:\n" +
                    " You need to create the Pizza class to pass Test 2 \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        if (!ConstructorWith1ExtraIngredientExists()) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 2:\n" +
                    " You need to create a constructor for 1 extra ingredient in Pizza class to pass Test 2 \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        if (!ConstructorWith2ExtraIngredientExists()) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 2:\n" +
                    " You need to create a constructor for 2 extra ingredients in Pizza class to pass Test 2 \n" +
                    "-------------------------------------------------------------------------\n"
            );
        } else {
            Assertions.assertEquals(true, ConstructorWith1ExtraIngredientExists());
            Assertions.assertEquals(true, ConstructorWith2ExtraIngredientExists());
        }
    }

    // Task 3 Test
    // check pizza exists
    // check price field exists
    // check name field exists
    // check ingredients exist

    // check setName exists
    // check setPrice exists
    // check setIngredients exists

    // set name to ChangedName
    // get value
    // compare

    // possibly copy paste for ChangedPrice

    // Task 3 Test
    @DisplayName("Checks pizza setters")
    @Test
    void orderMethodsTest() throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // Checking if Pizza class exists
        if (!classExists("Order") || !classExists("Pizza")) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 3:\n" +
                    " You need to create Pizza and Order classes to pass Test 4 \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }

        if (!setNameMethodExists()) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 3:\n" +
                    " You need to create the setName method in Pizza class to pass Test 3 \n" +
                    "          You can find an example of a setter method in\n" +
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "          9.9 Data Field Encapsulation, setter (mutator) \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        if (!setPriceMethodExists()) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 3:\n" +
                    " You need to create the setName method in Pizza class to pass Test 3 \n" +
                    "          You can find an example of a setter method in\n" +
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "          9.9 Data Field Encapsulation, setter (mutator) \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        if (!setIngredientsMethodExists()) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 3:\n" +
                    " You need to create the setName method in Pizza class to pass Test 3 \n" +
                    "          You can find an example of a setter method in\n" +
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "          9.9 Data Field Encapsulation, setter (mutator) \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        // Checking if setters work
        String changedPizzaName = callSetNameMethod();
        Assertions.assertEquals("TestName", changedPizzaName);
        double changedPizzaPrice = callSetPriceMethod();
        Assertions.assertEquals(50.00, changedPizzaPrice);

    }

    // Task 4 Test
    @DisplayName("Checks pizza setters")
    @Test
    void pizzaSettersTest() throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // Checking if Pizza class exists
        if (!classExists("Pizza")) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 4:\n" +
                    " You need to create the Pizza class to pass Test 4 \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }

        // Checking if Pizza name, price and ingredients attributes exist
        if (!fieldExists("Pizza", "price") || !fieldExists("Pizza", "ingredients") || !fieldExists("Pizza", "name")) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 4:\n" +
                    " You need to create Pizza price, name and ingredients attributes to pass Test 4 \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }

        if (!addPizzaMethodExists()) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 4:\n" +
                    " You need to create the addPizza method in Order class to pass Test 4 \n" +
                    "          You can use a for loop to iterate through the pizzas array\n" +
                    "          Use a if(pizza == null) condition, to find an empty space \n" +
                    "          where you can insert the pizza object \n" +
                    "          Also remember to break the loop so that  \n" +
                    "          The pizza is not added in every empty space  \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        if (!addPizzaMethodExists()) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 4:\n" +
                    " You need to create the addPizza method in Order class to pass Test 4 \n" +
                    "          You can use a for loop to iterate through the pizzas array\n" +
                    "          Use a if(pizza == null) condition, to find an empty space \n" +
                    "          where you can insert the pizza object \n" +
                    "          Also remember to break the loop so that  \n" +
                    "          The pizza is not added in every empty space  \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        if (!getPizzasMethodExists()) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 4:\n" +
                    " You need to create the getPizzas  getter method in Order class to pass Test 4 \n" +
                    "          You can use a for loop to iterate through the pizzas array\n" +
                    "          Use a if(pizza == null) condition, to find an empty space \n" +
                    "          where you can insert the pizza object \n" +
                    "          Also remember to break the loop so that  \n" +
                    "          The pizza is not added in every empty space  \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        if (!callPizzaAddMethod()) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 4:\n" +
                    " Looks like your add pizza method in order class does not \n" +
                    "          add a new pizza object to the pizzas array \n" +
                    "          Use a if(pizza == null) condition, to find an empty space \n" +
                    "          where you can insert the pizza object \n" +
                    "          Also remember to break the loop so that  \n" +
                    "          The pizza is not added in every empty space  \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        boolean pizzaAdded = callPizzaAddMethod();
        Assertions.assertEquals(true, pizzaAdded);

    }

    // Task 5 Test
    @DisplayName("Checks pizza setters")
    @Test
    void pizzaManagerTest() throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // Checking if Pizza class exists
        if (!classExists("Pizza") || !classExists("Order") || !classExists("PizzaManager")) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 5:\n" +
                    " You need to create the Pizza, Order and PizzaManager classes to pass Test 5 \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        if (!calculateTotalPriceMethodExists()) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 5:\n" +
                    " You need to create calculateTotalPrice method in PizzaManager class to pass Test 5 \n" +
                    "          try to iterate through each pizza in the order \n" +
                    "          using a for or for each loop, and then add pizza.getPrice to totalPrice \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        if (callCalculateTotalPriceMethod() == 0.0) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 5:\n" +
                    " Looks like your calculate total price method returned 0  \n" +
                    "          check if you have remembered to add the pizza.price \n" +
                    "          for each pizza to total price \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        double totalPrice = callCalculateTotalPriceMethod();
        Assertions.assertEquals(160.0, totalPrice);
    }


    public boolean classExists(String className) {
        try {
            Class.forName(className);
            return true;
        } catch (ClassNotFoundException exception) {
            return false;
        }
    }

    public boolean fieldExists(String className, String fieldName) {
        try {
            Class<?> TempClass = Class.forName(className);
            Field field = TempClass.getDeclaredField(fieldName);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        } catch (NoSuchFieldException e) {
            return false;
        }
    }

    public boolean ConstructorWith1ExtraIngredientExists() {
        try {
            Class<?> PizzaClass = Class.forName("Pizza");
            Constructor<?> constructor = PizzaClass.getConstructor(String.class, String.class);
            return true;

        } catch (ClassNotFoundException e) {
            return false;
        } catch (NoSuchMethodException e) {
            return false;
        }
    }

    public boolean ConstructorWith2ExtraIngredientExists() {
        try {
            Class<?> PizzaClass = Class.forName("Pizza");
            Constructor<?> constructor = PizzaClass.getConstructor(String.class, String.class, String.class);
            return true;

        } catch (ClassNotFoundException e) {
            return false;
        } catch (NoSuchMethodException e) {
            return false;
        }
    }

    public boolean setNameMethodExists() {
        try {
            Class<?> PizzaClass = Class.forName("Pizza");
            Method setNameMethod = PizzaClass.getMethod("setName", String.class);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        } catch (NoSuchMethodException e) {
            return false;
        }
    }

    public boolean setPriceMethodExists() {
        try {
            Class<?> PizzaClass = Class.forName("Pizza");
            Method setNameMethod = PizzaClass.getMethod("setPrice", double.class);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        } catch (NoSuchMethodException e) {
            return false;
        }
    }

    public boolean setIngredientsMethodExists() {
        try {
            Class<?> PizzaClass = Class.forName("Pizza");
            Method setNameMethod = PizzaClass.getMethod("setIngredients", String[].class);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        } catch (NoSuchMethodException e) {
            return false;
        }
    }

    public boolean calculateTotalPriceMethodExists() {
        try {
            Class<?> PizzaManagerClass = Class.forName("PizzaManager");
            Class<?> OrderClass = Class.forName("Order");
            Method calculateTotalPriceMethod = PizzaManagerClass.getMethod("calculateTotalPrice", OrderClass);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        } catch (NoSuchMethodException e) {
            return false;
        }
    }


    public boolean addPizzaMethodExists() {
        try {
            Class<?> OrderClass = Class.forName("Order");
            Class<?> PizzaClass = Class.forName("Pizza");
            Method addPizzaMethod = OrderClass.getMethod("addPizza", PizzaClass);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        } catch (NoSuchMethodException e) {
            return false;
        }
    }

    public boolean getPizzasMethodExists() {
        try {
            Class<?> OrderClass = Class.forName("Order");
            Method addPizzaMethod = OrderClass.getMethod("getPizzas");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        } catch (NoSuchMethodException e) {
            return false;
        }
    }


    private Object createPizzaTestObject() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // If Pizza class exists check if the name attribute is a String
        Class<?> TempClass = Class.forName("Pizza");
        // getting Pizza class constructor
        Constructor<?> constructor = TempClass.getConstructor(String.class);
        // Object array for the constructor attributes
        Object[] arguments = new Object[1];
        arguments[0] = "PizzaTestName";
        // Instantiating Pizza object
        Object instance = constructor.newInstance(arguments);
        return instance;
    }

    private Field getFieldFromClass(String className, Object testObject, String attributeName) throws ClassNotFoundException, NoSuchFieldException {
        Class<?> TempClass = Class.forName(className);
        Field field = TempClass.getDeclaredField(attributeName);
        field.setAccessible(true);
        return field;
    }

    private String callSetNameMethod() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        // Making a new pizzaobject
        String changedPlayerName = "";
        Class<?> PizzaClass = Class.forName("Pizza");
        Constructor<?> constructor = PizzaClass.getConstructor(String.class);
        Object pizzaObject = constructor.newInstance("Name");

        try {

            Method setNameMethod = PizzaClass.getMethod("setName", String.class);

            // Get the pizza name field to see the changes made by the setter method
            Field pizzaNameField = PizzaClass.getDeclaredField("name");
            pizzaNameField.setAccessible(true);

            // Invoke the getName method
            Object result = setNameMethod.invoke(pizzaObject, "TestName");
            Object chName = pizzaNameField.get(pizzaObject);
            changedPlayerName = (String) chName;

        } catch (IllegalAccessException e) {

        } catch (InvocationTargetException e) {

        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

        return changedPlayerName;
    }

    private double callSetPriceMethod() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        // Making a new pizzaobject
        double changedPizzaPrice = 0.0;
        Class<?> PizzaClass = Class.forName("Pizza");
        Constructor<?> constructor = PizzaClass.getConstructor(String.class);
        Object pizzaObject = constructor.newInstance("Name");

        try {

            Method setPriceMethod = PizzaClass.getMethod("setPrice", double.class);

            // Get the pizza name field to see the changes made by the setter method
            Field pizzaPriceField = PizzaClass.getDeclaredField("price");
            pizzaPriceField.setAccessible(true);

            // Invoke the getName method
            Object result = setPriceMethod.invoke(pizzaObject, 50.00);
            Object chPrice = pizzaPriceField.get(pizzaObject);
            changedPizzaPrice = (double) chPrice;

        } catch (IllegalAccessException e) {

        } catch (InvocationTargetException e) {

        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

        return changedPizzaPrice;
    }

    private boolean callPizzaAddMethod() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        boolean pizzaAdded = false;
        try {
            // Making a new order object
            Class<?> OrderClass = Class.forName("Order");
            Constructor<?> constructor = OrderClass.getConstructor();
            Object orderObject = constructor.newInstance();

            // Making a new pizza object
            Class<?> PizzaClass = Class.forName("Pizza");
            Method addPizzaMethod = OrderClass.getMethod("addPizza", PizzaClass);

            // Making a pizza instance to invoke addPizza method with

            Constructor<?> pizzaConstructor = PizzaClass.getConstructor(String.class);
            // Object array for the constructor attributes
            Object[] arguments = new Object[1];
            arguments[0] = "TestName";
            // Instantiating Pizza object
            Object pizzaObject = pizzaConstructor.newInstance(arguments);

            // Make order pizzas field accessible
            Field orderPizzasField = OrderClass.getDeclaredField("pizzas");
            orderPizzasField.setAccessible(true);

            // Invoke the addPizza method
            Object result = addPizzaMethod.invoke(orderObject, pizzaObject);
            Object chArray = orderPizzasField.get(orderObject);
            pizzaAdded = (!chArray.toString().isEmpty());


        } catch (IllegalAccessException e) {

        } catch (InvocationTargetException e) {

        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

        return pizzaAdded;
    }

    private double callCalculateTotalPriceMethod() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        double totalPrice = 0.0;
        try {
            // Making a new PizzaManager object
            Class<?> PizzaManagerClass = Class.forName("PizzaManager");
            Constructor<?> constructor = PizzaManagerClass.getConstructor();
            Object pizzaManagerObject = constructor.newInstance();

            // Making a new order object
            Class<?> OrderClass = Class.forName("Order");
            Method calculateTotalPriceMethod = PizzaManagerClass.getMethod("calculateTotalPrice", OrderClass);

            // Making an order instance to invoke canculateTotalPrice method with
            Constructor<?> orderConstructor = OrderClass.getConstructor();
            Object orderObject = orderConstructor.newInstance();

            // Make order pizzas field accessible
            Field orderPizzasField = OrderClass.getDeclaredField("pizzas");
            orderPizzasField.setAccessible(true);

            // Add some pizzas to the order
            Class<?> PizzaClass = Class.forName("Pizza");
            Method addPizzaMethod = OrderClass.getMethod("addPizza", PizzaClass);
            // Making a pizza instance
            Constructor<?> pizzaConstructor = PizzaClass.getConstructor(String.class);
            // Object array for the constructor attributes
            Object[] arguments = new Object[1];
            arguments[0] = "TestName";
            // Instantiating Pizza object
            Object pizzaObject = pizzaConstructor.newInstance(arguments);
            // Invoke the addPizza method to add it to the order
            addPizzaMethod.invoke(orderObject, pizzaObject);
            addPizzaMethod.invoke(orderObject, pizzaObject);

            // Invoke the calculateTotalPrice method
            Object result = calculateTotalPriceMethod.invoke(pizzaManagerObject, orderObject);
            totalPrice = (double) result;

        } catch (IllegalAccessException e) {

        } catch (InvocationTargetException e) {

        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

        return totalPrice;
    }
}