import java.util.Scanner;

public class test {
    public static void main(String[] args) throws Exception {
        Scanner scanf = new Scanner(System.in);

        int menu = 0, ctrl = 0;
        
        do{
            System.out.println("=====================================");
            System.out.println("\t\t Menu\n");
            System.out.println("\t1 - Input Values");
            System.out.println("\t2 - Option 2");
            System.out.println("\t3 - Option 3");
            System.out.println("\t4 - Option 4");
            System.out.println("\t5 - Exit");
            System.out.println("=====================================");
            System.out.print("Choice: ");
            menu =  scanf.nextInt(); scanf.nextLine();
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            //System.out.print("\033[H\033[2J");
    
            if(menu == 1){
                //code
                ctrl+=1;
            }
            else if(menu >= 2 && menu <= 4 && ctrl != 0){
                if(menu == 2){
                    //code
                }
                else if(menu == 3){
                    //code
                }
                else if(menu == 4){
                    //code
                }
            }
            else if(menu >= 2 && menu <= 4 && ctrl == 0){
                System.out.println("--[Please input Values first]--\n");
            }
            else if(menu == 5){
                System.out.println("--[Program Terminates]--\n");
                System.exit(0);
            }
            else{
                System.out.println("--[Invalid Input]--\n");
                System.exit(0);
            }
        }while(menu != 5);
        
        scanf.close();
    }
}