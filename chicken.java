//chicken class, the derived class of food


public class chicken extends food{
    protected int type;
    protected int num;
    //Default constructor
    chicken(){
        type=0;
        num=0;
    }
    //Copy constructor
    public chicken(chicken to_copy) {
        ID = to_copy.ID;
        type=to_copy.type;
        num=to_copy.num;
    }
    //add a chicken
    public void read_in()
    {
        System.out.print(
                """
                                    xx\s
                                   / .|>
                                  /(_)_\s
                                 /  (
                        ((____.-'    )
                         ||||         ||
                          ||'-.-.-'`|      \s
                            |______|
                             _|__|_""".indent(2)

        );
        System.out.print("Please enter your phone number ");
        ID = input.nextInt();
        System.out.print("What type do you want?(1 = Honey BBQ, 2 = Hot Buffalo, 3 = Specialty: ");
        type = input.nextInt();
        System.out.print("How many chicken do you want?: ");
        num = input.nextInt();

    }
    public void display()
    {
        String chicken_type;
        //1 = Honey BBQ, 2 = Hot Buffalo, 3 = Specialty:
        if(type == 1)
            chicken_type= "Honey BBQ";
        else if(type == 2)
            chicken_type= "Hot Buffalo";
        else if(type == 3)
            chicken_type= "Specialty";
        else
            chicken_type= "Wrong choose!";
        System.out.print("Client: " + ID
                + "\nChicken : " + chicken_type
                + "\nNumber: " + num);


    }
    public boolean delete(chicken to_delete){
        return false;
    }
}
