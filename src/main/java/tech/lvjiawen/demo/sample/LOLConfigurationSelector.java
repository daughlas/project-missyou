package tech.lvjiawen.demo.sample;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import tech.lvjiawen.demo.sample.HeroConfiguration;

public class LOLConfigurationSelector implements ImportSelector {

    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[] {HeroConfiguration.class.getName()};
    }
}
