package com.toread.core.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.*;


/**
 * Created by Administrator on 14-1-12.
 */
public class AppInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext webApplicationContext = getAnnotationConfigWebApplicationContext(servletContext);
        springMvcDispaatcherServlet(servletContext, webApplicationContext);
        addLoger4jListener(servletContext);
    }

    private void addLoger4jListener(ServletContext servletContext) {
        servletContext.addListener("org.springframework.web.util.Log4jConfigListener");
        servletContext.setAttribute("log4jConfigLocation","/WEB-INF/classes/log4j.properties");
    }

    private AnnotationConfigWebApplicationContext getAnnotationConfigWebApplicationContext(ServletContext servletContext) {
        AnnotationConfigWebApplicationContext webApplicationContext =  new AnnotationConfigWebApplicationContext();
        webApplicationContext.register(ApplicationConfig.class);
        servletContext.addListener(new ContextLoaderListener(webApplicationContext));
        return webApplicationContext;
    }

    private void springMvcDispaatcherServlet(ServletContext servletContext, AnnotationConfigWebApplicationContext webApplicationContext) {
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("DispatcherServlet", new DispatcherServlet(webApplicationContext));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }
}
