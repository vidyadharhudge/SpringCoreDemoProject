package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

    @Autowired // we need tyre then it go xml file and give instance of tyre
    private Tyre tyre;//we have to use properties in xml file but its optional that's why we use autowired

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public void drive(){
        System.out.println("car "+tyre); //to string method la call karel Tyre class chya
    }
}
