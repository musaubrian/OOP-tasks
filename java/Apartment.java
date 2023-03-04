public class Apartment {
    private int apartmentNumber;
    private int numOfBedrooms;
    private int numOfBaths;
    private int rent;

    public Apartment(int apartmentNumber, int numOfBedrooms, int numOfBaths, int rent) {
        setApartmentNumber(apartmentNumber);
        setnumOfBedrooms(numOfBedrooms);
        setnumOfBaths(numOfBaths);
        setRent(rent);
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public int getNumOfBedrooms() {
        return numOfBedrooms;
    }

    public int getNumOfBaths() {
        return numOfBaths;
    }

    public int getRent() {
        return rent;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public void setnumOfBedrooms(int numOfBedrooms) {
        this.numOfBedrooms = numOfBedrooms;
    }

    public void setnumOfBaths(int numOfBaths) {
        this.numOfBaths = numOfBaths;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }
}
