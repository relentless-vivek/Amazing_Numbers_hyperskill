// write your class here

import java.util.Arrays;

class Book {
    String title;
    int yearOfPublishing;
    String[] authors;

    Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        if (authors == null) {
            this.authors = new String[0];
        } else {
            this.authors = Arrays.copyOf(authors, authors.length);
        }
    }
}