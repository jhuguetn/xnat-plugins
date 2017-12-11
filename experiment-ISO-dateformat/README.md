# XNAT Experiment International Date Format Plugin

## Introduction 
The XNAT Experiment International Date Format (ISO) Plugin is actually a tiny modification on velocity scripts to display the distinct Experiment pages with fields 'Experiment Date' and 'Date Added' in ISO format, instead of originary MDY date format. The rationale of that modification is to avoid interpretation errors in countries not following the MDY data format. See [here](https://www.w3.org/QA/Tips/iso-date) and [here](https://en.wikipedia.org/wiki/Date_format_by_country) for more contextual info. 

## Pre-requisites

 * Git
 * Java JDK
 
## Building and installing the plugin

1. Get the lattest version of the plugin as follows: 
  ```
  git clone https://github.com/jhuguetn/xnat-plugins.git xnat-plugins
  ```

2. Build and deploy the plugin by doing as follows:
  ```
  cd xnat-plugins/experiment-ISO-dateformat
  ./gradlew jar 
  (On Windows OS: `gradlew.bat jar`)
  ```
  Note that a prebuilt version of the plugin is also provided within this repository, skip this step if using them.   

3. Copy the .jar plugin file into the XNAT plugins directory, example:
  ```
  cp ./build/libs/experiment-ISO-dateformat-plugin-0.1.0.jar /xnat/home/plugins/  
  ```

4. Restart XNAT:
  ```
  sudo service tomcat restart
  ```

## Questions/Comments?

Submit an issue, fork and/or PR. Alternatively, reach me at j.huguet(at)barcelonabeta.org

## Credits

This plugin was created using the [XNAT 1.7 Template Plugin](https://bitbucket.org/xnatx/xnat-template-plugin) as basis/inspiration.  
