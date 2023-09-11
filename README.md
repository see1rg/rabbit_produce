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

Для начала использования этого проекта, выполните следующие шаги:

1. **Шаг 1**: Установите RabbitMQ и настройте его соединение с приложением, при необходимости в файле `application.properties`. Ссылка [rabbitMQ](https://www.rabbitmq.com/download.html)

2. **Шаг 2**: Установите приложение по ссылке [rabbitConsume](https://github.com/see1rg/rabbitConsume) и запустите.
   
3. **Шаг 3**: Запустите приложение. Сообщения будут автоматически отправляться в очередь с заданным интервалом и записываться в 3-х БД.


Теперь вы можете использовать проект для отправки и обработки сообщений в RabbitMQ очередях.


## Зависимости

Проект использует следующие зависимости:

- Spring Framework для управления компонентами и настройки бинов.

- RabbitMQ для обработки сообщений в очередях.

- PostgreSQL для хранения данных. Убедитесь, что PostgreSQL также настроен и доступен, если это необходимо для функциональности проекта.

![Spring Boot Logo](https://www.vectorlogo.zone/logos/springio/springio-icon.svg)          ![PostgreSQL Logo](https://www.vectorlogo.zone/logos/postgresql/postgresql-icon.svg)           ![RabbitMQ Logo](https://www.vectorlogo.zone/logos/rabbitmq/rabbitmq-icon.svg)
![Docker Logo](https://www.vectorlogo.zone/logos/docker/docker-icon.svg)
