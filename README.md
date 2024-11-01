***Дз Поликлиника***

Цель дз: имитация работы поликлиники ипользуя Spring boot.
В поликлинике есть врачи и касса.
Люди приходят в поликлинку, лечатся у определенных специалистов,
после чего врач выставляет счет и этот доход идет в кассу.

1. Создать spring boot проект (https://start.spring.io/):
   Группа com.javaacademy
   Имя артефакта polyclinic
   Версия 1.0.0

Зависимости: Lombok
Плагины: чекстайл (подключить руками после генерации)
2. Создать класс касса: атрибут - доход.
   2.1 Умеет принимать платежи (т.е. увеличивать доход).
   2.2 Умеет печатать доход (лог, а не sout).
3. Создать класс врач, атрибуты:  стоимость приема, специализация.
   Умеет лечить человека (логирует "{Специализация врача} вылечил человека",
   возвращает стоимость приема.
   3.1 Специализаций может быть 3: Стоматолог, Хирург, Терапевт.
4. Создать класс поликлиника: хранит в себе кассу, а так же специалистов:
   -стоматолога
   -терапевта
   -младшего хирурга
   -старшего хирурга.
   Старший и младший хирурги отличаются лишь стоимостью приема
   (т.е. они оба врачи со специализацией хирург, просто ставки отличаются).

4.1. поликлиника умеет:
-лечить у стоматолога: вызывает метод лечить у стоматолога ->
выставленный счет от стоматолога заносится в кассу (пункт 2.1)
-лечить у терапевта: та же логика, что у стоматолога
-лечить у младшего хирурга: та же логика, что у стоматолога
-лечить у старшего хирурга: та же логика, что у стоматолога

5. С помощью Spring создать экземпляры:
   -кассы
   -стоматолога (стоимость приема 1500)
   -терапевта (стоимость приема 500)
   -младшего хирурга (стоимость приема 700)
   -старшего хирурга (стоимость приема 2000)
   -Поликлиника
6. В сгенерированном PolyclinicApplication вытащить из контекста Поликлинику.
   6.1 У поликлиники вызвать методы:
   -лечить у стоматолога
   -лечить у терапевта
   -лечить у младшего хирурга
   -лечить у старшего хирурга
7. Вытащить из контекста кассу. Распечатать доход. Должно быть 4700.

*Опционально(хотя бы попробуйте)
8. Вынести стоимость приема специалистов в application.yaml.
   При создании специалистов стоимость приема должна браться из application.yaml.

