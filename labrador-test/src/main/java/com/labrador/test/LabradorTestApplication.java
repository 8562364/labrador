package com.labrador.test;

import org.springframework.boot.Banner;
import org.springframework.boot.ansi.AnsiOutput;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.SpringVersion;

/**
 *
 * @author horse
 */
@SpringBootApplication
@EnableDiscoveryClient(autoRegister = false)
public class LabradorTestApplication {

    public static void main(String[] args) {
        AnsiOutput.setEnabled(AnsiOutput.Enabled.ALWAYS);
        new SpringApplicationBuilder(LabradorTestApplication.class)
                // 这个是为了可以加载 Spring 版本
                .main(SpringVersion.class)
                // 控制台打印
                .bannerMode(Banner.Mode.CONSOLE)
                .run(args);
    }

}
