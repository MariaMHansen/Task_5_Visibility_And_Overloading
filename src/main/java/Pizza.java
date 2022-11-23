import java.util.Arrays;

public class Pizza {
 private String name;
 private double price;
 String[] ingredients;

    public Pizza(String name) {
        this.name = name;
        this.price = 80.00;
        this.ingredients = new String[]{"crust","cheese","ketchup"};
    }
    public Pizza(String name, String extraIngredient) {
        this.name = name;
        this.price = 90.00;
        this.ingredients = new String[]{"crust","cheese","ketchup", extraIngredient};
    }
    public Pizza(String name, String extraIngredient1, String extraIngredient2) {
        this.name = name;
        this.price = 100.00;
        this.ingredients = new String[]{"crust","cheese","ketchup", extraIngredient1, extraIngredient2};
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public void printPizza(){
        System.out.println("Pizza name: " + this.getName() + " price: "+ this.getPrice() + " ingredients: "+  Arrays.toString(this.getIngredients()));
    }
}
