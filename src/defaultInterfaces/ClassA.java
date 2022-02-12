package defaultInterfaces;

public abstract class ClassA extends ClassAB{
    @Override
    public void wake() {
        System.out.println("i am awake");
    }
    public abstract void play();
}
