# Описание проекта

Этот проект представляет собой пример простой системы публикации сообщений в 3-х очередях с испльзованием fanout типа обмена 
и записью в 3-х разных БД PostgreSQL В проекте используется Spring Framework и RabbitMQ. 
Для полной функциональности проекта, необходимо установить и настроить приложение [rabbitConsume](https://github.com/see1rg/rabbitConsume).

### Класс `ScheduledMessagePublisher`

`ScheduledMessagePublisher` является компонентом Spring, который публикует случайные сообщения в очереди с определенным интервалом времени.

```java
@Component
public class ScheduledMessagePublisher {
    // ... остальной код
}
```

### Класс `MQProducer`

`MQProducer` представляет собой сервис, который отправляет сообщения в RabbitMQ.

```java
@Service
public class MQProducer {
    // ... остальной код
}
```

## Как начать использовать проект

Для создания контейнеров при помощи Docker compose выполните инструкцию по ссылке [rabbitConsume](https://github.com/see1rg/rabbitConsume) 

Для начала использования этого проекта, выполните следующие шаги:

1. Установите RabbitMQ и настройте его соединение с приложением, при необходимости в файле `application.properties`. Ссылка [rabbitMQ](https://www.rabbitmq.com/download.html)

2. Установите приложение по ссылке [rabbitConsume](https://github.com/see1rg/rabbitConsume) и запустите.
   
3. Запустите приложение. Сообщения будут автоматически отправляться в очередь с заданным интервалом и записываться в 3-х БД.


Теперь вы можете использовать проект для отправки и обработки сообщений в RabbitMQ очередях.


## Зависимости

Проект использует следующие зависимости:

- Spring Framework для управления компонентами и настройками бинов.

- RabbitMQ для обработки сообщений в очередях.

- PostgreSQL для хранения данных.
  
- Liquibase для управления миграциями базы данных.

![Spring](https://img.shields.io/badge/-Spring-success?style=flat-square&logo=spring&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/-PostgreSQL-blue?style=flat-square&logo=postgresql&logoColor=white)
![Liquibase](https://img.shields.io/badge/-Liquibase-blueviolet?style=flat-square&logo=liquibase&logoColor=white)
![Maven](https://img.shields.io/badge/-Maven-orange?style=flat-square&logo=apache-maven&logoColor=white)
![RabbitMQ](https://img.shields.io/badge/-RabbitMQ-orange?style=flat-square&logo=rabbitmq&logoColor=white)

