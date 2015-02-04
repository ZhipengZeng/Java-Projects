/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_final;
import java.util.Scanner;
/**
 *
 * @author zzp
 */
public class Assignment_Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean err = false;
        System.out.println("--- Final Student System ---\n");
        Scanner input = new Scanner(System.in);
        System.out.print("javaClass size: ");// to set the size of javaClass
        int size = input.nextInt();
        Student[] javaClass = new Student[size];
        int i =0;// do-while loop, to loop the whole system
        do{
            menu();
            int choice = input.nextInt();
            if(choice == 1){// to add a student
                if(i < size){// to guarantee the user can not add more students beyond the size
                    javaClass[i] = new Student();
                    System.out.println("Operation successfully completed");
                    i++;
                }
                else
                    System.err.println("Full class!");
            }
            else if(choice == 2){// to display a student's all information
                if(i == 0)
                    System.err.println("No Students! Please add students first");
                else{
                    System.out.print("Student ID: ");
                    int id = input.nextInt();
                    if(id > size)// to guarantee the id is included in the class
                        System.err.println("Invalid ID!");
                    else{
                        if(javaClass[id-1] == null)// the student may have been removed or may not be added
                            System.err.println("The student does not exist!");
                        else{
                            System.out.println(javaClass[id-1].toString());
                            System.out.println("Operation successfully completed");
                        }
                    }
                }
            }
            else if(choice == 3){// to remove a student
                if(i == 0)
                    System.err.println("No Students! Please add students first");
                else{
                    System.out.print("Student ID: ");
                    int id = input.nextInt();
                    if(javaClass[id-1] == null)// the student may have been removed or may not be added
                        System.err.println("The student does not exist!");
                    else{
                        javaClass[id-1] = null;
                        System.out.println("Operation successfully completed");
                    }
                }
            }
            else if(choice == 4){// to display all students' information
                if(i == 0)
                    System.err.println("No Students! Please add students first");
                else{
                    for(int k =1; k <= size; k++){
                        if(javaClass[k-1] != null){
                            System.out.println("[" + k + "]" + javaClass[k-1].toString(javaClass[k-1]));
                            System.out.println("Operation successfully completed");
                        }
                    }
                }
            }
            else if(choice == 0){// to exit the system (the loop)
                System.out.println("Thanks for using my system");
                System.out.println("--- Final Student System ---\n");
                break;
            }
            else{// in case of wrong input
                System.err.println("--- Invalid Option! ---");
                err = true;
            }
        }while(err == true || backToMenu() == true);
        
    }
    public static void menu(){
        System.out.println("\nPlease choose your option ------ [0-4]");
        System.out.println("    [1]------Add a new student");
        System.out.println("    [2]------Display a student information");
        System.out.println("    [3]------Remove a student");
        System.out.println("    [4]------Display all students' information");
        System.out.println("    [0]------Exit");
        System.out.print("\nChoose: ");
    }
    public static boolean backToMenu(){
        boolean back;
        Scanner input = new Scanner(System.in);
        System.out.println("Back to menu? ------ [1]Yes   [0]No");
        System.out.print("Choose: ");
                int choice = input.nextInt();
                if(choice == 1)
                    back = true;
                else
                    back = false;
        return back;
    }
    
}
