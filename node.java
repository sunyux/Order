import java.io.IOException;
//node class
//work for the item , the item will be a node in a LLL
public class node  extends UserInterface{
    protected food head;
    protected food tail;
    protected node right_root;
    protected node left_root;
    protected String name_person;
    protected int count;
    protected int height = 1;
    node()
    {
        head=null;
        tail=null;
        right_root=null;
        left_root=null;
    }
    public node(String name_to_add)
    {
        head=null;
        tail=null;
        right_root=null;
        left_root=null;
        name_person = name_to_add;
    }
    //choose the type of the food
    public food choose_type(int choose)
    {
        food item;
        if(choose == 1)
            item = new pizza();
        else if(choose == 2)
            item = new chicken();
        else
            item = new drink();
        return item;
    }

    node go_right()
    {
        return this.right_root;
    }
    node go_left()
    {
        return this.left_root;
    }
    //create a item
    public void create_item(){
        do {
            int choose = choose_menu();
            food new_item = choose_type(choose);
            new_item.read_in();
            insert(new_item);
        }while(item_again());
    }
    //insert in the LLL for the create item function
    protected void insert(food to_add) {
        if (head == null) {
            head = to_add;
            tail = head;
        } else {
            to_add.set_next(head);
            head = to_add;
        }
        ++count;
       try {
            write_to_file(to_add, name_person);
        } catch (IOException error) {
            System.err.println(error);
            System.out.print("File not present...\n");
        }
    }
    //display a item
        public void display()
       {
            if(head == null)
                System.out.println("You don't have order!");
            System.out.print("Name: " + name_person );
            display(this.head);
        }
        public void display(food current){
            if(current == null)
                return;
            current.display();
            display(current.get_next());
        }
        public void display_current(food current) {
            if (current == null)
                return;
            current.display();
        }
        //delete a item
    public void delete(){
        if(this.head == null)
            return;
        delete(this.head);
    }
    protected void delete(food current){

        display_current(current);
        if(current == null) {
            System.out.print("Returning now");
            return;
        }
        if(ask_delete()) {
            if (current == this.head) {
                if (head.get_next() != null) {
                    head = head.get_next();
                } else {
                    head = null;
                }
            } else {
                return;
            }
            --count;
            delete(current.get_next());
        }
    }
    //set the current right node
    protected void set_right(node current){
        this.right_root = current;
    }
    //set the current left node
    protected void set_left(node current){
        this.left_root = current;
    }




}

