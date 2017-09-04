# Resources display

## Introduction
The 'resources-display' plugin is actually a tiny hack that includes an additional Display Field in data-type listings with an aggregate of existing resource collections per each session, similar to and inspired by the existing mrSessionsData 'Scans' field. The hack was conceived for easing derived/processed data check originated from automated processing pipelines.

The plugin is mainly composed by a set of attributed gathered in an display XML file, the most rellevant of which is the SQLView element which contains an SQL query to gather the aggregate of existing resource collections to be displayed as an additional data-type listing column. 

This plugin eases end-user checks for existing resource collections as they may be listed, filtered by and/or exported (CSV). Note that solely the MRSessions data-type display document is affected. However it can be easily extended to others (i.e. subjectData, other experiments,... ).

Note that installing this XNAT plugin implies slightly modifying the database, i.e. creating additional database views. 
More information & documentation about Display Documents can be found [here](https://wiki.xnat.org/display/XNAT16/XNAT+Display+Documents).

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
  cd xnat-plugins/resources-display
  ./gradlew jar
  ```
  Note that a prebuilt version of the plugin is also provided within this repository, skip this step if using them.

3. Copy the .jar plugin file into the XNAT plugins directory, example:
  ```
  cp ./build/libs/resources-display-plugin-0.1.0.jar /xnat/home/plugins/  
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