//main function
//run the system

public class main extends UserInterface {


    public static void main(String[] args) {

        tree a_tree = new tree();
        do {
            switch (a_tree.order_menu()) {
                case 1 -> a_tree.insert_tree();
                case 2 -> a_tree.display_all();
                case 3 -> a_tree.search();
                case 4 -> a_tree.delete_all();
            }
        }while(a_tree.again());
    }
}