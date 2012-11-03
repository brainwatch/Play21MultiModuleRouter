package controllers;

import play.*;
import play.mvc.*;

import views.html.*;
import cn.bran.play.JapidController;

public class MainApplication extends JapidController {
  
  public static Result index() {
    return renderJapid();
  }
  
  public static Result dashboard() {
    return renderJapid();
  }
}