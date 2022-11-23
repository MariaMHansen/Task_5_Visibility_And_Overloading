import java.util.Arrays;

public class Order {
    Pizza[] pizzas;

    public Order() {
        this.pizzas = new Pizza[10];
    }

    public void addPizza(Pizza pizza){
        for(int i = 0; i<pizzas.length; i++){
            if(pizzas[i]==null){
                pizzas[i] = pizza;
                break;
            }
        }
    }

    public void printPizzas(){
        for (Pizza pizza : pizzas) {
          if(pizza!=null){
              pizza.printPizza();
          }
        }
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }

    public void setPizzas(Pizza[] pizzas) {
        this.pizzas = pizzas;
    }
}
