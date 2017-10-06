# Liquid log

Практическое задание для курса ИМКН "Промышленая разработка на Java".

Liquid log - отображение производительности какого-либо приложения на основе логов этого приложения.

Приложение запускается в двух режимах - (1) парсинг лога (и сохранение его в БД) и (2) отображение лога.

## Запуск парсинга лога

1. VM Options: `-DParser -Dparse.mode=sdng -Dinflux.host="http://127.0.0.1:8086" -Dinflux.user="root" -Dinflux.password="root"`
1. Аргументы: `"/home/user/sdng.log.2017-09-07" sdng`

Здесь передаётся путь до файла с логом и имя режима парсинга.

Доступно 3 режима:
* sdng - для логов приложения ServiceDesk
* gc - для логов Garbage Collector
* top - для логов утилиты top

Для парсинга и последующего отображения необходима база данных [InfluxDB](https://github.com/influxdata/influxdb)

## Запуск web-приложения

Из IDEA нужно только запустить Main class: ru.naumen.perfhouse.PerfhouseApplication

Доступ к базе Influx прописан в файле конфигурации application.properties