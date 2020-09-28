class Flavor {

    String[] materials;

}

class Juice {

    Flavor flavor;

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

        flavor1.materials = new String[]{"Lemon", "Honey"};
        flavor2.materials = new String[]{"Orange"};
        flavor3.materials = new String[]{"Banana", "Chocolate"};
        flavor4.materials = new String[]{"Apple", "Tomato", "Carrot", "Kale"};
        flavor5.materials = new String[]{""};

        juice1.flavor = flavor1;
        juice2.flavor = flavor2;
        juice3.flavor = flavor3;
        juice4.flavor = flavor4;
        juice5.flavor = flavor5;

        System.out.println("Juice1 Flavor: " + juice1.flavor.materials[0] + ", " + juice1.flavor.materials[1]);
        System.out.println("Juice2 Flavor: " + juice2.flavor.materials[0]);
        System.out.println("Juice3 Flavor: " + juice3.flavor.materials[0] + ", " + juice3.flavor.materials[1]);
        System.out.println("Juice4 Flavor: " + juice4.flavor.materials[0] + ", " + juice4.flavor.materials[1]
        + ", " + juice4.flavor.materials[2] + ", " + juice4.flavor.materials[3]);
        System.out.println("Juice5 Flavor: " + juice5.flavor.materials[0]);

    }
}
