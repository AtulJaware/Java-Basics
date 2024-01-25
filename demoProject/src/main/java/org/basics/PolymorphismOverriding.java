package org.basics;

class Mobile {
    public void call() {
        System.out.println("Call from mobile");
    }
}

class Oppo extends Mobile {
    @Override
    public void call() {
        System.out.println("Call from oppo");
    }
}

class Vivo extends Mobile {
    @Override
    public void call() {
        System.out.println("Call from vivo");
    }
}

public class PolymorphismOverriding {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile();
        Mobile mobile2 = new Oppo();
        Mobile mobile3 = new Vivo();

        mobile1.call();
        mobile2.call();
        mobile3.call();
    }
}
