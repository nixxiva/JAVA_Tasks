public class Task16 {

    public static void main(String[] args) {
        Gorilla g1 = new Gorilla();
        g1.feed(true);
        g1.groom();
        g1.pet();
    }
}

class Gorilla implements Animal{

    public boolean feed(boolean timeToEat){
        if(timeToEat){
            System.out.println("Put Gorilla food into cage");
            return true;
        }
        else return false;
    }

    public void groom(){
        System.out.println("lather, rinse, repeat");
    }

    public void pet(){
        System.out.println("Pet at your own risk");
    }

}

interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}
