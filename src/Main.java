import javax.print.attribute.standard.JobOriginatingUserName;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        System.out.println("=== Welcome to the library ===");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name :");
        String name =sc.nextLine();
        System.out.println("Enter last name:");
        String lastName=sc.nextLine();
        System.out.println("Enter the birthday :");
        String birthday=sc.nextLine();
        System.out.println("Enter the age :");
        int age=sc.nextInt();
        System.out.println("Enter the gender :1 is man 2 is woman");
        int gender=sc.nextInt();

        if(gender==1){
            System.out.println("man");
        }
        else if(gender==2){
            System.out.println("woman");
        }
        else{
            System.out.println("this number is invalid number ");
        }
        sc.nextLine();
        System.out.println("Enter the phone number :");
        String phone=sc.nextLine();
        sc.nextLine();
        System.out.println("Enter the address :");
        String address=sc.nextLine();
        sc.nextLine();
        System.out.println("___________________________________________-");
        Personal_Information p1=new Personal_Information();
        p1.setName(name);
        p1.setLastName(lastName);
        p1.setAddress(address);
        p1.setBirthday(birthday);
        p1.setGender(gender);
        p1.setPhone(phone);
        p1.setAge(age);
        p1.getPhone();


        System.out.println("full name :"+p1.getName()+ " "+p1.getLastName());
        System.out.println("Age :"+p1.getAge());
        System.out.println("phone number :"+p1.getPhone());
        System.out.println("address :"+p1.getAddress());
        System.out.println("birthday :"+p1.getBirthday());
        System.out.println("gender :"+p1.getGender());
        System.out.println("\t=== thinks for the information ===\t");
        System.out.println("____________________________________________________");
        Book_Information book = new Book_Information();
        System.out.println("Enter the member of the book: ");
        int member = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name of the book :");
        String[] name = new String[member];
        for (int i = 0; i < member; i++) {
            name[i] = sc.nextLine();
        }
        for (int i = 0; i < member; i++) {
            System.out.println(name[i]);
        }
        System.out.println("_______________________________________");
        System.out.println("Enter the  Book Author :");
        String[] author = new String[member];
        for (int i = 0; i < member; i++) {
            author[i] = sc.nextLine();
        }
        for (int i = 0; i < member; i++) {
            System.out.println(author[i]);
        }
        System.out.println("_______________________________________");
        System.out.println("Enter the  Book Publisher :");
        String[] publisher = new String[member];
        for (int i = 0; i < member; i++) {
            publisher[i] = sc.nextLine();

        }
        for (int i = 0; i < member; i++) {
            System.out.println(publisher[i]);
        }

        System.out.println("_______________________________________");
        System.out.println("Enter the  Book ISBN :");
        String[] ISBN = new String[member];
        for (int i = 0; i < member; i++) {
            ISBN[i] = sc.nextLine();

        }
        for (int i = 0; i < member; i++) {
            System.out.println(ISBN[i]);
        }

        System.out.println("______________________________________");
        System.out.println("Enter the  Book Published Date :");
        String[] publishedDate = new String[member];
        for (int i = 0; i < member; i++) {
            publishedDate[i] = sc.nextLine();

        }
        for (int i = 0; i < member; i++) {
            System.out.println(publishedDate[i]);
        }


        System.out.println("______________________________________");
        System.out.println("Enter the  Book Published Title :");
        String[] publishedTitle = new String[member];
        for (int i = 0; i < member; i++) {
            publishedTitle[i] = sc.nextLine();

        }
        for (int i = 0; i < member; i++) {
            System.out.println(publishedTitle[i]);
        }

        book.setBookName(name);
        book.setBookAuthor(author);
        book.setBookPublisher(publisher);
        book.setBookISBN(ISBN);
        book.setBookPublishedDate(publishedDate);
        book.setBookPublishedTitle(publishedTitle);
        System.out.println("______________________________________");
        book.getBookISBN();
        book.getBookAuthor();
        book.getBookPublishedTitle();
        book.getBookPublishedDate();
        book.getBookPublishedTitle();
        book.getBookName();
        for (int i = 0; i < member; i++) {
            System.out.println(i + "user Information " + " name : " + " " + name[i] +
                    "author :" + " " + author[i] + "$" +
                    "publisher :" + " " + publisher[i] + " " + ISBN[i] +
                    "publishedDate :" + " " + publishedDate[i] + "__" +
                    "publishedTitle :" + " " + publishedTitle[i]);
        }
        System.out.println("______________________________________");
        System.out.println("this is the list of the all edit : \n" + "1.name 2.author 3.publisher" +
                " 4.ISBN 5.publishedDate 6.publishedTitle");
        for (int i = 0; i < member; i++) {
            System.out.println("do you want edit this book name " + name[i] + "(y/n)");
            String choice = sc.nextLine().trim().toLowerCase();
            if (choice.equals("y")) {
                System.out.println("Enter the new name :");
                name[i] = sc.nextLine();
                for (String newName : name) {
                    System.out.println(newName);
                }
            } else if (choice.equals("n")) {
                System.out.println("=== i dont no ===");
            }
        }
        System.out.println("______________________________________");
        for (int i = 0; i < member; i++) {
            System.out.println("do you want change the author :" + author[i] + "(y/n)?");
            String choice = sc.nextLine().trim().toLowerCase();
            if (choice.equals("y")) {
                System.out.println("Enter the new author :");
                author[i] = sc.nextLine();
                System.out.println("final author  is " + author[i]);
                for (String newAuthor : author) {
                    System.out.println(newAuthor);
                }
            } else if (choice.equals("n")) {
            }

        }
        System.out.println("______________________________________");
        for (int i = 0; i < member; i++) {
            System.out.println("do you want to the edit the  publisher :" + publisher[i] + "(y/n)?");
            String charecter = sc.nextLine().trim().toLowerCase();
            if (charecter.equals("y")) {
                System.out.println("enter the new publisher :");
                publisher[i] = sc.nextLine();
                System.out.println("final publisher is " + publisher[i]);
                for (String newPublisher : publisher) {
                    System.out.println(newPublisher);

                }

            } else if (charecter.equals("n")) {
                System.out.println("=== i dont no ===");

            } else {
                System.out.println("this is invalid choice");
            }
        }
        System.out.println("______________________________________");
        for (int i = 0; i < member  ; i++) {
            System.out.println("do you want to the edit ISBN :" + ISBN[i] + "(y/n)?");
            String isbn = sc.nextLine().trim().toLowerCase();
            if (isbn.equals("y")) {
                System.out.println("enter the new ISBN :");
                ISBN[i] = sc.nextLine();
                System.out.println("final ISBN is " + ISBN[i]);
                for (String newISBN : ISBN) {
                    System.out.println(newISBN);

                }

            }
            else if (isbn.equals("n")) {
                System.out.println("=== i dont no ===");
            }
            else {
                System.out.println("this is invalid choice");
            }
        }
        System.out.println("___________________________-");
        for (int i = 0; i < member; i++) {
            System.out.println("do you want to edit the publisher Date  :" + publisher[i] + "(y/n)?");
            String date = sc.nextLine().trim().toLowerCase();
            if (date.equals("y")) {
                System.out.println("enter the new publisher :");
                publisher[i] = sc.nextLine();
                System.out.println("final publisher is " + publisher[i]);
                for (String newPublisher : publisher) {
                    System.out.println(newPublisher);
                }
            } else if (date.equals("n")) {
                System.out.println("=== i dont no ===");

            } else {
                System.out.println("this is invalid choice");
            }
        }
        System.out.println("______________________________________");
        for (int i = 0; i < member; i++) {
            System.out.println("do you want to delete the publisher :" + publisher[i] + "(y/n)?");
            String delete = sc.nextLine().trim().toLowerCase();
            if (delete.equals("y")) {
                System.out.println("enter the new publisher :");
                publisher[i] = sc.nextLine();
                System.out.println("final publisher is " + publisher[i]);
                for (String newPublisher : publisher) {
                    System.out.println(newPublisher);

                }
            } else if (delete.equals("n")) {
                System.out.println("=== i dont no ===");
            } else {
                System.out.println("this is invalid choice");
            }
        }
        System.out.println("______________________________________");
        System.out.println("Enter the all of the members :");
        int newMember = sc.nextInt();
        String[] array1=new  String[newMember];
        System.out.println("Enter the user members :");
        for (int i = 0; i < newMember   ; i++) {
            array1[i]=sc.next();

        }
        for (int i = 0; i < newMember; i++) {
            System.out.println(array1[i]);

        }
        System.out.println("______________________________________");
        for (int i = 0; i < member; i++) {
            System.out.println("This user want to the give the Book :"+array1[i]+"(y/n)?");
            String choice = sc.next().trim().toLowerCase();
            if (choice.equals("y")) {
                for (int j = 0; j < member; j++) {
                    System.out.println("do you want this Book :" + name[i] + "(y/n)?");
                    String choiceBook = sc.next().trim().toLowerCase();
                    if (choiceBook.equals("y")) {
                        System.out.println(name[i]+" this book seved for you ");
                    }
                    else if (choiceBook.equals("n")) {
                        System.out.println("you dont chies this Book !");

                    }
                    else {
                        System.out.println("this is invalid choice");
                    }
                }
            }
            else if (choice.equals("n")) {

            }
            else {
                System.out.println("this is invalid choice");

            }
        }

        for (int i = 0; i < member; i++) {

            System.out.println("new name is :\t" + book.getBookName());
            System.out.println("new author is :\t" + book.getBookAuthor());
            System.out.println("new publisher is :\t" + book.getBookPublisher());
            System.out.println("new ISBN is :\t" + book.getBookISBN());
            System.out.println("new publishedDate is :\t" + book.getBookPublishedDate());
            System.out.println("new publishedTitle is :\t" + book.getBookPublishedTitle());
            System.out.println("===Thank you for entering and editing this information. " +
                    "A lot of effort has gone into making this possible for you.===");
        }

    }
}








