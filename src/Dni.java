public class Dni {
    public static final char[] Letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };

    private int numDni;
    private char letter;

    public Dni(int numDni) {
        this.numDni = numDni;
        letter = Letras[numDni % 23];
    }

    @Override
    public String toString() {
        return numDni + "-" + letter;
    }
}
