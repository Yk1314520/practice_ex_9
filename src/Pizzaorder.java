class PizzaOrder {
    private String pizza;
    private String size;
    private String sideDish;
    private String drink;

    public PizzaOrder(String pizza, String size, String sideDish, String drink) {
        this.pizza = pizza;
        this.size = size;
        this.sideDish = sideDish;
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "Pizza: " + pizza + ", Size: " + size + ", Side Dish: " + sideDish + ", Drink: " + drink;
    }
}