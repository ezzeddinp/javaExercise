import java.util.Random;
import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input NIM
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        // Input Nama Lengkap
        System.out.print("Masukkan Nama Lengkap: ");
        String fullName = scanner.nextLine();
        String[] nameParts = fullName.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[nameParts.length - 1];

        // Input Departemen
        System.out.print("Masukkan Departemen: ");
        String department = scanner.nextLine();

        // Input Email
        String email;
        while (true) {
            System.out.print("Masukkan Email (@sunib.ac.id): ");
            email = scanner.nextLine();
            if (email.endsWith("@sunib.ac.id")) {
                break;
            } else {
                System.out.println("Email harus berakhiran @sunib.ac.id. Silakan coba lagi.");
            }
        }

        // Generate ID Random
        Random random = new Random();
        String randomID = generateRandomID(random);

        // Menampilkan hasil input
        System.out.println("\nTerima kasih! Berikut adalah hasil input Anda:");
        System.out.println("NIM: " + nim);
        System.out.println("Nama Lengkap: " + fullName);
        System.out.println("Nama Depan: " + firstName);
        System.out.println("Nama Belakang: " + lastName);
        System.out.println("Departemen: " + department);
        System.out.println("Email: " + email);
        System.out.println("ID Random: " + randomID);

        scanner.close();
    }

    private static String generateRandomID(Random random) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder randomID = new StringBuilder();
        randomID.append(characters.charAt(random.nextInt(characters.length())));
        randomID.append(characters.charAt(random.nextInt(characters.length())));
        randomID.append(String.format("%03d", random.nextInt(1000)));
        return randomID.toString();
    }
}
