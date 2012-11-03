package controllers;

import play.*;
import play.mvc.*;

import views.html.*;
import cn.bran.play.JapidController;

public class RouterC extends JapidController {
  
  public static Result index() {
    return renderJapid();
  }
  
  public static Result c1() {
    return renderJapid();
  }
  
  public static Result c2() {
    return renderJapid();
  }
  
  public static Result c3() {
    return renderJapid();
  }
}