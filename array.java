import java.util.ArrayList;

class Student {

      int rollno;
      String name;
      int marks;
}

public class array {

      public static void main(String[] args) {

            // NORMAL ARRAY

            // int num[] = { 5, 6, 7 };

            // for (int i = 0; i < 3; i++) {

            // System.out.println(num[i]);
            // }

            // int mat[][] = new int[3][3];
            // // int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

            // for (int i = 0; i < 3; i++) {

            // for (int j = 0; j < 3; j++) {

            // mat[i][j] = (int) (Math.random() * 100);
            // }
            // }

            // for (int i = 0; i < 3; i++) {

            // for (int j = 0; j < 3; j++) {

            // System.out.print(mat[i][j] + " ");
            // }
            // System.out.println();
            // }

            // // enhanced for loop
            // for (int n[] : mat) {

            // for (int m : n) {
            // System.out.print(m + " ");
            // }
            // System.out.println();
            // }

            // JAGGED ARRAY

            // int num[][] = new int[3][];

            // num[0] = new int[3];
            // num[1] = new int[4];
            // num[2] = new int[2];

            // for (int i = 0; i < num.length; i++) {

            // for (int j = 0; j < num[i].length; j++) {

            // num[i][j] = (int) (Math.random() * 100);
            // }
            // }

            // for (int i = 0; i < num.length; i++) {

            // for (int j = 0; j < num[i].length; j++) {

            // System.out.print(num[i][j] + " ");
            // }
            // System.out.println();
            // }

            // for (int n[] : num) {
            // for (int m : n) {

            // System.out.print(m + " ");
            // }
            // System.out.println();
            // }

            // 3-D ARRAY

            // int num[][][] = new int[3][3][3];

            Student s1 = new Student();
            s1.rollno = 1;
            s1.name = "Naveen";
            s1.marks = 88;

            Student s2 = new Student();
            s2.rollno = 2;
            s2.name = "Harsh";
            s2.marks = 99;

            Student s3 = new Student();
            s3.rollno = 3;
            s3.name = "Kiran";
            s3.marks = 76;

            Student students[] = new Student[3];

            students[0] = s1;
            students[1] = s2;
            students[2] = s3;

            // for (int i = 0; i < students.length; i++) {

            //       System.out.println(students[i].name + " : " + students[i].marks);
            // }
            
            for (Student stud : students) {
                  
                  System.out.println(stud.name + " : " + stud.marks);
            }

            int arr[] = new int[4];

            arr[0] = 4;
            arr[1] = 5;
            arr[2] = 6;
            arr[3] = 7;

            // for (int i = 0; i < arr.length; i++) {

            //       System.out.println(arr[i]);
            // }

            // for (int n : arr) {

            //       System.out.println(n);
            // }
            
            
      }
}
