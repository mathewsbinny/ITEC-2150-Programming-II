    abstract class Instrument {
        // Abstract method to be completed by subclasses
        public abstract void play();
    }
    class Guitar extends Instrument {
        public void play() {
            System.out.println("Guitar is playing.");
        }
    }
    class Piano extends Instrument {
        public void play() {
            System.out.println("Piano is playing.");
        }
    }
    public class InstrumentDemo {
        public static void main(String[] args) {
            Instrument guitar = new Guitar();
            Instrument piano = new Piano();
            playInstrument(guitar);
            playInstrument(piano);
        }
        public static void playInstrument(Instrument instrument) {
            instrument.play();
        }
    }

