package com.example.demo.structural.composite;

public class CompositeDemo {
    public static void main(String[] args) {
        Menu root = new Menu("//transfer", "transfer money");
        root.add(new MenuItem("//cardToCard", "card to card"))
                .add(new MenuItem("//account", "by account number"));
        Menu subMenu = new Menu("//i-ban", "by i-ban");
        subMenu.add(new MenuItem("//Satna", "by satna"));
        subMenu.add(new MenuItem("//Paya", "by paya"));
        root.add(subMenu);
        System.out.println(root.toString());


    }
}
