package ie.atu;

public class OnlineOrderingSystem {
    public static void main(String[] args) {
        MenuItem[] menuItems = new MenuItem[] {

                new Burger("classic burger",8.99,"Beef patty, lettuce, tomato, cheese"),
        new Pizza("Margherita",12.99,"Tomato sauce, mozzarella, basil"),
        new Salad("Caesar salad",6.99,"Romaine lettuce, croutons, Caesar dressing"),
        new Dessert("creme brulee",25.99,"sugar, cream, eggs"),
        };

        for (MenuItem menuItem : menuItems) {
           System.out.println("\nName:" +menuItem.getName() + "\nPrice:" +menuItem.getPrice() + "\nDescription:" +menuItem.getDescription());

        }

        double totalCost = 0;
        for (MenuItem menuItem : menuItems) {
         totalCost += menuItem.getPrice();
        }
        System.out.println("Total cost: £" + totalCost);

    }
}