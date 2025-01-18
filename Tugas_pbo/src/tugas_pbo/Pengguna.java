class Pengguna {
    private String gender;
    private int age;
    private float weight; // dalam kg
    private float height; // dalam cm
    private String activityLevel;

    public Pengguna(String gender, int age, float weight, float height, String activityLevel) {
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.activityLevel = activityLevel;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

    public float getHeight() {
        return height;
    }

    public String getActivityLevel() {
        return activityLevel;
    }
}