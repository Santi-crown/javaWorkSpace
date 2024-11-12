public class MyIntCollectionExample {
    public static void main(String[] args) {
        // Instantiate one of our newly designed collections.
        MyIntCollection mic = new MyIntCollection();
        // Add four random integers to our "special" collection.
        mic.add(3);
        mic.add(6);
        mic.add(1);
        mic.add(9);
        // Take advantage of the size method as inherited from ArrayList ...
        System.out.println("The collection contains " + mic.size() +
                " int values");
        System.out.println(mic);
        // ... and then ask mic "specialized" questions about its contents that a
        // garden-variety ArrayList couldn't easily answer.
        System.out.println("The smallest value is:  " + mic.getSmallestInt());
        System.out.println("The largest value is:  " + mic.getLargestInt());
        System.out.println("The average is:  " + mic.getAverage());
    }
}