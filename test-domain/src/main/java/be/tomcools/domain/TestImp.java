package be.tomcools.domain;

import be.tomcools.domain.primaryport.ITest;
import be.tomcools.domain.secundaryport.GetStuff;

import java.util.ServiceLoader;

public class TestImp implements ITest {

    private GetStuff stuffGetter;

    public TestImp(GetStuff getStuff) {
        this.stuffGetter = getStuff;
    }

    public static TestImp provider() {
        GetStuff stuff = ServiceLoader.load(GetStuff.class)
                .findFirst().get();

        return new TestImp(stuff);
    }

    @Override
    public void test() {
        System.out.println(stuffGetter.getStuff());
    }
}
