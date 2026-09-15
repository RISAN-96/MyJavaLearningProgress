package September15;

public class T72_Java_Thread_Life_Cycle {
    public static void main(String[] args) {

    }
}

/*
* lifecycle of a thread
* 1.new
* 2.runnable <---------------------------
                                          4. Non runnable (blocked)
* 3.running ---------------------------->
* 5.terminated*
* */


// new - instances of a thread created which is not yet started by invoking start()

// runnable - after invocation of start () & before it is selected to be run by the scheduler

// running - after thread scheduler has started it

// non runnable - thread alive, not eligible to run

// terminated - run() method has exited