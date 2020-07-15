package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.services.PetTypeService;
import guru.springframework.sfgpetclinic.model.PetType;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService{
    @Override
    public PetType findById(Long Id) {
        return super.findById(Id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long Id) {
        super.deleteById(Id);
    }
}
