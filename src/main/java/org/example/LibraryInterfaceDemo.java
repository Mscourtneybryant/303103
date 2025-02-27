package org.example;

// LibraryUser interface
interface LibraryUser {
    void registerAccount(int age);
    void requestBook(String bookType);
}

// KidUser class implementing LibraryUser
class KidUser implements LibraryUser {
    private int age;
    private String bookType;

    @Override
    public void registerAccount(int age) {
        this.age = age;
        if (age <= 11) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("Sorry, age must be less than 12 to register as a kid.");
        }
    }

    @Override
    public void requestBook(String bookType) {
        this.bookType = bookType;
        if (bookType.equals("Kids")) {
            System.out.println("Book issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books.");
        }
    }
}

// AdultUser class implementing LibraryUser
class AdultUser implements LibraryUser {
    private int age;
    private String bookType;

    @Override
    public void registerAccount(int age) {
        this.age = age;
        if (age >= 12) {
            System.out.println("You have successfully registered under an Adult Account.");
        } else {
            System.out.println("Sorry, age must be greater than 12 to register as an adult.");
        }
    }

    @Override
    public void requestBook(String bookType) {
        this.bookType = bookType;
        if (bookType.equals("Fiction")) {
            System.out.println("Book Issued successfully, please return the book within 7 days.");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books.");
        }
    }
}


public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser kidUser = new KidUser();
        kidUser.registerAccount(10);
        kidUser.requestBook("Kids");

        kidUser = new KidUser();
        kidUser.registerAccount(18);
        kidUser.requestBook("Fiction");

   
        AdultUser adultUser = new AdultUser();
        adultUser.registerAccount(5);
        adultUser.requestBook("Kids");

        adultUser = new AdultUser();
        adultUser.registerAccount(23);
        adultUser.requestBook("Fiction");
    }
}
