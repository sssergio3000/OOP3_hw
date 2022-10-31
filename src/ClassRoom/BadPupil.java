package ClassRoom;

public class BadPupil extends Pupil {
    @Override
    void study() {
        System.out.println("I study very bad...");
    }

    @Override
    void read() {
        System.out.println("I read very poorly");
    }

    @Override
    void write() {
        System.out.println("I write with lots of mistakes");
    }

    @Override
    void relax() {
        System.out.println("I relax always with pleasure");
    }
}
