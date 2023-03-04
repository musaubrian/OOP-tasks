public class JobApplicant {
    private String name;
    private String phoneNumber;
    private boolean isSkilledInWordProcessing;
    private boolean isSkilledInSpreadsheets;
    private boolean isSkilledInDatabases;
    private boolean isSkilledInGraphics;

    public JobApplicant(
            String name, String phoneNumber,
            boolean isSkilledInWordProcessing,
            boolean isSkilledInSpreadsheets,
            boolean isSkilledInDatabases,
            boolean isSkilledInGraphics) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.isSkilledInWordProcessing = isSkilledInWordProcessing;
        this.isSkilledInSpreadsheets = isSkilledInSpreadsheets;
        this.isSkilledInDatabases = isSkilledInDatabases;
        this.isSkilledInGraphics = isSkilledInGraphics;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isSkilledInWordProcessing() {
        return isSkilledInWordProcessing;
    }

    public boolean isSkilledInSpreadsheets() {
        return isSkilledInSpreadsheets;
    }

    public boolean isSkilledInDatabases() {
        return isSkilledInDatabases;
    }

    public boolean isSkilledInGraphics() {
        return isSkilledInGraphics;
    }

    public boolean isQualifiedForInterview() {
        int numSkills = 0;
        if (isSkilledInWordProcessing) {
            numSkills++;
        }
        if (isSkilledInSpreadsheets) {
            numSkills++;
        }
        if (isSkilledInDatabases) {
            numSkills++;
        }
        if (isSkilledInGraphics) {
            numSkills++;
        }
        return numSkills >= 3;
    }
}
