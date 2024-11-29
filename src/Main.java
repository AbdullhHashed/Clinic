import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ClinicSystem clinicSystem = new ClinicSystem();

        // إضافة مريض
        clinicSystem.addPatient(1, "Ahmed Ali", 30, "Male", "No history");

        // إضافة طبيب
        clinicSystem.addDoctor(1, "Dr. Sarah Mohamed", "Dermatology", 10);

        // حجز موعد
        clinicSystem.bookAppointment(1, new Date(), 1, 1);

        // إضافة فاتورة
        clinicSystem.addInvoice(1, 150.50, new Date(), 1);

        // عرض جميع المرضى
        clinicSystem.displayAllPatients();

        // عرض جميع الأطباء
        clinicSystem.displayAllDoctors();

        // عرض جميع المواعيد
        clinicSystem.displayAllAppointments();

        // عرض جميع الفواتير
        clinicSystem.displayAllInvoices();
    }
}
