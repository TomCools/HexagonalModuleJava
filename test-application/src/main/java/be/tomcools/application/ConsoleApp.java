package be.tomcools.application;

import be.tomcools.domain.primaryport.ITest;

import java.util.ServiceLoader;

public class ConsoleApp {
    public static void main(String[] args) {
        ITest sut = ServiceLoader.load(ITest.class)
                .findFirst().get();

        sut.test();
    }
}
