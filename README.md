# JDK

            Урок 1. Графические интерфейсы
           
    1.  Выполнить все задания семинара, если они не были решены, без ограничений по времени; 
    2.  Отправлять сообщения из текстового поля сообщения в лог по нажатию кнопки или по нажатию
        клавиши Enter на поле ввода сообщения; 
    3.  Продублировать импровизированный лог (историю) чата в файле; 
    4.  При запуске клиента чата заполнять поле истории из файла, если он существует. 
        Обратите внимание, что чаще всего история сообщений хранится на сервере и заполнение
        истории чата лучше делать при соединении с сервером, а не при открытии окна клиента.
    
   Решение тут _[HW1](https://github.com/TiRastaMafia/JDK/tree/main/HW1)_

   
           Урок 2. Данные и функции

    1.  Дописать третье задание таким образом, чтобы в идентификатор типа Developer записывался 
        объект Frontender, и далее вызывался метод developGUI(), не изменяя существующие интерфейсы,
        только код основного класса.
    
  Решение тут _[HW2](https://github.com/TiRastaMafia/JDK/tree/main/HW2)_

  
           Урок 3. Обобщенное программирование

    1.  Внедрить итератор из задания 2 в коллекцию, написанную в задании 3 таким образом,
        чтобы итератор был внутренним классом и, соответственно, объектом в коллекции.
    1.1 Написать класс Калькулятор (необобщенный), который содержит обобщенные статические 
        методы: sum(), multiply(), divide(), subtract(). Параметры этих методов – 
        два числа разного типа, над которыми должна быть произведена операция.
    2.  Напишите обобщенный метод compareArrays(), который принимает два массива
        и возвращает true, если они одинаковые, и false в противном случае. Массивы могут 
        быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа.
    3.  Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
        Класс должен иметь методы getFirst(), getSecond() для получения значений пары,
        а также переопределение метода toString(), возвращающее строковое представление пары.
     
  Решение тут _[HW3](https://github.com/TiRastaMafia/JDK/tree/main/HW3)_


           Урок 4. Коллекции

    1.  Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников - 
        каждый сотрудник должен иметь следующие атрибуты:
        Табельный номер
        Номер телефона
        Имя
        Стаж
        Добавить метод, который ищет сотрудника по стажу (может быть список)
        Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
        Добавить метод, который ищет сотрудника по табельному номеру
        Добавить метод добавление нового сотрудника в справочник сотрудников
     
  Решение тут _[HW4](https://github.com/TiRastaMafia/JDK/tree/main/HW4)_  


           Урок 5. Многопоточность

    1.  Есть пять философов (потоки), которые могут либо обедать либо размышлять.
        Каждый философ должен пообедать три раза. Каждый прием пищи длиться 500 миллисекунд
        После каждого приема пищи философ должен размышлять
        Не должно возникнуть общей блокировки
        Философы не должны есть больше одного раза подряд

    2.  Реализовать много поточное приложение имитирующее работу месенджера:
        Хранение и работа с логом чата проводится в основном потоке
        Остальные потоки - клиенты, хранят в себе имя пользователя, имет графическую оболочку 
        отображающую чат и позволяющую отправлять сообщения в чат
     
  Решение тут _[HW5](https://github.com/TiRastaMafia/JDK/tree/main/HW5)_  


           Урок 6. Управление проектом: сборщики проектов

    1.  Создать свой Java Maven/Gradle проект;
        Реализовать прикладную задачу - приложение для демонстрации парадокса Монти Холла;
        Можно добавить любые библиотеки которые считают необходимыми
        Результаты должны быть сохранены в HashMap (шаг цикла -> результат)
        Необходимо вывести статистику по результату - количество позитивных и негативных
        результатов, процент от общего количества шагов цикла.
     
  Решение тут _[HW6](https://github.com/TiRastaMafia/JDK/tree/main/HW6)_  



  
  


