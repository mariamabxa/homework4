package ge.ibsu.demo.services;

import ge.ibsu.demo.entities.Address;
import ge.ibsu.demo.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<City> getAll() {
        return cityRepository.findAll();
    }

    public City getById(Long id) throws Exception {
        return cityRepository.findById(id).orElseThrow(() -> new Exception("RECORD_NOT_FOUND"));
    }

    @Transactional
    public City add(AddCity addCity) throws Exception {
        City city = new City();
        GeneralUtil.getCopyOf(addCity, City);

        return cityRepository.save(city);
    }

    @Transactional
    public City edit(Long id, AddCity addCity) throws Exception {
        City city = getCityById(id);
        city.setLastUpdate(new Date());
        GeneralUtil.getCopyOf(addCity, city);
        return cityRepository.save(customer);
    }

    public Customer getCityById(Long id) throws Exception {
        return cityRepository.findById(id).orElseThrow(() ->  new Exception("RECORD_NOT_FOUND"));
    }
}
