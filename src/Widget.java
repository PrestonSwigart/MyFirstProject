/**
 * widget
 * @author PrestonSwigart
 * @version 9.15.22
 * taken from mr. cochran
 */
public class Widget {
    private String name;
    private int ID;
    private double cost;

    /**
     * Default constructor for class widget
     */
    public Widget() {
        name = new String();
        ID = 0;
        cost = 0;
    }

    /**
     * Parameterized constructor for class Widget
     * @param n A string for the name value
     * @param i An int for the ID value
     * @param c A double for the cost value
     */
    public Widget(String n, int i, double c)    {
        name = n;
        ID = i;
        cost = c;
    }

    public String toString()    {
        return name + "\t" + ID + "\t$" + cost;
    }
    /**
     * Main method for class Widget
     * @param args Command-line arguments if needed
     */
    public static void main(String[] args) {
        for(int i =0; i < args.length; i++)
            System.out.println(args[i]);
        Widget w = new Widget("waffle", 123, .75);
        Widget myBad = new Widget();
        System.out.println(w);
        System.out.println(myBad);
    }
}
