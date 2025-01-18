public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data pengguna
        System.out.print("Masukkan jenis kelamin (Pria/Wanita): ");
        String gender = scanner.nextLine();

        System.out.print("Masukkan usia: ");
        int age = scanner.nextInt();

        System.out.print("Masukkan berat badan (kg): ");
        float weight = scanner.nextFloat();

        System.out.print("Masukkan tinggi badan (cm): ");
        float height = scanner.nextFloat();
        
        scanner.nextLine(); // Consume newline

        System.out.print("Masukkan tingkat aktivitas (Rendah/Sedang/Tinggi): ");
        String activityLevel = scanner.nextLine();
        System.out.println();

        // Membuat objek Person
        Pengguna person = new Pengguna(gender, age, weight, height, activityLevel);
        KalkulatorGizi calculator = new KalkulatorGizi(person);

        System.out.println("Kebutuhan Gizi Harian Anda:");
        System.out.println("Kalori: " + calculator.calculateCalories() + " kkal");
        System.out.println("Protein: " + calculator.calculateProtein() + " gram");
        System.out.println("Lemak: " + calculator.calculateFat() + " gram");
        System.out.println("Karbohidrat: " + calculator.calculateCarbohydrates() + " gram");
        System.out.println("Serat: " + calculator.calculateFiber() + " gram");

        scanner.close();
    }
}