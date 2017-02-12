#Dagger2

1、创建桥梁对象
```
 MainComponent component = DaggerMainComponent.builder().mainModule(new MainModule()).build();
//注入
component.inject(this);

```

2、查找当前类中带有@inject的成员变量

```
@Inject   //标明需要注入的对象
 Person person;
```

3、根据成员变量的类型从module中查找那个有@Providers注解的方法返回值为当前类型。

##几种注解
- @module：作为实例对象的容器
- @Provides：标注能够提供实例化对象的方法
- @Component：作为桥梁，注入对象的通道
- @Inject：需要注入的方法

