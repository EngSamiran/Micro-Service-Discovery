package com.tcg.servicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceDiscoveryApplication.class, args);
	}
	
//	@RestController
//	class ServiceInstanceRestController {
//
//		@Autowired
//		private DiscoveryClient discoveryClient;
//
//		@RequestMapping("/service-instances/{applicationName}")
//		public List<ServiceInstance> serviceInstancesByApplicationName(
//				@PathVariable String applicationName) {
//			return this.discoveryClient.getInstances(applicationName);
//		}

}
