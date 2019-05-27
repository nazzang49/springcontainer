package config.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cafe24.springcontainer.soundsystem.Index;

@Configuration

//[스캐닝 방법]
//1) 패키지
//2) 클래스

//컴포넌트 스캔을 명시해주면 내부적으로 bean을 만들 필요 없음
//@ComponentScan(basePackages="com.cafe24.springcontainer.soundsystem")
//@ComponentScan(basePackages= {"com.cafe24.springcontainer.videosystem", "com.cafe24.springcontainer.soundsystem"})
//basePackageClasses에 지정한 클래스가 속한 패키지를 basePackage 활용(Marker Interface)
@ComponentScan(basePackageClasses=Index.class)
public class CDPlayerConfig {

	
	
}
