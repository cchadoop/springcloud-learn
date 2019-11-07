# springcloud-learn
Spring Cloud 微服务学习之旅
Eureka 服务注册与发现
eureka-server 服务端
eureka-client 客户端
ribbon+restful 实现服务负载均衡
feign 集成了Ribbon，并和Eureka结合，默认实现了负载均衡,整合了Hystrix并具有熔断的能力
zuul 路由网关  客户端的请求首先需要经过负载均衡（Zuul、Ngnix），再到服务网关（Zuul集群），然后再到具体的服务
config

