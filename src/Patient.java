public class Patient {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String medicalHistory;

    public Patient(int id, String name, int age, String gender, String medicalHistory) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.medicalHistory = medicalHistory;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
}

