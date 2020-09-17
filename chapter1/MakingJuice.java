class Flavor {

    String materials;

}

class Juice {

    String flavor;

}

class MakingJuice {
    public static void main(final String[] args) {
        
        Flavor flavor1 = new Flavor();
        Flavor flavor2 = new Flavor();
        Flavor flavor3 = new Flavor();
        Flavor flavor4 = new Flavor();
        Flavor flavor5 = new Flavor();

        Juice juice1 = new Juice();
        Juice juice2 = new Juice();
        Juice juice3 = new Juice();
        Juice juice4 = new Juice();
        Juice juice5 = new Juice();

        flavor1.materials = "[Lemon, Honey]";
        flavor2.materials = "[Orange]";
        flavor3.materials = "[Banana, Chocolate]";
        flavor4.materials = "[Apple, Tomato, Carrot, Kale]";
        flavor5.materials = "[]";

        juice1.flavor = flavor1.materials;
        juice2.flavor = flavor2.materials;
        juice3.flavor = flavor3.materials;
        juice4.flavor = flavor4.materials;
        juice5.flavor = flavor5.materials;

        System.out.println("Juice1 Flavor" + juice1.flavor);
        System.out.println("Juice2 Flavor" + juice2.flavor);
        System.out.println("Juice3 Flavor" + juice3.flavor);
        System.out.println("Juice4 Flavor" + juice4.flavor);
        System.out.println("Juice5 Flavor" + juice5.flavor);

    }
}