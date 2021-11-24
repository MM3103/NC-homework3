# Анализ коллекций.
## 1.Сравнение LinkedList и MyLinkedList
Производилось три измерения для: 1.000, 10.000, 100.000 элементов.
### 1.1 Метод add :
![Add](https://user-images.githubusercontent.com/91564698/143222207-2a2c38e9-61b9-4654-a291-2643fbb9c4f1.png)
Добавление элементов происходит быстрее в myLinkedList.
### 1.2 Метод add по индексу:
![Add by index](https://user-images.githubusercontent.com/91564698/143222490-b253a45b-3d67-4201-a972-2c1a7eb9c0cd.png)
Добавление элементов по индексу быстрее работает в myLinkedList.
### 1.3 Метод get:
![get1](https://user-images.githubusercontent.com/91564698/143222750-e4b0c47d-7159-477e-aa1e-0dee28f88142.png)
 MyLinkedList работает быстрее.
### 1.4 Метод remove:
![remove-method](https://user-images.githubusercontent.com/91564698/143222759-6cec13ac-cdeb-4a3e-9287-981379543525.png)
Здесь также быстрее оказался MyLinkedList.
### 1.5 Метод clear:
![clear1](https://user-images.githubusercontent.com/91564698/143222738-562ca4c2-ae90-43bd-9405-f2675370a222.png)
MyLinkedList очищает список быстрее.
### Вывод:
В большинстве операции myLinkedList работает быстрее, чем стандартный linkedList. Это связано с тем, что он имеет более простую реализацию методов. В нем отсутствуют различные проверки, и соответственно, вероятность возникновения ошибок возрастает, но при этом увеличивается быстродействие. 
## 2.Сравнение производительности коллекций
### 2.1	Сравнить производительность ArrayList и LinkedList для основных операций
#### Добавление элементов:
в начало:
![Task1 AddBegin](https://user-images.githubusercontent.com/91564698/143233842-a889b79e-aeb7-4aa7-8269-a417d524c6bf.png)
в середину:
![Task1 AddByIndex](https://user-images.githubusercontent.com/91564698/143233934-fe308f1b-63b6-4ba2-9ae3-12d0f24848cf.png)
в конец:
![Task1 AddLast](https://user-images.githubusercontent.com/91564698/143233893-f47fc5d3-f0dc-4065-90d8-a622b46d3b5e.png)
#### 	Получение элементов по индексу:
![Task1 Get](https://user-images.githubusercontent.com/91564698/143234003-0fdd92da-94bb-4b39-bb15-d4780618b579.png)
#### 	Удаление элементов:
из начало:
![Task1 RemoveFirst](https://user-images.githubusercontent.com/91564698/143234039-3e82544f-1abf-4f91-9906-b3f7e1c341f6.png)
из середину:
![Task1 RemoveMiddle](https://user-images.githubusercontent.com/91564698/143234099-04f58ebd-c452-4e42-8d6a-9533ba609ed0.png)
из конец:
![Task1 RemoveLast](https://user-images.githubusercontent.com/91564698/143234067-34b1cfd2-9443-4a6f-a5da-8694d3b98ee3.png)
### Вывод:
Из графиков видно, что вставка в:
 - начало быстрее происходит в LinkedList`е;
 - середину – в ArrayList`е;
 - конец – в ArrayListе.
Получение элементов по индексу быстрее в ArrayList`е. 
Удаление элементов из:
	- начала быстрее происходит в LinkedList`е;
	- середины – в ArrayList`е.
  - Удаление из конца -  Чем больше элементов, тем медленее удаление происходит в LinkedListе. При этом, если элементов немного (10.000-50.000), то удаление эффективнее в LinkedListе.
	Полученные здесь результаты объясняются устройством коллекций. ArrayList – это список, основанный на массиве. Тогда как LinkedList – связный список: элементы здесь, помимо хранения значения самого элемента, имеют ссылки на предыдущий и следующий элементы. В связи с этим, если необходима работа с началом и концом, то используют LinkedList. Тогда как, если требуется работа с элементами по индексу, то используют ArrayList.
### 2.2	Сравнить производительность HashSet, LinkedHashSet, TreeSet
Добавление элементов:
![Task2 Add](https://user-images.githubusercontent.com/91564698/143234158-7108f9b5-5080-41dd-a6ce-32ecc3e72175.png)
Поиск элементов:
![Task2 contains](https://user-images.githubusercontent.com/91564698/143234179-fc5be260-fbc9-4e69-bc0c-5de21db49b64.png)
Удаление элементов:
![Task2 Remove](https://user-images.githubusercontent.com/91564698/143234208-2398ce2f-a2ba-4baa-817d-dc8b9ff369e3.png)
### Вывод:
Во всех случаях медленнее оказался TreeSet. HashSet и LinkedHashSet работают примерно с одной скоростью. Связано это с их устройством: 
	- HashSet используется там, где порядок элементов не имеет значения;
	- LinkedHashSet хранит элементы в порядке добавления;
	- TreeSet для хранения элементов применяет дерево. Элементы здесь располагаются в отсортированном по возрастанию виде.
 ### 2.3	Сравнить производительность HashMap, LinkedHashMap, TreeMap.
Добавление элементов:
 ![Task3 Put](https://user-images.githubusercontent.com/91564698/143234241-751d1269-e125-4f04-abef-c19e49459e56.png)
Получение элемента по ключу:
![Task3 Get](https://user-images.githubusercontent.com/91564698/143234295-6b6b0982-88e0-41a8-8ddc-ca8f62e55fed.png)
Удаление элемента по ключу:
![Task3 Remove](https://user-images.githubusercontent.com/91564698/143234264-e1a5c667-4f3d-4172-8bfe-01425446c3f1.png)
### Вывод:
Во всех случаях медленнее оказался TreeMap. Самым быстрым для добавления в случае большого количества элементов является – HashMap. В случае получения элементов (также при их большом количестве) быстрее оказывается LinkedHashMap. При удалении элементов HashMap и LinkedHashMap почти не отличаются. Связано это с их устройством.