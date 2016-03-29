package edu.info498.review;

public class Husky extends Dog implements Huggable {

    public Husky(String name) {
        super(name, "Husky");
    }

    public void pullSled() {

    }

    public void bark() {
        System.out.println("says: Woof!");
    }

    public void hug() {

    }

}