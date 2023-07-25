import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Q1

//        for(int i = 1; i<=100; i++){
//
//            if (i % 3 == 0 && i % 5 != 0){
//                System.out.println("Fizz");
//                continue;
//            }else if(i % 5 == 0 && i % 3 != 0){
//                System.out.println("Buzz");
//                continue;
//            }else if(i % 5 == 0 && i % 3 == 0){
//                System.out.println("FizzBuzz");
//                continue;
//
//            }
//            System.out.println(i);
//        }

       // Q2

//        String text = "The quick brown fox";
//        String reverseText  = "";
//        for (int i = text.length()-1; i >= 0; i--){
//            reverseText = reverseText + text.charAt(i) ;
//
//        }
//        System.out.println(reverseText);

        //Q3

//        Scanner data = new Scanner(System.in);
//        System.out.println("Enter a positive number");
//        int num = data.nextInt();
//        if ( num > 0) {
//        for (int i = 1; i <= 10 ; i++){
//            System.out.println(i * num);
//        }
//        }else{
//            System.out.println("invalid number ");
//        }


        //Q4

//        Scanner data = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int num = data.nextInt();
//        int factorial = 1;
//        for (int i = num; i > 0 ; i--){
//            factorial *= i;
//        }
//        System.out.println(  num+"!= "+ factorial);

        //Q5

//        Scanner data = new Scanner(System.in);
//        System.out.println("Enter first number");
//        int num1 = data.nextInt();
//        System.out.println("Enter second number");
//        int num2 = data.nextInt();
//        int power = 1;
//        for (int i = 1; i <= num2; i++){
//            power *= num1;
//
//        }
//        System.out.println(power);

        //Q6

//        Scanner data = new Scanner(System.in);
//        System.out.println("Enter 5 numbers");
//        int num ;
//        int odd_sum = 0;
//        int even_sum = 0;

//        for (int i = 1 ; i <=5 ; i++){
//             num = data.nextInt();
//             if(num % 2 == 0){
//                 even_sum += num;
//             }else{
//                 odd_sum += num;
//             }
//        }
//        System.out.println(odd_sum);
//        System.out.println(even_sum);

        //Q7

//        Scanner data = new Scanner(System.in);
//        System.out.println("Enter a positive number");
//        int num = data.nextInt();
//        boolean is_prime = true;
//        if (num > 0){
//            for(int i = 2; i <= num / 2; i++){
//              if(num % i == 0){
//                  is_prime = false;
//                  break;
//              }
//            }
//            if (is_prime) {
//
//                System.out.println("the number is  a prime number.");
//            }else{
//                System.out.println("the number is not a prime number.");
//            }
//        }else{
//            System.out.println("invalid number");
//        }


        //Q8


//        Scanner data = new Scanner(System.in);
//        System.out.println("Enter numbers  and enter 1000 to end");
//        int num ;
//        int positive_sum = 0;
//        int negative_sum = 0;
//        int count_0 = 0;
//        do{
//            num = data.nextInt();
//            if(num > 0 && num != 1000){
//                positive_sum += num;
//            }else if(num < 0 && num != 1000 ){
//                negative_sum += num;
//            } else if (num == 0 ) {
//                count_0++;
//            }
//
//            }while (num != 1000);
//        System.out.println("sum positive numbers= " +positive_sum);
//        System.out.println("sum negative numbers= "+negative_sum);
//        System.out.println("zeros entered: "+count_0);

        //Q9

//        int count = 1;
//
//        while (count <= 4 ){
//            System.out.println("Week"+ count);
//            for (int i = 0 ; i <= 7 ; i++){
//                System.out.println("Day"+ i);
//            }
//            count++;
//        }

        //Q10

//        Scanner data = new Scanner(System.in);
//        System.out.println("Enter your text");
//
//        String text = data.nextLine();
//        String reverseText  = "";
//        for (int i = text.length()-1; i >= 0; i--){
//            reverseText = reverseText + text.charAt(i) ;
//
//        }
//        System.out.println(reverseText);
//
//       if (reverseText != text){
//           System.out.println("the word is not a palindrome");
//       }else{
//           System.out.println("the word is  a palindrome");
//       }





        }
}