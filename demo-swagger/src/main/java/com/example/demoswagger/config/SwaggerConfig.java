//package com.example.demoswagger.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.oas.annotations.EnableOpenApi;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
///**
// * @ClassName SwaggerConfig
// * @Author diaoyn
// * @Date 2024/5/9 13:15
// */
//@Configuration
//@EnableOpenApi
//public class SwaggerConfig {
//
//    @Bean
//    public Docket docket() {
//        return new Docket(DocumentationType.OAS_30)
//                // 分组名称
//                // api描述信息
//                .apiInfo(apiInfo())
//                // 扫描配置 select
//                .select()
//                .paths(PathSelectors.any())
//                // 设置只扫描@RestController
//                .apis(RequestHandlerSelectors.basePackage("com.ynqd.evaluation.controller.TobiiController"))
//                .build();
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder().title("api接口")
//                .description("API接口")
//                .version("1.0").build();
//    }
//
//
//}
