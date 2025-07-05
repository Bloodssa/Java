package First;

public class Information {
    private String name;
    private String id;
    private String course;

    public void setter(String name, String id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public String getCourse() {
        return course;
    }

    public void display() {
        System.out.println("\n--- Student Information ---");
        System.out.println("Name: " + getName());
        System.out.println("Student ID: " + getId());
        System.out.println("Course: " + getCourse());

    }

}
