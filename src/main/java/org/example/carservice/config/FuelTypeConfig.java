package org.example.carservice.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.List;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "fuel-types")
public class FuelTypeConfig {
    private Map<String, FuelType> fuelTypes;

    @Getter
    @Setter
    public static class FuelType {
        private List<String> options;
    }
}
