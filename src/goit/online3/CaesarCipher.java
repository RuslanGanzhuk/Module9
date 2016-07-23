package goit.online3;

public class CaesarCipher {

    public char cipher(char c, int k) {
        // declare some helping constants
        final int alphaLength = 26;
        final char asciiShift = Character.isUpperCase(c) ? 'A' : 'a';
        final int cipherShift = k % alphaLength;

        // shift down to 0..25 for a..z
        char shifted = (char) (c - asciiShift);
        // rotate the letter and handle "wrap-around" for negatives and value >= 26
        shifted = (char) ((shifted + cipherShift + alphaLength) % alphaLength);
        // shift back up to english characters
        return (char) (shifted + asciiShift);
    }

    // Rotate a string k-positions
    public  String cipher(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(cipher(s.charAt(i), k));
        }
        return sb.toString();
    }


}

