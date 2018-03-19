# Create React VR Scala App
Create [React VR](https://facebook.github.io/react-vr/) apps in [Scala](https://scala-lang.org/) (via [Slinky](https://github.com/shadaj/slinky)) with no build configuration

## Quick Overview
Make sure you have SBT and NPM installed.

```sh
sbt new shadaj/create-react-vr-scala-app.g8
... follow instructions to create your app

cd my-app/
# in one tab
sbt "~fastOptJS"

# in another tab
npm install
npm start
```

As soon as you start, React VR will launch a development server that bundles and serves your app. If you open the link printed to the console, you should see your VR app.

When you're ready to package a production app, create a minified bundle with `sbt fullOptJS`, modify `index.vr.js` to use the `-fullopt.js` file and follow the [React VR Instructions](https://facebook.github.io/react-vr/docs/publishing.html).

### Get Started Immediately
You **don’t** need to install or configure tools like Metro or Babel.
They are preconfigured and hidden so that you can focus on the code.

Just create a project, and you’re good to go.

## Getting Started
### Installation
To use create-react-vr-scala-app, you'll need SBT, which is the primary build tool, and NPM, which is used to pull in JavaScript dependencies and run the React VR CLI.

**You’ll need to have Node >= 6 on your machine.** You can use [nvm](https://github.com/creationix/nvm#installation) to easily switch Node versions between different projects.

**This tool doesn’t assume a Node backend.** The Node installation is only required for Create React VR App itself.

### Creating an App
To create a new app, run: `sbt new shadaj/create-react-vr-scala-app.g8`, follow the instructions that follow, then `cd my-app`.

This will create a folder `my-app` inside the current folder.
Inside that directory, it will generate the initial project structure:
```
my-app
├── build.sbt
├── index.vr.js
├── fastopt-noparse.js
├── rn-cli.config.js
├── package.json
├── .gitignore
├── project
│   └── build.properties
│   └── plugins.sbt
├── vr
|   └── ...
└── src
    └── main
        └── scala
            └── hello/world
                └── App.scala
                └── Main.scala
```

No configuration or complicated folder structures, just the files you need to build your app.
Once the installation is done, you can run some commands inside the project folder:

### `sbt "~fastOptJS"`
Runs the app in development mode with hot-reloading enabled.

Run `npm start` to see your app

The app will automatically reload if you make changes to the code (and hot-reloading is [enabled](https://facebook.github.io/react-vr/docs/dev-tools.html#hot-reloading)). You will see compilation errors in your console.

### `sbt fullOptJS`
Builds the app for production. It optimizes the build for the best performance and minifies the build using Google Closure Compiler.

After building your Scala.js code, edit `index.vr.js` to point to the new `-fastopt.js` file. Then follow the [React VR instructions](https://facebook.github.io/react-vr/docs/publishing.html) to build your app.

Your app is ready to be deployed.

## Philosophy
+ Compatibility: You can use tools from both the Scala and JavaScript ecosystems and integrate them into your build setup. Your project starts with an SBT configuration for handling compilation and dependencies, but also integrates with NPM to load JavaScript dependencies.
+ No Configuration Required: You don't need to configure anything. Reasonably good configuration of both development and production builds is handled for you so you can focus on writing code.
+ No Lock-In: Your generated project is free of any dependencies specific to create-react-vr-scala-app. You can start customizing the build configuration anytime without even needing an "eject" command!

## What’s Inside?
The generated project uses the following tools and libraries:
+ [SBT](http://www.scala-sbt.org/) to compile Scala sources and [NPM](https://www.npmjs.com/) to resolve JavaScript package dependencies
+ React VR interface and hot reloading: [Slinky](https://github.com/shadaj/slinky)

## Why Use This?
With create-react-vr-scala-app you can quickly bootstrap a new application using Scala and React VR. Your environment will have everything you need to build a new Scala app:
+ A familiar API for writing React VR code in Scala, with support for hot reloading components.
+ A dev server that automatically compiles your Scala code to JavaScript.
+ A build script to bundle your code into an optimized package ready for deployment.

## Acknowledgements
`create-react-vr-scala-app` is based on Facebook's [Create React App](https://github.com/facebookincubator/create-react-app) and JetBrains' [Create React Kotlin App](https://github.com/JetBrains/create-react-kotlin-app).
