package com.tsekhanovich.masterclass.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 * @author Pavel Tsekhanovich 09.11.2018
 */

public class Main {

    public static void main(String[] args) {
        writeByFileWriter();
        readByFileReader();

        writeByDataOutputStream();
        readByDataInputStream();

        writeByObjectOutputStream();
        readByObjectInputStream();
    }

    private static void writeByFileWriter() {
        try (FileWriter fileWriter = new FileWriter("result.txt")) {
            fileWriter.write("Using FileWriter example");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readByFileReader() {
        try (Scanner scanner = new Scanner(new FileReader("result.txt"))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeByDataOutputStream() {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("resultData.txt")))) {
            dataOutputStream.writeUTF("Writing using byte streams a bit more difficult");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readByDataInputStream() {
        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("resultData.txt")))) {
            System.out.println(dataInputStream.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeByObjectOutputStream() {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.txt"))) {
            Contact contact = new Contact("Artem", "Esipovich", "+375291111111");
            objectOutputStream.writeObject(contact);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readByObjectInputStream() {
        try (ObjectInput objectInput = new ObjectInputStream(new BufferedInputStream(new FileInputStream("object.txt")))) {
            System.out.println(objectInput.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
