package deco;

import boissons.Boisson;

public class Caramel extends DecorateurBoisson{
    @Override
    public String getDescription() {
        return boisson.getDescription()+" Au Caramel";
    }

    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 1.6+boisson.cout();
    }
}
