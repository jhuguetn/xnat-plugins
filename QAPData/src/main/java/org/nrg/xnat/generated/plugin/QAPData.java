package org.nrg.xnat.generated.plugin;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@XnatPlugin(value = "QAPData", name = "Quality Assessment Protocol Data-types Plugin", description = "QAPData plugin models & structures QAP output metrics to custom XNAT data-types (ImageData assessments).")
public class QAPData {
}