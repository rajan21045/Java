 public class GarbageCollectionExample {
    // finalize() is called by GC before object is delete
    protected void finalize() throws Throwable {
        System.out.println("Object is garbage collected");
    }

    public static void main(String[] args) {
        // Creating an object
        GarbageCollectionExample obj1 = new GarbageCollectionExample();
        GarbageCollectionExample obj2 = new GarbageCollectionExample();

        // Making objects eligible for GC
        obj1 = null; // unreferenced
        obj2 = null; // unreferenced

        // Requesting JVM to run Garbage Collector
        System.gc();

        System.out.println("Main method ends");
    }
}

/*
 What is Garbage Collection (GC) in Java?
 Garbage Collection is the process by which Java automatically frees up memory by destroying objects that are no longer in use or not referenced anymore.

In Java, memory is allocated for objects in the heap. When an object is no longer needed, the garbage collector deletes it so that memory can be reused.

Why GC Is Needed?

1. To avoid memory leaks
2. To reuse memory efficiently
3.To reduce chances of OutOfMemoryError

How to Achieve Garbage Collection?
In Java, garbage collection happens automatically, but you can suggest it manually using:
System.gc();
This is just a request, not a command. The JVM decides when to actually run GC.


 */