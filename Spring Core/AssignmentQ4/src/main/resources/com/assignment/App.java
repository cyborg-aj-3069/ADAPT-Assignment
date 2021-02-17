package com.assignment;

public class App {

	public static void main( String[] args )
    {
        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung s7= (Samsung)context.getBean(Samsung.class);
        s7.config();
    }

}
