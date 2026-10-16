import java.util.Scanner;

public class PrintServerQueue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        QueueArrayBased queue = new QueueArrayBased();
        PrintJob job = new PrintJob("12345", "Apple", "5");
        queue.enqueue(job);
        int choice = 0;

        while (choice != 6) {

            System.out.println("\nWelcome to PrintServer! Please select a number from the list.");
            System.out.println("1. Enqueue a job (User enters job details).");
            System.out.println("2. Dequeue a job.");
            System.out.println("3. Peek at the job at front of the queue");
            System.out.println("4. Empty the queue");
            System.out.println("5. Display all jobs.");
            System.out.println("6. Quit the program");

            System.out.print("Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

				case 1:
					System.out.println("Enter the PrintJob details!");
					System.out.println("Enter the job ID: ");
					String id = scanner.next();
					queue.enqueue(id);
					System.out.println("Enter the document name: ");
					String doc_name = scanner.next();
					queue.enqueue(doc_name);
					System.out.println("Enter the number of pages: ");
					String num_pages = scanner.next();
					queue.enqueue(num_pages);
		
					
					break;
                case 2:

                	System.out.println("Removed: " + queue.dequeue());
                    break;

                case 3:
                	System.out.println("Top item: " + queue.peek());
                    break;

                case 4:
                    queue.dequeueAll();
                    System.out.println("Stack emptied.");
                    break;

                case 5:
                	queue.displayQueue();
                    break;

                case 6:
                    System.out.println("Goodbye!");
                    break;

                default:

                    System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }
}