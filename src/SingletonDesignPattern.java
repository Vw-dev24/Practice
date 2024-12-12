public class SingletonDesignPattern {
    static SingletonDesignPattern sgp= new SingletonDesignPattern();
    SingletonDesignPattern(){

    }
    public static SingletonDesignPattern getInstance(){

        return sgp;
    }

}
