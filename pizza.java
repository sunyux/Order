//pizza class, the derived class of food

public class pizza extends food{
    protected int size;
    protected int type;
    protected int num;
    protected int cheese;
    protected int meat;

    //Default constructor
    pizza() {
        size = 0;
        type=0;
        num=0;
        cheese=0;
        meat=0;
    }
    //Copy constructor
    public pizza(pizza to_copy) {
        ID = to_copy.ID;
        size = to_copy.size;
        type=to_copy.type;
        num=to_copy.num;
        cheese=to_copy.cheese;
        meat=to_copy.meat;
    }
    public void read_in() {
        System.out.print("""
                 ____-------------------
                /    |        \s
                  u  u|      _______   \s
                    ) |  .-''#%&#&%#``-.  \s
                   = /  ((%&#&#&%&VK&%&)) \s
                    |    `-._#%&##&%_.-'  \s
                 / | ||`--.   `-.||  __.-'
                 |  |    ||   /`./         \s
                 |||/|  ||  `-'  /
                 || |   ||     /           \s
                """);

        System.out.print("Please enter your phone number \n");
        ID = input.nextInt();
        System.out.print("""
                What type do you want?\s
                 1 = Pacific Veggie
                 2 = Hawaiian
                 3 = Deluxe
                 4 =  MeatZZA
                 5 = Spinach&Feta
                """);
        type = input.nextInt();
        System.out.print("""
                What size fo you want?
                 1 = 10''\s
                 2 = 12''\s
                 3 = 14''\s
                """);
        size = input.nextInt();
        System.out.print("How many pizza do you want?: \n");
        num = input.nextInt();
        System.out.print("""
                 Cheese?:\s
                1 = None;
                2 = Normal;
                3 = Double.
                """);
        cheese = input.nextInt();
        System.out.print("""
                Meat:\s
                1 = Non-meat;
                2 = Beef;
                3 = Chicken;
                4 = Bacon.
                """);
        meat = input.nextInt();
    }
    public void display()
    {
        String pizza_size;
        String pizza_type;
        String cheese_type;
        String meat_type;
        if(size == 1)
            pizza_size = "10''";
        else if(size == 2)
            pizza_size = "12''";
        else if(size==3)
            pizza_size = "14''";
        else
            pizza_size = "Wrong choose";
        // 1 = Pacific Veggie\n" +
        //                " 2 = Hawaiian\n" +
        //                " 3 = Deluxe\n" +
        //                " 4 =  MeatZZA\n" +
        //                " 5 = Spinach&Feta\n")
        if(type == 1)
            pizza_type= "Pacific Veggie";
        else if(type == 2)
            pizza_type= "Hawaiian";
        else if(type == 3)
            pizza_type= "Deluxe";
        else if(type == 4)
            pizza_type= "MeatZZA";
        else if(type == 5)
            pizza_type= "Spinach&Feta";
        else
            pizza_type= "Wrong choose!";
        if(cheese == 1)
            cheese_type= "None";
        else if(cheese == 2)
            cheese_type= "Normal";
        else if(cheese == 3)
            cheese_type= "Double";
        else
            cheese_type= "Wrong choose!";
        // "1 = Non-meat;\n" +
        //                "2 = Beef;\n" +
        //                "3 = Chicken;\n" +
        //                "4 = Bacon.\n")
        if(meat == 1)
            meat_type= "None";
        else if(meat == 2)
            meat_type= "Beef";
        else if(meat == 3)
            meat_type= "Chicken";
        else if(meat == 4)
            meat_type= "Bacon";
        else
            meat_type= "Wrong choose!";
        System.out.print("Client: " + ID
                + "\nPizza : " + pizza_type
                + "\nSize" + pizza_size
                + "\nCheese" + cheese_type
                + "\nMeat" + meat_type
                + "\nNumber: " + num);


    }
    public boolean delete(pizza to_delete){
        return false;
    }
}
