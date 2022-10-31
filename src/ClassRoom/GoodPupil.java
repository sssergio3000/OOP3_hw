package ClassRoom;

public class GoodPupil extends Pupil {
    @Override
    void study() {
        System.out.println("I study properly");
    }

    @Override
    void read() {
        System.out.println("I read not too much");
    }

    @Override
    void write() {
        System.out.println("I write almost without mistakes");
    }

    @Override
    void relax() {
        System.out.println("I relax from time to time");
    }
}
