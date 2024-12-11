package org.example;

import boissons.Boisson;
import boissons.Espresso;
import boissons.Sumatra;
import deco.Chocolat;
import deco.Noisette;

public class Main {
    public static void main(String[] args) {
        Boisson boisson;
        boisson = new Sumatra();
        boisson = new Chocolat(boisson);
        System.out.println(boisson.cout());
        System.out.println(boisson.getDescription());
        boisson=new Chocolat(boisson);
        System.out.println(boisson.cout());
        System.out.println(boisson.getDescription());
        boisson=new Noisette(boisson);
        System.out.println(boisson.cout());
        System.out.println(boisson.getDescription());
        boisson=new Chocolat(boisson);
        System.out.println(boisson.cout());
        System.out.println(boisson.getDescription());

    }
}