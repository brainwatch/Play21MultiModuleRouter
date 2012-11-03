package controllers;

import play.*;
import play.mvc.*;

import views.html.*;
import cn.bran.play.JapidController;

public class RouterB extends JapidController {
  
  public static Result index() {
    return renderJapid();
  }
  
  public static Result b1() {
    return renderJapid();
  }
  
  public static Result b2() {
    return renderJapid();
  }
  
  public static Result b3() {
    return renderJapid();
  }
}