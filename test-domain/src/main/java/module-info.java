import be.tomcools.domain.secundaryport.GetStuff;

module be.tomcools.domain {
    exports be.tomcools.domain.primaryport;
    exports be.tomcools.domain.secundaryport;

    uses GetStuff;
    provides be.tomcools.domain.primaryport.ITest with be.tomcools.domain.TestImp;
}