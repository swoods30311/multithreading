public class Multithreading {
    public static void main(String[] args) {
        MultithreadThing myThing = new MultithreadThing();
        MultithreadThing myThing2 = new MultithreadThing();

        //code that executes multiple concurrent threads in the run method
        myThing.start();
        myThing2.start();
    }
}
