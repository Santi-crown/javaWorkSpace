import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {
        // Instantiate a HashMap with String as the key type and Student as
        // the value type.
        HashMap<String, Student> students = new HashMap<String, Student>();

        // Instantiate three Students; the constructor arguments are
        // used to initialize Student attributes idNo and name,
        // respectively, which are both declared to be Strings.
        Student s1 = new Student("12345-12", "Fred");
        Student s2 = new Student("98765-00", "Barney");
        Student s3 = new Student("71024-91", "Wilma");

        // Insert all three Students into the HashMap, using their idNo
        // as a key.
        students.put(s1.getIdNo(), s1);
        students.put(s2.getIdNo(), s2);
        students.put(s3.getIdNo(), s3);

        // If it is NOT the case that the students HashMap already contains
        // a key value matching the idNo of student s1 ...
        if (!(students.containsKey(s1.getIdNo()))) {
            // ... then it is safe to add such a reference.
            students.put(s1.getIdNo(), s1);
        } else {
            // Another Student reference with the same idNo value is already in the HashMap.
            System.out.println("ERROR:  Duplicate student ID found in HashMap:  " +
                    s1.getIdNo());
        }

        // Retrieve a Student based on a particular (valid) ID.
        String id = "98765-00";
        System.out.println("Let's try to retrieve a Student with ID = " + id);
        Student x = students.get(id);

        // If the value returned by the get method is non-null, then
        // we indeed found a matching Student ...
        if (x != null) {
            System.out.println("Found!  Name = " + x.getName());
        }
        // ... whereas if the value returned was null, then we didn't find
        // a match on the id that was passed in as an argument to get().

        else {
            System.out.println("Invalid ID:  " + id);
        }

        // Try an invalid ID.
        id = "00000-00";
        System.out.println("Let's try to retrieve a Student with ID = " + id);
        x = students.get(id);
        if (x != null) {
            System.out.println("Found!  Name = " + x.getName());
        } else {
            System.out.println("Invalid ID:  " + id);
        }
        System.out.println();
        System.out.println("Here are all of the students:");
        System.out.println();
        // Iterate through the HashMap to process all Students.
        for (Student s : students.values()) {
            System.out.println("ID:  " + s.getIdNo());
            System.out.println("Name:  " + s.getName());
            System.out.println();
        }

    }

}
