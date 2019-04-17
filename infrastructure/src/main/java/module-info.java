module be.tomcools.infrastructure {
    requires be.tomcools.domain;

    provides be.tomcools.domain.secundaryport.GetStuff with be.tomcools.infrastructure.StuffGetterImpl;
}