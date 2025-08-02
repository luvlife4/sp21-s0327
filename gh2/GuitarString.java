package gh2;

import deque.Deque;
import deque.LinkedListDeque;
import deque.ArrayDeque;
// TODO: maybe more imports

//Note: This file will not compile until you complete the Deque implementations
public class GuitarString {
    /**
     * Constants.
     */
    private static final int SR = 44100;      // Sampling Rate
    private static final double DECAY = .996; // energy decay factor

    /* Buffer for storing sound data. */
    private Deque<Double> buffer;

    /* Create a guitar string of the given frequency.  */
    public GuitarString(double frequency) {
        buffer = new LinkedListDeque();
        for (int i = 0; i < Math.round(SR / frequency); i++) {
            buffer.addFirst(0.0);
        }
    }
    /* Pluck the guitar string by replacing the buffer with white noise. */
    public void pluck() {
        for (int i = 0; i < buffer.size(); i++) {
            buffer.resetItem(i + 1, Math.random() - 0.5);
        }
    }

    /* Advance the simulation one time step by performing one iteration of
     * the Karplus-Strong algorithm.
     */
    public void tic() {
        double x= ((buffer.get(0)+buffer.get(1))/2)*DECAY;
        buffer.removeFirst();
        buffer.addLast(x);
        // TODO: Dequeue the front sample and enqueue a new sample that is
        //       the average of the two multiplied by the DECAY factor.
        //       **Do not call StdAudio.play().**
    }

    /* Return the double at the front of the buffer. */
    public double sample() {
        double a= buffer.get(0);
        return a;
    }
}





