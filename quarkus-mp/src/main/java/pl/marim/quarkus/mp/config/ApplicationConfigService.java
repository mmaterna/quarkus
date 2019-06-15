package pl.marim.quarkus.mp.config;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ApplicationScoped
public class ApplicationConfigService {
	
	@Inject
	@ConfigProperty(name = "greeting.message")
	String message;

	@Inject
	@ConfigProperty(name = "greeting.suffix", defaultValue = "!")
	String suffix;

	@Inject
	@ConfigProperty(name = "greeting.name")
	String name;

	
	public String printConfig() {
		ConfigData currentConfig = getCurrentConfig();
		log.info("Current config: {}", currentConfig);
		return currentConfig.toString();
	}
	
	public ConfigData getCurrentConfig() {
		return ConfigData.builder()
				.message(message)
				.suffix(suffix)
				.name(name)
				.build();
	}
}
