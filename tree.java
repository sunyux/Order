//tree class work for the order data structure,
//every order will be the root of AVL tree

public class tree extends node
{
    node root;
    tree()
    {
        root=null;
    }
    //choose the order function
    public int order_menu(){
        int choose;
        System.out.print("""

                Want do you want in the system?
                1 = Create an Order
                2 = Display all orders
                3 = Search an onder by name
                4 = Delete all orders
                 other number for quit the system""");
        choose = input.nextInt();
        return choose;
    }
    //check the balance
    public int check(int left_tree, int right_tree){
        return Math.max(left_tree, right_tree);
    }
    //get the height of the node
    protected int height(node temp){
        if(temp == null)
            return 0;
        return temp.height;
    }
    //check the tree is balance
    protected int balance(node temp)
    {
        return height(temp.go_left()) - height(temp.go_right());
    }
    //left rotate
    protected node left_rotation(node current){
        node current_right = current.go_right();
        node temp = current_right.go_left();

        current_right.set_right(current);
        temp.set_left(temp);

        current.height = check(height(current.go_left()), height(current.go_right()));
        current_right.height = check(height(current_right.go_left()), height(current_right.go_right()));

        return current_right;
    }
    //right rotate
    protected node right_rotation(node current){
        node current_left = current.go_left();
        node temp = current_left.go_left();

        current_left.set_right(current);
        temp.set_left(temp);

        current.height = check(height(current.go_left()), height(current.go_right()));
        current_left.height = check(height(current_left.go_left()), height(current_left.go_right()));

        return current_left;
    }
    //insert
    public void insert_tree(){
        String name;
        System.out.print("\nPlease enter your name: ");
        name = input.next();
        this.root = insert_tree(this.root, name);
    }
    protected node insert_tree(node add_tree, String name_to_find){
        if(add_tree == null){
            add_tree = new node(name_to_find);
            add_tree.create_item();
            return add_tree;
        }
        int compare = add_tree.name_person.compareToIgnoreCase(name_to_find);
        if(compare<0)
            add_tree.set_left(insert_tree(add_tree.go_left(),name_to_find));
        else if(compare > 0)
            add_tree.set_left(insert_tree(add_tree.go_right(),name_to_find));
        else
            add_tree.create_item();
        add_tree.height = 1 + check(height(add_tree.go_left()), height(add_tree.go_right()));
        int check_balance = balance(add_tree);

        if(check_balance > 1 && add_tree.name_person.compareToIgnoreCase(add_tree.go_left().name_person) < 0)
            return right_rotation(add_tree);
        if(check_balance > 1 && add_tree.name_person.compareToIgnoreCase(add_tree.go_left().name_person) > 0){
            add_tree.set_left(left_rotation(add_tree.go_left()));
            return right_rotation(add_tree);
        }
        if(check_balance < -1 && add_tree.name_person.compareToIgnoreCase(add_tree.go_right().name_person) > 0)
            return left_rotation(add_tree);
        if(check_balance < -1 && add_tree.name_person.compareToIgnoreCase(add_tree.go_right().name_person) < 0){
            add_tree.set_right(right_rotation(add_tree.go_right()));
            return left_rotation(add_tree);
        }

        return add_tree;
    }
    //delete all function
    protected void delete_all(){
        this.root = delete_all(this.root);
    }
    protected node delete_all(node current){
        if(current == null)
            return null;
        current.set_left(delete_all(current.go_left()));
        current.set_right(delete_all(current.go_left()));
        return current;
    }

    //display all tree
    public void display_all(){
        display_all(this.root);
    }
    protected void display_all(node travel)
    {
        if(travel == null){
            return;
        }
        display_all(travel.go_left());
        display_all(travel.go_right());
        travel.display();
    }
    //search an order by name
    protected void search() {

        String name;
        System.out.print("\nPlease enter the name you want to search ");
        name = input.next();
        search(this.root, name);

    }
    protected void search(node current, String name_to_find){
        if(current == null){
            System.out.print("The people is empty");
            return;
        }
        int compare = current.name_person.compareToIgnoreCase(name_to_find);
        if(compare == 0){
            current.display();
            return;
        }
        if(compare > 0)
            search(current.go_left(), name_to_find);
        else
            search(current.go_right(), name_to_find);
    }
}
