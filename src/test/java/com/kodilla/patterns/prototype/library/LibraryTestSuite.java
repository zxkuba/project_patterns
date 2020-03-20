package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){
        //Given
        //When
        Book book = new Book("zx", "zx", LocalDate.of(9999, 12, 31));

        Library library = new Library("Horror");
        library.getBooks().add(book);
        System.out.println(library);

        //making a shallow clone of object board
        Library clonedLibrary = null;
        try{
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Komedia");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("Tragedia");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //Then
        Assert.assertEquals(1, library.getBooks().size());
        Assert.assertEquals(1, clonedLibrary.getBooks().size());
        Assert.assertEquals(1, deepCloneLibrary.getBooks().size() );



    }

}