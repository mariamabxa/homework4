package ge.ibsu.demo.controllers;

import ge.ibsu.demo.entities.City;
import ge.ibsu.demo.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/city")
public class AddressController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = {"application/json"})
    public List<City> getAll() {
        return cityService.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = {"application/json"})
    public City getById(@PathVariable Long id) throws Exception {
        return cityService.getById(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = {"application/json"})
    public City add(@RequestBody AddCity addCity) throws Exception {
        GeneralUtil.checkRequiredProperties(addCity, Arrays.asList("city"));
        return cityService.add(addCity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = {"application/json"})
    public City edit(@PathVariable Long id, @RequestBody AddCity addCity) throws Exception {
        GeneralUtil.checkRequiredProperties(addCity, Arrays.asList("city",));
        return cityService.edit(id, addCity);
    }
}
