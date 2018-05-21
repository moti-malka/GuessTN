package guessthenumbers.spring;

import org.springframework.data.repository.CrudRepository;

public interface GameRepository extends CrudRepository<Games, Long> {
}
