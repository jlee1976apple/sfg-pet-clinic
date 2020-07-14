package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Person;
import guru.springframework.sfgpetclinic.services.CrudService;

import java.util.Set;

public class PersonServiceMap extends AbstractMapService<Person, Long> implements CrudService<Person, Long> {
    @Override
    public Person findById(Long Id) {
        return super.findById(Id);
    }

    @Override
    public Person save(Person object) {
        return super.save(object);
    }

    @Override
    public Set<Person> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Person object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long Id) {
        super.deleteById(Id);
    }
}
