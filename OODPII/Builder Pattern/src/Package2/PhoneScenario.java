package Package2;
class Phone{
    private final String brand;
    private final String model;
    private final int camera;
    private final boolean NFC;
    private final double displaySize;
    private final int storage;
    private final double price;
    private final int ram;

    private Phone(Phone.Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.camera = builder.camera;
        this.NFC = builder.NFC;
        this.displaySize = builder.displaySize;
        this.storage = builder.storage;
        this.price = builder.price;
        this.ram = builder.ram;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getCamera() {
        return camera;
    }

    public boolean isNFC() {
        return NFC;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public int getStorage() {
        return storage;
    }

    public double getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", camera=" + camera +
                ", NFC=" + NFC +
                ", displaySize=" + displaySize +
                ", storage=" + storage +
                ", price=" + price +
                ", ram=" + ram +
                '}';
    }

    static class Builder{
        private String brand;
        private String model;
        private int camera;
        private boolean NFC;
        private double displaySize;
        private int storage;
        private double price;
        private int ram;

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setCamera(int camera) {
            this.camera = camera;
            return this;
        }

        public Builder setNFC(boolean NFC) {
            this.NFC = NFC;
            return this;
        }

        public Builder setDisplaySize(double displaySize) {
            this.displaySize = displaySize;
            return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setRam(int ram) {
            this.ram = ram;
            return this;
        }
        public Phone build(){
            return new Phone(this);
        }
    }
}

public class PhoneScenario {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder().setBrand("Samsung").setCamera(2).setModel("Galaxy s23").setNFC(true)
                .setPrice(200000).setRam(8).setStorage(168).setDisplaySize(6.2).build();
        System.out.println(phone);
    }
}
