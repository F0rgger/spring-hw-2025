package org.example.carservice.controller;

import org.example.carservice.config.FuelTypeConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/reference")
@RequiredArgsConstructor
public class ReferenceDataController {

    @Value("${engine-types}")
    private List<String> engineTypes;

    private final FuelTypeConfig fuelTypeConfig;

    @GetMapping("/engine-types")
    public List<String> getEngineTypes() {
        return engineTypes;
    }

    @GetMapping("/fuel-types")
    public Map<String, FuelTypeConfig.FuelType> getFuelTypes() {
        return fuelTypeConfig.getFuelTypes();
    }

    @GetMapping("/fuel-types/{fuelName}")
    public FuelTypeConfig.FuelType getFuelType(@PathVariable String fuelName) {
        return fuelTypeConfig.getFuelTypes().get(fuelName);
    }
}
