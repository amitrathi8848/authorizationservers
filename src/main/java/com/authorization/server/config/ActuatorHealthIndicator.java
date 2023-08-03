package com.authorization.server.config;

import org.springframework.boot.actuate.health.Health;

//@Component
public class ActuatorHealthIndicator /* implements HealthIndicator { */
// @Override
{
	public Health health() {
		int errorCode = check(); // perform some specific health check
		if (errorCode != 0) {
			return Health.down().withDetail("Error Code", errorCode).build();
		}
		return Health.up().build();
	}

	public int check() {
		// Our logic to check health
		return 0;
	}

}
