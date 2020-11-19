springboot-dubbo 服务整合，注册中心使用zookeeper

1. `service-interface` 模块，使用普通的maven创建的项目，用于定于需要发布的服务接口，供各个业务方的client引用
2. `dubbo-provider` 模块，使用springboot创建的项目，用于实现需要发布的服务接口的实现逻辑

`dubbo-consumer` 工程，使用springboot创建的项目，作为client调用 `dubbo-provider` 发布的服务 ，
对应项目的工程地址为：https://github.com/shiluoheroking/dubbo-consumer
