package repository;

import domain.ToDo;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class IToDoRepository implements PanacheRepositoryBase<ToDo,Long> {
}
