
public class Student {

    private String idNo;
    private String name;

    // Constructor.
    public Student(String i, String n) {
        idNo = i;
        name = n;
    }

    public Student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getIdNo() {
        return idNo;
    }
}
