package pl.marim.quarkus.mp.health;

import org.eclipse.microprofile.health.Health;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

@Health
public class HealthConfiguration implements HealthCheck {

	@Override
	public HealthCheckResponse call() {
		String name = getApplicationName();
		return HealthCheckResponse
				.named(name)
				.withData("Application state", "OK")
				.up()
				.build();
	}

	private String getApplicationName() {
		String name = "quark example application";
		return name;
	}
}
