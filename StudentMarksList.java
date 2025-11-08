import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMarksList {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Student Marks Management ===");
            System.out.println("1. Add Mark");
            System.out.println("2. View Marks");
            System.out.println("3. Update Mark");
            System.out.println("4. Delete Mark");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter mark to add: ");
                    int mark = sc.nextInt();
                    marks.add(mark);
                    System.out.println(" Mark added successfully!");
                    break;

                case 2:
                    System.out.println("\n Student Marks:");
                    Iterator<Integer> it = marks.iterator();
                    while (it.hasNext()) {
                        System.out.println(it.next());
                    }
                    break;

                case 3:
                    System.out.print("Enter index to update: ");
                    int indexToUpdate = sc.nextInt();
                    if (indexToUpdate >= 0 && indexToUpdate < marks.size()) {
                        System.out.print("Enter new mark: ");
                        int newMark = sc.nextInt();
                        marks.set(indexToUpdate, newMark);
                        System.out.println(" Mark updated successfully!");
                    } else {
                        System.out.println(" Invalid index!");
                    }
                    break;

                case 4:
                    System.out.print("Enter index to delete: ");
                    int indexToDelete = sc.nextInt();
                    if (indexToDelete >= 0 && indexToDelete < marks.size()) {
                        marks.remove(indexToDelete);
                        System.out.println(" Mark deleted successfully!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 5:
                    System.out.println(" Exiting program...");
                    break;

                default:
                    System.out.println(" Invalid choice, please try again!");
            }

        } while (choice != 5);

        sc.close();
    }
}
