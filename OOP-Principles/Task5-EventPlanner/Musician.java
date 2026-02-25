/**
 * Musician class represents a specialist who knows how to play music
 * This class has its own specific responsibility: playing music
 * Used in the Delegation pattern by EventPlanner
 */
public class Musician {
    private String name;
    private String instrument;

    /**
     * Constructor for Musician
     * @param name Name of the musician
     * @param instrument Primary instrument they play
     */
    public Musician(String name, String instrument) {
        this.name = name;
        this.instrument = instrument;
        System.out.println("Musician hired: " + name + " (Instrument: " + instrument + ")");
    }

    /**
     * Musician's primary responsibility: playing music
     * EventPlanner will DELEGATE this task to the Musician
     */
    public void playMusic() {
        System.out.println("\n--- Music Entertainment ---");
        System.out.println("Musician " + name + " is performing");
        System.out.println("Setting up " + instrument + "...");
        System.out.println("Playing opening song...");
        System.out.println("♪♫ Music is playing ♫♪");
        System.out.println("Playing background music during dinner...");
        System.out.println("Special performance time!");
        System.out.println("✓ Entertainment complete!");
    }

    /**
     * Additional musician functionality
     */
    public void performSong(String songTitle) {
        System.out.println("Musician " + name + " is performing: " + songTitle);
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getInstrument() {
        return instrument;
    }
}
