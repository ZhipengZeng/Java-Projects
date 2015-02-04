/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_final;
import java.util.GregorianCalendar;
import java.util.Scanner;
/**
 *
 * @author zzp
 */
public class Student {
    private static Student[] classA;
    private final String name;//---------------------------------------------------------attributes
    private final GregorianCalendar dateOfBirth = new GregorianCalendar();
    private double[] quiz;
    private double[] lab;
    private double gradeOfMidterm;
    private double gradeOfFinal;
    
    public Student(){//-----------------------------------------------------------constructor
        Scanner input = new Scanner(System.in);
        System.out.println("--- Name ---");
        name = input.next();
        setDoB();
        System.out.println("--- Grades ---");
        fillQuizArray();
        fillLabArray();
        System.out.print("Midterm: ");
        gradeOfMidterm = input.nextDouble();
        System.out.print("Final: ");
        gradeOfFinal = input.nextDouble();
    }
    
    public GregorianCalendar setDoB(){//------------------------------------------set the Date of Birth
        Scanner input = new Scanner(System.in);
        System.out.println("--- Birth ---");
        System.out.print("Year: ");
        int year = input.nextInt();
        System.out.print("Month: ");
        int month = input.nextInt();
        System.out.print("Date: ");
        int date = input.nextInt();
        dateOfBirth.set(year, month, date);
        return dateOfBirth;
    }

    
    public double[] fillQuizArray(){//-------------------------------------------fill the quiz[]
        Scanner input = new Scanner(System.in);
        quiz = new double[2];
        for(int j = 1; j <= quiz.length; j++){
            System.out.print("Quiz" + j + ":");
            quiz[j-1] = input.nextDouble(); 
        }
        return quiz;
    }
    
    public double[] fillLabArray(){//--------------------------------------------fill the lab[]
        Scanner input = new Scanner(System.in);
        lab = new double[5];
        for(int k = 1; k <= lab.length; k++){
            System.out.print("Lab" + k + ":");
            lab[k-1] = input.nextDouble(); 
        }
        return lab;
    }
    
    public String printArray(double[] data){//------------------------------------print the Quiz[] and Lab[]
        String stringArray = "";
        for(int k = 0; k < data.length; k++)
            stringArray += data[k]+"; ";
        return stringArray;
    }
    
    public double getOverall(){//-------------------------------------------------get the Overall
        double quizAll = 0;
        double labAll = 0;
        for(int i = 0; i < quiz.length; i++)
            quizAll += quiz[i];
        for(int k = 0; k < lab.length; k++)
            labAll += lab[k];
        double overall = quizAll + labAll + gradeOfMidterm + gradeOfFinal;
        return overall;
    }
    public double[] quizValidation(){//------------------------------------------validate the quiz
        for(int i = 0; i < quiz.length; i++ )
            if(quiz[i] > 10.0)
                quiz[i] = 0;
        return quiz;
    }
    public double[] labValidation(){//-------------------------------------------validate the lab
        for(int i = 0; i < lab.length; i++ )
            if(lab[i] > 10.0)
                lab[i] = 0;
        return lab;
    }
    public double midtermValidation(){//-----------------------------------------validate the midterm
        if(gradeOfMidterm > 20.0)
            gradeOfMidterm = 0;
        return gradeOfMidterm;
    }
    public double finalValidation(){//-------------------------------------------validate the final
        if(gradeOfFinal > 35.0)
            gradeOfFinal = 0;
        return gradeOfFinal;
    }
    public String toString(){//---------------------------------------------------toString
        quizValidation();
        labValidation();
        midtermValidation();
        finalValidation();
        return "Name: "+ name
                + "\nDate of Birth: " + dateOfBirth.getTime()
                + "\nGrade of Quiz: " + printArray(quiz)
                + "\nGrade of Lab: " + printArray(lab)
                + "\nGrade of Midterm: " + gradeOfMidterm
                + "\nGrade of Final: " + gradeOfFinal
                + "\nOverall: " + getOverall();
    }
    public String toString(Student s){//------------------------------------------overload toString
        return "Name: "+ s.name + "   Overall: " + s.getOverall();
    }
    
}
