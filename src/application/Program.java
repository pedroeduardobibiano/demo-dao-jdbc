package application;

import model.entitites.Depatment;
import model.entitites.Seller;

import java.time.LocalDate;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Depatment obj = new Depatment(1, "Books");
        System.out.println(obj);

        Seller seller = new Seller(21, "Bob", "bob@gmail.com", LocalDate.now(), 3000.00, obj);
        System.out.println(seller);
    }
}
