package org.nrg.xnat.generated.plugin;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@XnatPlugin(value = "freesurferData", name = "FreeSurfer Stats Data-types Plugin", description = "The FreeSurferData plugin shapes FreeSurfer output stats as custom XNAT data-types (ImageData assessments).")
public class FreeSurferData {
}