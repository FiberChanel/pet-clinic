package work.kirill.petclinic.services;

import work.kirill.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById( Long id );

    Vet save( Vet owner );

    Set<Vet> findAll( );
}
