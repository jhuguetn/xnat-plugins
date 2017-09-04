# COBRAData

## Introduction
COBRAData plugin models & structures MRI-related measurements and derived data to custom XNAT data-types (ImageData assessments) for integrating them in XNAT. Derived data-types have been designed and conceived for covering [COBRA project](http://fp7-cobra.eu/) data needs (WP3 Neuro-imaging).

## Pre-requisites

 * Install Git
 * Install Java JDK
 * Install [Groovy](http://groovy-lang.org/)

## Installation procedure

1. Get the lattest version of the plugin as follows: 
  ```
  git clone https://github.com/jhuguetn/xnat-plugins.git xnat-plugins
  ```

2. Build and deploy the plugin by doing as follows:
  ```
  cd xnat-plugins/COBRAData
  ./gradlew jar
  ```
  Note that a prebuilt version of the plugin is also provided within this repository, skip this step if using them.

3. Copy the .jar plugin file into the XNAT plugins directory, example:
  ```
  cp ./build/libs/COBRAData-plugin-1.0.0.jar /xnat/home/plugins/  
  ```

4. Restart XNAT:
  ```
  sudo service tomcat restart
  ```

## Questions/Comments?

Submit an issue, fork and/or PR. Alternatively, reach me at j.huguet(at)amc.uva.nl

## Credits

* This work has been supported by the European Union’s Seventh Framework Programme for research.
* This plugin was ported from an existing [XNAT 1.6.X module](https://github.com/jhuguetn/xnat-modules/) using [XNAT Module to Plugin Conversion Script](https://bitbucket.org/xnatdev/module_to_plugin).

