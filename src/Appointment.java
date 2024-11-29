import java.util.Date;

public class Appointment {
    private int id;
    private Date appointmentDate;
    private Patient patient;
    private Doctor doctor;

    public Appointment(int id, Date appointmentDate, Patient patient, Doctor doctor) {
        this.id = id;
        this.appointmentDate = appointmentDate;
        this.patient = patient;
        this.doctor = doctor;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}

