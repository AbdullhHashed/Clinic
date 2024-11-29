public class Doctor {
    private int id;
    private String name;
    private String specialty;
    private int experienceYears;

    public Doctor(int id, String name, String specialty, int experienceYears) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
        this.experienceYears = experienceYears;
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

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }
}

