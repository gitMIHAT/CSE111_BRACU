public class Reader {
    public String name;
    public String[] books;
    public int capacity;
    public int index;
    public Reader(String n) {
        name = n;
        capacity = 2;
        books = new String[capacity];
        System.out.println("A new reader is created!");
    }
    public Reader(String n, int c) {
        name = n;
        capacity = c;
        books = new String[capacity];
        System.out.println("A new reader is created!");
    }
    public void addBook(String n) {
        if (index < capacity) {
            books[index] = n;
            index++;
        } else {
            System.out.println("No more capacity");
        }
    }
    public void readerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Capacity: " + capacity);
        System.out.println("Books: ");
        if (index == 0) {
            System.out.println("No books added yet");
        } else {
            for (int i = 0; i < index; i++) {
                System.out.println("Book " + (i + 1) + ": " + books[i]);
            }
        }
    }
    public void updateCapacity(int c) {
            String[] nBooks = new String[c];
            for (int i = 0; i < index; i++) {
                nBooks[i] = books[i];
            }
            books = nBooks;
            capacity = c;
            System.out.println("Capacity has changed to " + capacity);
    }
}
