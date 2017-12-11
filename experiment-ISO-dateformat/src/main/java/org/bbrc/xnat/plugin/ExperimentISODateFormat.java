package org.bbrc.xnat.plugin;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@XnatPlugin(value = "experiment-ISO-dateformat", name = "Experiment ISO Date Format Plugin", description = "XNAT Experiment ISO Date Format Plugin")
public class ExperimentISODateFormat {
}