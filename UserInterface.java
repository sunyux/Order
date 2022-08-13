import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class UserInterface {

    final String OS;
    protected Scanner input;
    protected String file_name;
    protected int check_again;

//for the printf
    public UserInterface()
    {
        OS = System.getProperty("os.name");
        input = new Scanner(System.in);
    }
    //choose the food type
    public int choose_menu(){
        System.out.print("""
                List of items to pick from:
                (1) Pizza
                (2) Chicken
                (3) Drink
                 Choice (1-3) :\s""");
        int choice = input.nextInt();
        input.nextLine();
        return choice;
    }
    //make sure to delete
    public boolean ask_delete(){
        int choose;
        System.out.print("\nYou really want to delete it? 1=Yes, 2=No ");
        choose = input.nextInt();
        return choose == 1;
    }
    //ask the user about order
    protected boolean again(){
        System.out.print("\nWould you want to quit the system, 0 for quit, other number for leave: ");
        check_again = input.nextInt();
        return check_again != 0;
    }
    //ask the user about food
    protected boolean item_again(){
        System.out.print("\nWould you want to add a new item, 0 for quit, other number for leave: ");
        check_again = input.nextInt();
        return check_again != 0;
    }
    //get the file name
    public String get_file_name(){
        System.out.print("Please input the name of the file (Like Yuxin.txt ): ");
        input.nextLine();
        String file_name;
        file_name = input.next();
        return file_name;
    }
    //write to the file
    public void write_to_file(food to_write, String name) throws IOException {


        if(file_name == null) {
            file_name = get_file_name();
            System.out.print("Created:" + file_name + "\n");
            File myObj = new File(file_name);
        }
        PrintWriter out = new PrintWriter(file_name);
        out.print(name + "|"
                + to_write. ID + "|");

        if(to_write instanceof chicken new_chicken){
            out.print("chicken |"
                    + new_chicken.type + "|"
                    + new_chicken.num + "|");
        }
        else if(to_write instanceof pizza new_pizza){
            out.print("pizza |;"
                    + new_pizza.size + "|"
                    + new_pizza.type+ "|"
                    + new_pizza.cheese + "|"
                    + new_pizza.meat + "|"
                    + new_pizza.num + "|");
        }

        else if(to_write instanceof drink new_drink){
            out.print("drink "
                      +new_drink.type+"|"
                      +new_drink.size+"|"
                      +new_drink.num+"|"
            );
        }


        out.close();
        System.out.print("File closed\n");

    }
}
