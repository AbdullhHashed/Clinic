import java.util.Date;

public class Invoice {
    private int id;
    private double amount;
    private Date dateIssued;
    private Patient patient;

    public Invoice(int id, double amount, Date dateIssued, Patient patient) {
        this.id = id;
        this.amount = amount;
        this.dateIssued = dateIssued;
        this.patient = patient;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(Date dateIssued) {
        this.dateIssued = dateIssued;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}

