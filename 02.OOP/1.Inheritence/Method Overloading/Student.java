class Student {

    int id;
    String name;

    void setStudent() {
        this.id = 100;
        this.name = "yoha";
    }

    void setStudent(int id) {
        this.id = id;       // Correctly sets this.id to the passed id
        this.name = "yoha"; // Sets this.name to "yoha"
    }

    void setStudent(String name) {
        this.id = 100;      // Sets this.id to 100
        this.name = name;   // Correctly sets this.name to the passed name
    }

    void setStudent(String name, int id) {
        this.id = id;       // Correctly sets this.id to the passed id
        this.name = name;   // Correctly sets this.name to the passed name
    }

    void setStudent(int id, String name) {
        this.id = id;       // Correctly sets this.id to the passed id
        this.name = name;   // Correctly sets this.name to the passed name
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
    }
}
