//package com.hellokoding.springboot;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;
//import org.thymeleaf.spring4.SpringTemplateEngine;
//import org.thymeleaf.spring4.view.ThymeleafViewResolver;
//import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
//
//@Configuration
//public class ThymeLeafConfigs {
//	
//	@Bean 
//    public ServletContextTemplateResolver templateResolver() {
//        ServletContextTemplateResolver resolver = new ServletContextTemplateResolver();
//        resolver.setPrefix("/templates/");
//        resolver.setSuffix("html");
//        resolver.setTemplateMode("HTML5");
//        resolver.setOrder(1);
//        return resolver;
//    }
//	
//	
//	@Bean
//    public static PropertySourcesPlaceholderConfigurer properties() {
//        PropertySourcesPlaceholderConfigurer propertySources = new PropertySourcesPlaceholderConfigurer();
//        Resource[] resources = new ClassPathResource[] { 
//                new ClassPathResource("spring.properties") };
//        propertySources.setLocations(resources);
//        propertySources.setIgnoreUnresolvablePlaceholders(true);
//        return propertySources;
//    }
//	
//
//    @Bean 
//    public SpringTemplateEngine templateEngine() {
//        SpringTemplateEngine engine = new SpringTemplateEngine();
//        engine.setTemplateResolver(templateResolver());
//
////        //add spring security dialect
////        Set<IDialect> dialects = new HashSet<IDialect>();
////        dialects.add(springSecurityDialect());
////        engine.setAdditionalDialects(dialects);
//
//        return engine;
//    }
//
//    @Bean 
//    public ThymeleafViewResolver thymeleafViewResolver() {
//        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
//        resolver.setTemplateEngine(templateEngine());
//        return resolver;
//    }
//
////    @Bean
////    public SpringSecurityDialect springSecurityDialect() {
////        return new SpringSecurityDialect();
////    }
//
//}
