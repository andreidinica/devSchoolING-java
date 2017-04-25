package ro.isr.devschool.designpatterns.behavioral.observer;

import java.util.*;

/**
 * Created by Andrei on 13.04.2017.
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: "+ Integer.toOctalString(subject.getStatte()));
    }
}