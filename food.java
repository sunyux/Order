//food class
//base class of the order system


// Abstract base class --food
//give the interface of the derived class
abstract class food extends UserInterface{

    protected int ID = 0;
    protected food next;
    protected food previous;

    //Default constructor
    food() {
        next = null;
        previous = null;
    }
    public abstract void read_in();

    public food set_next(food current) {
        this.next = current;
        return this.next;
    }

    public food set_previous(food current) {
        this.previous = current;
        return this.previous;
    }

    public food get_next() {
        return this.next;
    }

    public food get_previous() {
        return this.previous;
    }

    //Display
    protected abstract void display();
}
