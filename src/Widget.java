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

    public static void main(String[] args) {
        Widget w = new Widget("waffle", 123, .75);
        System.out.println(w);
    }
}
