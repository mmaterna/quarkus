package pl.marim.quarkus.mp.config;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class ConfigData {
	String message;
	String suffix;
	String name;
}
