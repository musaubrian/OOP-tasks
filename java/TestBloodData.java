public class TestBloodData {
    public static void main(String[] args) {

        BloodData data1 = new BloodData();
        BloodData data2 = new BloodData("AB", '-');

        System.out.println("Data 1 blood type: " + data1.getBloodType());
        System.out.println("Data 1 Rh factor: " + data1.getRhFactor());

        System.out.println("Data 2 blood type: " + data2.getBloodType());
        System.out.println("Data 2 Rh factor: " + data2.getRhFactor());

        data1.setBloodType("B");
        data1.setRhFactor('-');

        System.out.println("Data 1 blood type: " + data1.getBloodType());
        System.out.println("Data 1 Rh factor: " + data1.getRhFactor());
    }
}
