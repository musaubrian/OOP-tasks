public class TestJobApplicants {
    public static void main(String[] args) {
        JobApplicant firstApplicant = new JobApplicant("John Doe", "0796372189", true, false, true, true);
        JobApplicant secondApplicant = new JobApplicant("Jane Donda", "074678124789", true, false, true, true);
        JobApplicant thirdApplicant = new JobApplicant("Bob Smart", "07532678974", false, true, true, false);
        JobApplicant fourthApplicant = new JobApplicant("Serena Williams", "07891276274", true, false, false, true);

        System.out.println(
                "FirstApllicant: " + (firstApplicant.isQualifiedForInterview() ? "qualified" : "not qualified"));
        System.out.println(
                "SecondApplicant: " + (secondApplicant.isQualifiedForInterview() ? "qualified" : "not qualified"));
        System.out.println(
                "ThirdApplicant: " + (thirdApplicant.isQualifiedForInterview() ? "qualified" : "not qualified"));
        System.out.println(
                "FourthApplicant: " + (fourthApplicant.isQualifiedForInterview() ? "qualified" : "not qualified"));
    }
}
