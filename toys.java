public class toys {
    private int id;
    private String name;
    private int toyQuantity;
    private double frequency;

    private int allToys = 100;

    public toys (int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.toyQuantity = quantity;
        this.frequency = quantity * 100 / allToys;
    }
    public int  getId () {
        return id;
    }
    public String getName () {
        return name;
    }
    public int getToyQuantity () {
        return toyQuantity;
    }
    public void setToyQantity (int toyQuantity) {
        this.toyQuantity = toyQuantity;
    }
    public double getFrequency () {
        return frequency;
    }
    public void setFrequency (double frequency) {
        this.frequency = frequency;
    }
    public String toFileString () {
        return String.format("%d, %s", id, name);
    }
    @Override
    public String toString () {
        return "Toy: " +
                "id =" + id +
                ", name ='" + name + '\'' +
                "quantity =" + toyQuantity +
                "frequency = " + frequency +
                '%' + "\n";
    }
} 
