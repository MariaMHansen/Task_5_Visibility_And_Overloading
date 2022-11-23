public class PizzaManager {

    public PizzaManager() {
    }

    public double calculateTotalPrice(Order order){
        double totalPrice = 0;
        for (Pizza pizza: order.pizzas) {
           if(pizza!=null){
               totalPrice+=pizza.getPrice();
           }
        }
        return totalPrice;
    }

    public double calculateTotalPrice(Order order, Double discount){
        double totalPrice = 0;
        for (Pizza pizza: order.pizzas) {
            if(pizza!=null){
                totalPrice+=pizza.getPrice();
            }
        }
        return totalPrice - discount;
    }

    public void printReceipt(Order order) {
        System.out.println("Receipt ");
        for (Pizza p : order.pizzas) {
            p.printPizza();
        }
    }
}
