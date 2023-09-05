package net.youssfi.springpostgresdocker.repositories;

import net.youssfi.springpostgresdocker.entities.Event;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends ListCrudRepository<Event,Long> {
}
