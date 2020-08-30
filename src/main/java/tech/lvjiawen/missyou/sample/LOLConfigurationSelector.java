package tech.lvjiawen.missyou.sample;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class LOLConfigurationSelector implements ImportSelector {

    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[] {HeroConfiguration.class.getName()};
    }
}
