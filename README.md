# SpringBoot
Content related to SpringBoot for quick access.

For initialisation of SpringBoot project, use https://start.spring.io/

For reference & guide, use https://docs.spring.io/spring-boot/docs/1.4.0.M3/reference/htmlsingle/#using-boot-using-springbootapplication-annotation

Few points to keep in mind. 

* @SpringBootApplication is equivalent to using 3 annotations : @Configuration , @ComponentScan & @EnableAutoConfiguration

* Classes under the package (which consists of main class annotated with @SpringBootApplication) will be autoscanned. 

* Spring IoC Container gets initialised on the line : SpringApplication.run(App.class , args ) ; 

* @Bean vs @Autowired
  * @Bean is for registering your class bean into Spring Application Context. 
  * @Autowired is for getting your class bean from Spring Application Context that was initialised at the time of @Bean.

* JpaRepository extends PagingAndSortingRepository which in turn extends CrudRepository.
  * Their main functions are:
	1. CrudRepository mainly provides CRUD functions.
	2. PagingAndSortingRepository provides methods to do pagination and sorting records.
* JpaRepository provides some JPA-related methods such as flushing the persistence context and deleting records in a batch.