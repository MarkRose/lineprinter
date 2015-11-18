package ca.markrose.lineprinter.jorge;

/**
 * Created by jorge on 2015-11-17.
 */
public class JorgeTry {
}

interface Car {
    void start();
    void stop();
}

abstract class A implements Car {
    @Override
    public void start() {
        this.stop();
    }

    @Override
    public void stop() {

    }
}


interface I {

}

class B extends A implements I {
    @Override
    public void start() {
        super.start();

    }

    @Override
    public void stop() {

    }
}

