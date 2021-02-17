package com.assignment;

@Configuration
@ComponentScan
public class AppConfig {


 @Bean
public Samsung getPhone() {
 System.out.println(new Samsung());
	return null;
 }
 @Bean
 public MediaTek getProcessor1() {
 System.out.println(new MediaTek());
	return null;

 }
 @Bean
 public SnapDragon getProcessor2() {
	 System.out.println(new SnapDragon());
	return null;
 }

 
}

}
