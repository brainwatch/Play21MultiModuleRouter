package controllers;

import play.*;
import play.mvc.*;

import views.html.*;
import cn.bran.play.JapidController;

public class RouterA extends JapidController {
  
  public static Result index() {
    return renderJapid();
  }
  
  public static Result a1() {
    return renderJapid();
  }
  
  public static Result a2() {
    return renderJapid();
  }
  
  public static Result a3() {
    return renderJapid();
  }
  
}