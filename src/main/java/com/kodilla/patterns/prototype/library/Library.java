package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.TasksList;

import java.util.HashSet;
import java.util.Set;

public class Library extends Prototype {

    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        String s = "Book [" + name + "]\n";
        for(Book set : books) {
            s = s + set.toString() + "\n";
        }
        return s;
    }

    public Library shallowCopy() throws CloneNotSupportedException{
        return (Library)super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException{
        Library cloneLibrary = (Library)super.clone();
        cloneLibrary.books = new HashSet<>();
        for(Book set: books){
            Book clonedSet = new Book(set.getTitle(), set.getAuthor(), set.getPublicationDate());
            cloneLibrary.getBooks().add(clonedSet);
        }
        return cloneLibrary;
    }

}
