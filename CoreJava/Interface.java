package CoreJava;

interface Playable {
    void play();
}

class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the guitar.");
    }
}

class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the piano.");
    }
}

public class Interface {
    public static void main(String[] args) {
        Playable guitar = new Guitar();
        Playable piano = new Piano();

        guitar.play();  // Output: Playing the guitar.
        piano.play();   // Output: Playing the piano.
    }
}
