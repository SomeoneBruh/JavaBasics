import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        int sum = projects * 3;
        System.out.println("The architect " + name + " will need " + sum + " hours " + "to complete " + projects + " project/s.");
    }
}
