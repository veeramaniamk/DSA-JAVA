
public class Main {

    public static void main(String[] args) throws Exception {
        Bird a = new Dog();
        a.sound();
    }

}

interface Animal {
    void sound();
}

interface Bird {
    default void sound(int a) {
        System.out.println("Bird sound");
    }
}

class Dog implements Bird, Animal {
    public void sound() {

    }
}


class Singleton {
    private static  Singleton instance;

    private Singleton() {
        System.out.println("Instance created by: " + Thread.currentThread().getName());
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
