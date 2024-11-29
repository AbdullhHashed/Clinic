import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class ClinicSystemGUI extends JFrame {
    private ClinicSystem clinicSystem;

    public ClinicSystemGUI() {
        // إنشاء كائن ClinicSystem
        clinicSystem = new ClinicSystem();

        // إعداد نافذة JFrame
        setTitle("Medical Clinic System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // إعداد لوحة JPanel للأزرار
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));

        // زر لإضافة مريض
        JButton addPatientButton = new JButton("Add Patient");
        addPatientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addPatient();
            }
        });
        panel.add(addPatientButton);

        // زر لإضافة طبيب
        JButton addDoctorButton = new JButton("Add Doctor");
        addDoctorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addDoctor();
            }
        });
        panel.add(addDoctorButton);

        // زر لحجز موعد
        JButton bookAppointmentButton = new JButton("Book Appointment");
        bookAppointmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bookAppointment();
            }
        });
        panel.add(bookAppointmentButton);

        // زر لإضافة فاتورة
        JButton addInvoiceButton = new JButton("Add Invoice");
        addInvoiceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addInvoice();
            }
        });
        panel.add(addInvoiceButton);

        // زر لإغلاق التطبيق
        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panel.add(exitButton);

        // إضافة اللوحة إلى النافذة
        add(panel);
        setVisible(true);
    }

    // وظيفة لإضافة مريض
    private void addPatient() {
        try {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Patient ID:"));
            String name = JOptionPane.showInputDialog("Enter Patient Name:");
            int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Patient Age:"));
            String gender = JOptionPane.showInputDialog("Enter Patient Gender:");
            String medicalHistory = JOptionPane.showInputDialog("Enter Medical History:");

            clinicSystem.addPatient(id, name, age, gender, medicalHistory);
            JOptionPane.showMessageDialog(this, "Patient added successfully.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid input, please try again.");
        }
    }

    // وظيفة لإضافة طبيب
    private void addDoctor() {
        try {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Doctor ID:"));
            String name = JOptionPane.showInputDialog("Enter Doctor Name:");
            String specialty = JOptionPane.showInputDialog("Enter Doctor Specialty:");
            int experience = Integer.parseInt(JOptionPane.showInputDialog("Enter Years of Experience:"));

            clinicSystem.addDoctor(id, name, specialty, experience);
            JOptionPane.showMessageDialog(this, "Doctor added successfully.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid input, please try again.");
        }
    }

    // وظيفة لحجز موعد
    private void bookAppointment() {
        try {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Appointment ID:"));
            int patientId = Integer.parseInt(JOptionPane.showInputDialog("Enter Patient ID:"));
            int doctorId = Integer.parseInt(JOptionPane.showInputDialog("Enter Doctor ID:"));
            clinicSystem.bookAppointment(id, new Date(), patientId, doctorId);
            JOptionPane.showMessageDialog(this, "Appointment booked successfully.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid input, please try again.");
        }
    }

    // وظيفة لإضافة فاتورة
    private void addInvoice() {
        try {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Invoice ID:"));
            double amount = Double.parseDouble(JOptionPane.showInputDialog("Enter Invoice Amount:"));
            int patientId = Integer.parseInt(JOptionPane.showInputDialog("Enter Patient ID:"));

            clinicSystem.addInvoice(id, amount, new Date(), patientId);
            JOptionPane.showMessageDialog(this, "Invoice added successfully.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid input, please try again.");
        }
    }

    // الوظيفة الرئيسية لتشغيل الواجهة
    public static void main(String[] args) {
        new ClinicSystemGUI();
    }
}


