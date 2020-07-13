package guru.springframework.sfgpetclinic.services;

import java.util.Set;

public interface CrudService<T,ID> {
    T findById(ID Id);

    T save(T object);

    Set<T> findAll();

    void delete(T object);

    void deleteById(ID Id);
}
