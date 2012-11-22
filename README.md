# Play 2.1 - Multi Module Router demo

## Installing

You first need to publish the router modules in the following order:

```bash
$ cd routerc/
$ play publish-local
$ cd routerb/
$ play publish-local
$ cd routera/
$ play publish-local
```

## Getting started

Run the router module which depends on routera which depends on router b which depends on routerc:

```bash
$ cd router
$ play run
```

Following is the final routes definition constructed by play:

```bash
# Routes
# This file defines all application routes (Higher priority routes first)
# ~~~~

# Home page
GET     /                           controllers.MainApplication.index()
GET     /dash                       controllers.MainApplication.dashboard()

GET     /                       	controllers.RouterA.index()
GET     /a1                       	controllers.RouterA.index()
GET     /a2                       	controllers.RouterA.index()
GET     /a3                       	controllers.RouterA.index()
GET     /b                       	controllers.RouterB.index()
GET     /b/b1                       controllers.RouterB.index()
GET     /b/b2                       controllers.RouterB.index()
GET     /b/b3                       controllers.RouterB.index()
GET     /b/c                       	controllers.RouterC.index()
GET     /b/c1                       controllers.RouterC.index()
GET     /b/c2                       controllers.RouterC.index()
GET     /b/c3                       controllers.RouterC.index()

# Map static resources from the /public folder to the /assets URL path
GET     /assets/*file               controllers.Assets.at(path="/public", file)
```

##NOTE
JapidViews cannot be bundled inside the published modules itself. Currently the JapidViews should be copied to the main application's japidroot or inside the main source base and that path needs to be provided in the Global.java  