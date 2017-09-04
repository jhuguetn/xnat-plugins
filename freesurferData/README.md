# FreeSurfer

## Introduction
[FreeSurfer](https://surfer.nmr.mgh.harvard.edu) is an open source software suite for processing and analyzing (human) brain MRI images. 

FreeSurfer plugin shapes FreeSurfer output stats metrics as custom XNAT data-types (ImageData assessments) for integrating them as an additional information type to XNAT.

### Taxonomy of FreeSurfer output metrics 
* Subcortical segmentation (asec.stats), more info [here](http://surfer.nmr.mgh.harvard.edu/fswiki/FsTutorial/VolumetricGroupAnalysis#aseg.stats)
* Cortical parcellation (lh.aparc.stats & rh.aparc.stats), more info [here](http://surfer.nmr.mgh.harvard.edu/fswiki/FsTutorial/VolumetricGroupAnalysis#aparc.stats)

## Pre-requisites

 * Install Git
 * Install Java JDK
 * Install [Groovy](http://groovy-lang.org/)
 * Install FreeSurfer (Note that a [license](https://surfer.nmr.mgh.harvard.edu/registration.html) is required to use the software) 
 
## Installation procedure

1. Get the lattest version of the plugin as follows: 
  ```
  git clone https://github.com/jhuguetn/xnat-plugins.git xnat-plugins
  ```

2. Build and deploy the plugin by doing as follows:
  ```
  cd xnat-plugins/freesurferData
  ./gradlew jar
  ```
  Note that a prebuilt version of the plugin is also provided within this repository, skip this step if using them.

3. Copy the .jar plugin file into the XNAT plugins directory, example:
  ```
  cp ./build/libs/freesurferData-plugin-0.1.0.jar /xnat/home/plugins/  
  ```

4. Restart XNAT:
  ```
  sudo service tomcat restart
  ```
  
## Questions/Comments?

Submit an issue, fork and/or PR. Alternatively, reach me at j.huguet(at)amc.uva.nl

## Credits

* This plugin was ported from an existing [XNAT 1.6.X module](https://github.com/jhuguetn/xnat-modules/) using [XNAT Module to Plugin Conversion Script](https://bitbucket.org/xnatdev/module_to_plugin).
