/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package average.calculator;
import java.util.Scanner;
/**
 *
 * @author aamir7110
 */
public class AverageCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyedInput = new Scanner(System.in);
        //variable declaration
        double [] marks = new double[5];
        
        double average;
        //asks for 5 numbers
        System.out.println("Enter Your Last Five Marks");
        //repeats keyed input 5 times
        for(int i = 0;i<=4; i++){
            marks[i] = keyedInput.nextDouble();
        }
        //calculates Average
        average = marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
        average = average/5;
        average = average*10;
        average = Math.round(average);
        average = average/10;
       //displays average
        System.out.println("Your average is "+average+"%");
        
        System.out.println("Here Are Your Marks Ordered From Lowest To Highest:");
        //orders marks from lowest to highest 
        for(int i = 0;i<=100;i++){
            
            if(marks[0] ==i){
                System.out.println(marks[0]);
            }
            if(marks[1] ==i){
                System.out.println(marks[1]);
            }
            if(marks[2] ==i){
                System.out.println(marks[2]);
            }
            if(marks[3] ==i){
                System.out.println(marks[3]);
            }
            if(marks[4] ==i){
                System.out.println(marks[4]);
            }
            
        }
        
    }
    
}
