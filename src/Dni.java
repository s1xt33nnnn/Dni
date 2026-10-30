public class Dni {
    public static final char[] Letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    private int numDni;
    private char letter;

    public Dni(int numDni) {
        this.numDni = numDni;
        letter = Letras[numDni % 23];
    }

    public Dni(int numDni, char letter) {
        this.letter = letter;
        char realLetter = Letras[numDni % 23];
        if (realLetter != letter) {
            this.numDni = -numDni;
        } else {
            this.numDni = numDni;
        }
    }

    public Dni(String str){

    }

    public boolean isCorrect() {
        return numDni >= 0;
    }

    @Override
    public String toString() {
        return numDni + "-" + letter;
    }
}
