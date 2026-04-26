package com.aaryaman.TemperatureConverter;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins="*")
public class TemperatureConverterController {
    private final TemperatureConverterService temperatureConverterService;
    public TemperatureConverterController(TemperatureConverterService temperatureConverterService){
        this.temperatureConverterService = temperatureConverterService;
    }

    //Cel->Fah
    @GetMapping("/celtofah/{c}")
    public String celToFah(@PathVariable double c) {
        return temperatureConverterService.celToFah(c);
    }
    
    //fah->cel
    @GetMapping("/fahtocel/{f}")
    public String fahToCel(@PathVariable double f) {
        return temperatureConverterService.fahToCel(f);
    }
    
    
}
