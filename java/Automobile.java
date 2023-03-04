public class Automobile {
    private int id;
    private String make;
    private String model;
    private String color;
    private int year;
    private int milesPerGallon;

    // Getters
    public int getID() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    // setters
    public void setID(int id) {
        if (id < 0 || id > 9999) {
            this.id = 0;
        } else {
            this.id = id;
        }
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        if (year < 2005 || year > 2019) {
            this.year = 0;
        } else {
            this.year = year;
        }
    }

    public void setMilesPerGallon(int milesPerGallon) {
        if (milesPerGallon < 10 || milesPerGallon > 60) {
            this.milesPerGallon = 0;
        } else {
            this.milesPerGallon = milesPerGallon;
        }
    }

    public Automobile(int id, String make, String model, String color, int year, int milesPerGallon) {
        setID(id);
        setMake(make);
        setColor(color);
        setYear(year);
        setMilesPerGallon(milesPerGallon);
    }

}
