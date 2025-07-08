package Fifth;

public interface Printable {
    void print();
}

class Document implements Printable {
    private String file;

    public Document(String file) {
        this.file = file;
    }

    @Override
    public void print(){
        System.out.println("\nPrinting Document...");
        System.out.println("Filename: " + file);
        System.out.println("Printed successfully!");
    }
}

class Image implements Printable{
    private String file;

    public Image(String file) {
        this.file = file;
    }

    @Override
    public void print() {
        System.out.println("\nPrinting Image...");
        System.out.println("Filename: " + file);
        System.out.println("Printed successfully!");
    }
}