import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class PizzaQueue {
    private Queue<PizzaOrder> pizzaQueue;

    public PizzaQueue() {
        pizzaQueue = new LinkedList<>();
    }

    public void addOrder(PizzaOrder order) {
        pizzaQueue.add(order);
    }

    public void displayQueue() {
        System.out.println("Current orders in queue:");
        for (PizzaOrder order : pizzaQueue) {
            System.out.println(order);
        }
    }

    public void processNextOrder() {
        if (!pizzaQueue.isEmpty()) {
            System.out.println("Processing next order: " + pizzaQueue.poll());
        } else {
            System.out.println("No orders in the queue.");
        }
    }

    public boolean isQueueEmpty() {
        return pizzaQueue.isEmpty();
    }

    public void handleQueue() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Choose what you want to do with pizza orders queue:");
            System.out.println("1. Add an order to the queue");
            System.out.println("2. Display the queue");
            System.out.println("3. Process the next order");
            System.out.println("4. Check if the queue is empty");
            System.out.println("Enter your choice (1 - 4)");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter pizza details:");
                    Scanner input = new Scanner(System.in);
                    System.out.println("Pizza: ");
                    String pizza = input.nextLine();
                    System.out.println("Size: ");
                    String size = input.nextLine();
                    System.out.println("Side Dish: ");
                    String sideDish = input.nextLine();
                    System.out.println("Drink: ");
                    String drink = input.nextLine();
                    PizzaOrder newOrder = new PizzaOrder(pizza, size, sideDish, drink);
                    addOrder(newOrder);
                    break;
                case 2:
                    displayQueue();
                    break;
                case 3:
                    processNextOrder();
                    break;
                case 4:
                    if (isQueueEmpty()) {
                        System.out.println("The queue is empty");
                    } else {
                        System.out.println("The queue is not empty");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
        scanner.close();
    }
}