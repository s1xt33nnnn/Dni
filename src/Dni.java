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
    String strNumber = str.replaceAll("[^\\d]","");
        numDni = Integer.parseInt(strNumber);
        letter = str.toUpperCase().charAt(str.length() - 1);
        char realLetter = Letras[numDni % 23];
        if (realLetter != letter){
            numDni = -numDni;
        }
    }
    public Dni(){
        numDni=0;
        letter='T';
    }


    public boolean isCorrect() {
        return numDni >= 0;
    }

    public int getNumDni() {
        return numDni;
    }

    public void setNumDni(int numDni) {
        this.numDni = numDni;
        char realLetter = Letras[numDni % 23];
        if (realLetter != letter){
            this.numDni = -this.numDni;
        }
    }

    public static char letterForDni( int numDni){
        return Letras[numDni % 23];
    }

    public static String NifForDni(int numDni){
        return  numDni + "-" + letterForDni(numDni);
    }

    public char getLetter() {
        return letter;
    }

    @Override
    public String toString() {
        return numDni + "-" + letter;
    }
}
