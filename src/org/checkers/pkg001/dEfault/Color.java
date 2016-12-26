package org.checkers.pkg001.dEfault;

//BAD_EQ Example

public class Color {

	String name;
    public Color(String n) {
        name = n;
    }

    public boolean equals(Object o) {
        Color other = (Color)o;
        return(other.name.equals(this.name));
    }

    public static void main(String [] args ) {
        Color red = new Color("red");
        Color blue = new Color("blue");
        Color red_two = new Color("red");

        // A structural equality check in the minority, use_struct_eq
        if(red == red_two) {
            System.out.println("They're the same reference");
        }

        // A structural equality check, struct_eq_use
        if(red.equals(red_two)) {
            System.out.println("They're the same structure");
        }

        // A structural equality check, struct_eq_use
        if(red.equals(red_two)) {
            System.out.println("They're the same structure");
        }

        // A structural equality check, struct_eq_use
        if(red.equals(red_two)) {
            System.out.println("They're the same structure");
        }

        // A structural equality check, struct_eq_use
        if(red.equals(red_two)) {
            System.out.println("They're the same structure");
        }

        // A structural equality check, struct_eq_use
        if(red.equals(red_two)) {
            System.out.println("They're the same structure");
        }

        if(red.equals(red_two)) {
            System.out.println("They're the same structure");
        }

        if(red.equals(red_two)) {
            System.out.println("They're the same structure");
        }
    }
}
