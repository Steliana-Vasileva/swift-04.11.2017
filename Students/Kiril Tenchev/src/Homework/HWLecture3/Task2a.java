package Homework.HWLecture3;
import java.util.Scanner;
public class Task2a {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter size:");
        int size=Integer.parseInt(sc.nextLine()); //Милен: Защо четеш стринг, като веднага след това го обръщаш в число ?
        String str=sc.nextLine();
        String []nums=str.split(" ");
        int sum=0;
        if(nums.length!=size){ //Милен: БРАВО! Много добре си направил проверка
            System.out.println("Illegal number of elements!");

        }
        else{
            for (int i = 0; i <nums.length ; i++) {
                sum+=Integer.parseInt(nums[i]);
            }
            System.out.println(sum);
        }
    }
}
