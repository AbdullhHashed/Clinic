import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClinicSystem {
    private List<Patient> patients;
    private List<Doctor> doctors;
    private List<Appointment> appointments;
    private List<Invoice> invoices;

    public ClinicSystem() {
        patients = new ArrayList<>();
        doctors = new ArrayList<>();
        appointments = new ArrayList<>();
        invoices = new ArrayList<>();
    }

    // 1. إضافة مريض جديد
    public void addPatient(int id, String name, int age, String gender, String medicalHistory) {
        Patient newPatient = new Patient(id, name, age, gender, medicalHistory);
        patients.add(newPatient);
        System.out.println("Patient added successfully: " + name);
    }

    // 2. إضافة طبيب جديد
    public void addDoctor(int id, String name, String specialty, int experienceYears) {
        Doctor newDoctor = new Doctor(id, name, specialty, experienceYears);
        doctors.add(newDoctor);
        System.out.println("Doctor added successfully: " + name);
    }

    // 3. حجز موعد جديد
    public void bookAppointment(int id, Date appointmentDate, int patientId, int doctorId) {
        Patient patient = findPatientById(patientId);
        Doctor doctor = findDoctorById(doctorId);

        if (patient != null && doctor != null) {
            Appointment newAppointment = new Appointment(id, appointmentDate, patient, doctor);
            appointments.add(newAppointment);
            System.out.println("Appointment booked successfully for patient: " + patient.getName() + " with doctor: " + doctor.getName());
        } else {
            System.out.println("Error: Patient or Doctor not found.");
        }
    }

    // 4. إضافة فاتورة جديدة
    public void addInvoice(int id, double amount, Date dateIssued, int patientId) {
        Patient patient = findPatientById(patientId);

        if (patient != null) {
            Invoice newInvoice = new Invoice(id, amount, dateIssued, patient);
            invoices.add(newInvoice);
            System.out.println("Invoice created successfully for patient: " + patient.getName());
        } else {
            System.out.println("Error: Patient not found.");
        }
    }

    // 5. البحث عن مريض باستخدام المعرف (ID)
    private Patient findPatientById(int id) {
        for (Patient patient : patients) {
            if (patient.getId() == id) {
                return patient;
            }
        }
        return null;
    }

    // 6. البحث عن طبيب باستخدام المعرف (ID)
    private Doctor findDoctorById(int id) {
        for (Doctor doctor : doctors) {
            if (doctor.getId() == id) {
                return doctor;
            }
        }
        return null;
    }

    // 7. عرض جميع المرضى
    public void displayAllPatients() {
        System.out.println("All Patients:");
        for (Patient patient : patients) {
            System.out.println("ID: " + patient.getId() + ", Name: " + patient.getName());
        }
    }

    // 8. عرض جميع الأطباء
    public void displayAllDoctors() {
        System.out.println("All Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("ID: " + doctor.getId() + ", Name: " + doctor.getName() + ", Specialty: " + doctor.getSpecialty());
        }
    }

    // 9. عرض جميع المواعيد
    public void displayAllAppointments() {
        System.out.println("All Appointments:");
        for (Appointment appointment : appointments) {
            System.out.println("ID: " + appointment.getId() + ", Patient: " + appointment.getPatient().getName() + ", Doctor: " + appointment.getDoctor().getName());
        }
    }

    // 10. عرض جميع الفواتير
    public void displayAllInvoices() {
        System.out.println("All Invoices:");
        for (Invoice invoice : invoices) {
            System.out.println("ID: " + invoice.getId() + ", Amount: " + invoice.getAmount() + ", Patient: " + invoice.getPatient().getName());
        }
    }
}
