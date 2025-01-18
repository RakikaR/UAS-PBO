class KalkulatorGizi {
    private Pengguna person;

    public KalkulatorGizi(Pengguna person) {
        this.person = person;
    }

    public int calculateCalories() {
        float bmr;
        if (person.getGender().equalsIgnoreCase("Pria")) {
            bmr = 10 * person.getWeight() + 6.25f * person.getHeight() - 5 * person.getAge() + 5;
        } else {
            bmr = 10 * person.getWeight() + 6.25f * person.getHeight() - 5 * person.getAge() - 161;
        }

        switch (person.getActivityLevel().toLowerCase()) {
            case "rendah":
                return (int) (bmr * 1.2f);
            case "sedang":
                return (int) (bmr * 1.55f);
            case "tinggi":
                return (int) (bmr * 1.9f);
            default:
                return (int) (bmr * 1.2f); // Default ke aktivitas rendah
        }
    }

    public int calculateProtein() {
        return (int) (person.getWeight() * 0.8f); // Rekomendasi minimal 0.8 gram protein per kg berat badan
    }

    public int calculateFat() {
        float calories = calculateCalories();
        return (int) ((calories * 0.25f) / 9); // Lemak menyumbang 25% dari total kalori, 1 gram lemak = 9 kkal
    }

    public int calculateCarbohydrates() {
        float calories = calculateCalories();
        return (int) ((calories * 0.5f) / 4); // Karbohidrat menyumbang 50% dari total kalori, 1 gram karbohidrat = 4 kkal
    }

    public int calculateFiber() {
        if (person.getGender().equalsIgnoreCase("Pria")) {
            return 38; // Rekomendasi serat harian untuk pria
        } else {
            return 25; // Rekomendasi serat harian untuk wanita
        }
    }
}