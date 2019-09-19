# DesignPattern

# 策略模式 Strategy Pattern

*策略模式定义了算法族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化独立于使用算法的客户*

[例子 - 模拟鸭子](src/ObserverPattern)

# 观察者模式 Observer Pattern

*观察者模式定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，它的所有依赖者都会收到通知并自动更新*

[例子 - 天气站](src/StrategyPattern)

# 装饰者模式 Decorator Pattern

*装饰者模式动态地将责任附加到对象上。若要扩展功能，装饰者提供了比继承更有弹性到替代方案*

[例子 - 星巴兹饮料](src/DecoratorPattern)

# 工厂模式 Factory Pattern

## 工厂方法模式

*工厂方法模式定义了一格创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类*

[例子 - 比萨店](src/FactoryPattern/FactoryMethodPattern)
## 抽象工厂模式

*抽象工厂模式提供一个接口，用于创建相关或依赖对象到家族，而不需要明确指定具体到类*

# 单例模式 Singleton Pattern

*单例模式确保一个类只有一个实例，并提供一个全局访问点*

[例子 - 单例类](src/SingletonPattern/Singleton)

# 命令模式 Command Pattern

*命令模式将"请求"封装成对象，以便使用不同的请求、队列或者日志来参数化其他对象。命令模式也支持可撤销的操作*

[例子 - 遥控器](src/CommandPattern/RemoteControl)

# 适配器模式 Adapter Pattern

*适配器模式将一个类的接口，转换成客户期望的另一个接口。适配器让原本接口不兼容的类可以合作无间*

[例子 - 鸭子适配器](src/AdapterPattern)