import org.w3c.dom.ls.LSOutput;

import java.awt.print.Book;
import java.util.Scanner;
import java.util.Stack;

public class Book_Information extends Main {
    public static String[] BookName;
    public static String[] BookAuthor;
    public static String[] BookPublisher;
    public static String[] BookISBN;
    public static String[] BookPublishedDate;
    public static String[] BookPublishedTitle;

    public static void setBookName(String[] bookName) {
        BookName = bookName;
    }

    public static void setBookAuthor(String[] bookAuthor) {
        BookAuthor = bookAuthor;
    }

    public static void setBookPublisher(String[] bookPublisher) {
        BookPublisher = bookPublisher;
    }

    public static void setBookISBN(String[] bookISBN) {
        BookISBN = bookISBN;
    }

    public static void setBookPublishedDate(String[] bookPublishedDate) {
        BookPublishedDate = bookPublishedDate;
    }

    public static void setBookPublishedTitle(String[] bookPublishedTitle) {
        BookPublishedTitle = bookPublishedTitle;
    }

    public static String[] getBookName() {
        return BookName;
    }

    public static String[] getBookAuthor() {
        return BookAuthor;
    }

    public static String[] getBookPublisher() {
        return BookPublisher;
    }

    public static String[] getBookISBN() {
        return BookISBN;
    }

    public static String[] getBookPublishedDate() {
        return BookPublishedDate;
    }

    public static String[] getBookPublishedTitle() {
        return BookPublishedTitle;
    }

}




