
//  Approach #2:Extending a Predefined Collection Class (MyIntCollection)
import java.util.ArrayList;

public class MyIntCollection extends ArrayList<Integer> {
    // We inherit all of the attributes and methods of a standard ArrayList
    // as is, then define a few extra attributes and methods of our own:
    // two ints to keep track of the smallest and largest values
    // added to the collection, plus another int to keep a running
    // total of all values added to the collection.
    private int smallestInt;
    private int largestInt;
    private int total;

    // Replace the default constructor.
    public MyIntCollection() {
        // Do everything defined by the constructor of the ArrayList
        // base class first - we needn't know what those things are, simply
        // that we ought to do them!
        super();
        // Initialize the total.
        total = 0;
    }

    // Override the add() method as inherited from ArrayList.
    public boolean add(int i) {
        // Remember this int as the largest/smallest, if appropriate.
        // (The FIRST time we add a value, that value will, by definition,
        // be BOTH the smallest AND the largest that we've seen so far!)
        if (this.isEmpty()) {
            smallestInt = i;
            largestInt = i;
        } else {
            if (i < smallestInt)
                smallestInt = i;
            if (i > largestInt)
                largestInt = i;
        }
        // Include this value in the running total.
        total = total + i;
        // Insert the int into the collection using the add method as implemented
        // by the ArrayList base class. Again, we needn't understand
        // the inner workings of HOW this method does so ...
        return super.add(i);
    }

    // Several new methods.
    public int getSmallestInt() {
        return smallestInt;
    }

    public int getLargestInt() {
        return largestInt;
    }

    public double getAverage() {
        // Note that we must cast ints to doubles to avoid
        // truncation when dividing.
        return ((double) total) / ((double) this.size());
    }
}

// question, when whe should use our own type of collections like this one?