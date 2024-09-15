package annotations;

import org.springframework.context.annotation.*;

@ComponentScan("c1")
@ComponentScan(basePackages="annotations")
public class AppConfig {
}