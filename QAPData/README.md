# QAPdata

## Introduction
[Quality Assessment Protocol](http://preprocessed-connectomes-project.org/quality-assessment-protocol/) (QAP) is a Python-based package for computing functional and anatomical MRI data quality measures. 

QAPdata plugin models & structures QAP output measurements to custom XNAT data-types (ImageData assessments) for integrating them as an additional extension to XNAT.

More information about the QAP computed metrics/measurements can be found [here] (http://preprocessed-connectomes-project.org/quality-assessment-protocol/#taxonomy-of-qa-measures).

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
  cd xnat-plugins/QAPData
  ./gradlew jar
  ```
  Note that a prebuilt version of the plugin is also provided within this repository, skip this step if using them.

3. Copy the .jar plugin file into the XNAT plugins directory, example:
  ```
  cp ./build/libs/QAPData-plugin-0.4.0.jar /xnat/home/plugins/  
  ```

4. Restart XNAT:
  ```
  sudo service tomcat restart
  ```
  
## Questions/Comments?

Submit an issue, fork and/or PR. Alternatively, reach me at j.huguet(at)amc.uva.nl

## Credits

* This plugin was ported from an existing [XNAT 1.6.X module](https://github.com/jhuguetn/xnat-modules/) using [XNAT Module to Plugin Conversion Script](https://bitbucket.org/xnatdev/module_to_plugin).