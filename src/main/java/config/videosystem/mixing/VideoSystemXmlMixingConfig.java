package config.videosystem.mixing;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

//xml + java 혼합
@Configuration
@Import({DVDPlayerConfig.class})
@ImportResource({"classpath:config/videosystem/DVDConfig.xml"})
public class VideoSystemXmlMixingConfig {

	
	
}
