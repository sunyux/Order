
//drink class, the derived class of food
public class drink extends food{
    protected int size;
    protected int type;
    protected int num;
    //Default constructor
    drink() {
        size = 0;
        type=0;
        num=0;
    }
    //Copy constructor
    public drink(drink to_copy) {
        ID = to_copy.ID;
        size = to_copy.size;
        type=to_copy.type;
        num=to_copy.num;
    }
    public void read_in()
    {
        System.out.print("""
                               //
                                       //
                                      //
                                     //
                              _______||
                         ,-'''       ||`-.
                        (            ||   )
                        |`-..._______,..-'|
                        |            ||   |
                        |     _______||   |
                        |,-'''_ _  ~ ||`-.|
                        |  ~    - - ,|| ~ |
                        |`-..._______,..-'|
                        |    `-/_    ||  ~|
                        | -'  ~~     || -.|
                        (   ~      ~   ~~ )
                         `-..._______,..-'
                """

        );
        System.out.print("Please enter your phone number ");
        ID = input.nextInt();
        System.out.print("What type do you want?(1 = Pepsi, 2 = Sprite, 3 = Coca Cola, 4 = Ice tea: ");
        type = input.nextInt();
        System.out.print("What size fo you want?(1 = Small, 2 = Medium, 3 = Large: ");
        size = input.nextInt();
        System.out.print("How many drink do you want?: ");
        num = input.nextInt();

    }
    public void display()
    {
        String drink_size;
        String drink_type;
        if(size == 1)
            drink_size = "Small";
        else if(size == 2)
            drink_size = "Medium";
        else if(size==3)
            drink_size = "Large";
        else
            drink_size= "Wrong choose!";
        //1 = Pepsi, 2 = Sprite, 3 = Coca Cola, 4 = Ice tea
        if(type == 1)
            drink_type= "Pepsi";
        else if(type == 2)
            drink_type= "Sprite";
        else if(type == 3)
            drink_type= "Coca Cola";
        else if(type == 4)
            drink_type= "Ice tea";
        else
            drink_type= "Wrong choose!";
        System.out.print("Client: " + ID
                + "\nDrink : " + drink_type
                + "\nSize" + drink_size
                + "\nNumber: " + num);


    }
    public boolean delete(drink to_delete){
        return false;
    }
}
