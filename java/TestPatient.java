public class TestPatient {
    public static void main(String[] args) {
        // Create a patient using the default constructor
        Patient patient1 = new Patient();
        System.out.println("Patient 1 ID number: " + patient1.getIdNumber());
        System.out.println("Patient 1 age: " + patient1.getAge());
        System.out.println("Patient 1 blood type: " + patient1.getBloodData().getBloodType());
        System.out.println("Patient 1 Rh factor: " + patient1.getBloodData().getRhFactor());

        // Create a patient using the overloaded constructor
        BloodData bloodData2 = new BloodData("AB", '-');
        Patient patient2 = new Patient(1234, 32, bloodData2);
        System.out.println("Patient 2 ID number: " + patient2.getIdNumber());
        System.out.println("Patient 2 age: " + patient2.getAge());
        System.out.println("Patient 2 blood type: " + patient2.getBloodData().getBloodType());
        System.out.println("Patient 2 Rh factor: " + patient2.getBloodData().getRhFactor());
    }
}
