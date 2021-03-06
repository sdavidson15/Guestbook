package com.example.guestbook;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;

import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;

public class OfyHelper implements ServletContextListener
{
  public void contextInitialized(ServletContextEvent event)
  {
    ObjectifyService.register(Guestbook.class);
    ObjectifyService.register(Greeting.class);
  }

  public void contextDestroyed(ServletContextEvent event)
  {
    // App Engine does not currently invoke this method.
  }
}
