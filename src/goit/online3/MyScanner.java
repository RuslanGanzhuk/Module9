package goit.online3;

import java.util.Scanner;

public class MyScanner {

    Scanner keyboard = new Scanner(System.in);
    CaesarCipher caesarCipher = new CaesarCipher();

    public void createTextToCipher() {

        String password;
        int key;

        System.out.print("Please enter a password: ");
        password = keyboard.nextLine();

        do {
            System.out.print("Please enter a key between 1-25: ");
            key = keyboard.nextInt();

            if (key < 1 || key > 25) {
                System.out.printf(" The key must be between 1 and 25, you entered %d.\n", key);
            }
        } while (key < 1 || key > 25);

        System.out.println("Password:\t" + password);
        String encryption = caesarCipher.cipher(password, key);
        System.out.println("Encrypted:\t" + encryption);
        System.out.println("Decrypted:\t" + caesarCipher.cipher(encryption, -key));
    }
}
