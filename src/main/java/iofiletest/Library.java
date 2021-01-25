package iofiletest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> library = new ArrayList<>();

    public void add(Book book){
        if(!existing(book)){
            this.library.add(book);
        }
    }

    public void saveBooks(Path path){
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (Book book: library) {
                writer.write(book.getAuthor() + "," + book.getTitle() + "\n");
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not write", ioe);
        }
    }

    public void loadBooks(Path path){
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            String[] data;
            while ((line = reader.readLine()) != null) {
                data = line.split(",", 2);
                this.library.add(new Book(data[0], data[1]));
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not write", ioe);
        }
    }

    private boolean existing(Book book){
        for(Book book1 : this.library){
            if(book1.getTitle().equals(book.getTitle()) || book1.getAuthor().equals(book.getAuthor())){
                return true;
            }
        }
        return false;
    }

}
