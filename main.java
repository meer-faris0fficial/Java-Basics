// class Book{
//     static int totalNoOfBooks;
//     // String author;
//     // String title;
//     // String isbn;
//     boolean isBorrowed;

//     static {
//         totalNoOfBooks = 0;
//     }
//     {
//         totalNoOfBooks++;
//     }

//     // Book(String isbn, String title, String author ){
//     //     this.isbn = isbn;
//     //     this.author = author;
//     //     this.title = title;

//     }

//     Book(String isbn){
//         this(isbn, "Unknown", "Unknown");
//     }

//     static int getaTotalnoofbooks(){
//         return totalNoOfBooks;
//     }

//     void borrowBook(){
//         if (isBorrowed){
//             System.out.println("Book is already borrowed");
//         }else{
//             this.isBorrowed = true;
//             System.out.println("Enjoy the book");
//         }
        
//     }

//     void returnBook(){
//         if (isBorrowed){
//             this.isBorrowed = false;
//             System.out.println("Hope you enjoyed, Please leave a review");
//         } else {
//             System.out.println("This book is already in the library");

//         }
//     }
// }

// // public class main{
// //     public static void main(String[] args) {
// //         Book designOfThings = new Book("1", "Design", "Author");
// //         Book myBook = new Book("2");
// //         System.out.println(Book.getaTotalnoofbooks());
// //         designOfThings.borrowBook();
// //         designOfThings.returnBook();
// //         designOfThings.returnBook();
// //     }
// // }

