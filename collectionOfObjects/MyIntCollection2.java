
//  Approach #3:Encapsulating a Standard Collection (MyIntCollection2)
import java.util.ArrayList;

public class MyIntCollection2 {
    // Instead, we're encapsulating a ArrayList inside of this class.
    ArrayList<Integer> numbers;
    // We define a few extra attributes and methods beyond those that the
    // encapsulated ArrayList will provide -- the SAME attributes and methods
    // that we declared for the MyIntCollection class:
    private int smallestInt;
    private int largestInt;
    private int total;

    public MyIntCollection2() {
        // Instantiate the embedded ArrayList.
        numbers = new ArrayList<Integer>();
        // Initialize the total.
        total = 0;
    }

    // Since we don't INHERIT a size() method any longer, let's add one!
    public int size() {
        // DELEGATION!
        return numbers.size();
    }

    // Since we don't INHERIT an add() method any longer, let's add one!
    public boolean add(int i) {
        // Remember this int as the largest/smallest,
        // if appropriate. (The FIRST time we add a value, it by default
        // will be BOTH the smallest AND the largest!)
        // DELEGATE to the embedded collection.
        if (numbers.isEmpty()) {
            smallestInt = i;
            largestInt = i;
        } else {
            if (i < smallestInt)
                smallestInt = i;
            if (i > largestInt)
                largestInt = i;
        }
        // Increase the total.
        total = total + i;

        // Add the int to the numbers collection.
        // DELEGATE to the embedded collection.
        return numbers.add(i);
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