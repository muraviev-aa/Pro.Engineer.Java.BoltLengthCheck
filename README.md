## Pro.Engineer.Java.BoltLengthCheck
### Настольное приложение предназначено для проверки длины болта.

<img src="images/dialog.png" alt="drawing" width="650"/>

***Максимальное количество соединяемых деталей - 6 шт. Анализ величины захода резьбы в пакет производится*** 
***по толщине детали, ближней к гайкам. При необходимости можно увеличить количество соединяемых деталей,*** 
***указав в строках 1, 2, 3, 4, 5 суммарную толщину деталей.***

### Предусмотрено следующее расположение шайб: 

<!-- TABLE OF CONTENTS -->
<details>
  <summary>1 шайба под головкой болта + 2 шайбы под гайками</summary>
  <ol>
    <img src="images/bolt1_2.png" alt="drawing" width="100"/>
  </ol>
</details>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>1 шайба под головкой болта + 1 шайба под гайками</summary>
  <ol>
    <img src="images/bolt1_1.png" alt="drawing" width="100"/>
  </ol>
</details>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>под головкой болта шайбы нет + 2 шайбы под гайками</summary>
  <ol>
    <img src="images/bolt0_2.png" alt="drawing" width="100"/>
  </ol>
</details>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>под головкой болта шайбы нет + 1 шайба под гайками</summary>
  <ol>
    <img src="images/bolt0_1.png" alt="drawing" width="100"/>
  </ol>
</details>

### Выполняются следующие проверки:

<!-- TABLE OF CONTENTS -->
<details>
  <summary>проверка величины захода резьбы в соединяемую деталь</summary>
  <ol>
    <img src="images/pack.png" alt="drawing" width="400"/>
  </ol>
</details>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>проверка возможности закрутить гайку</summary>
  <ol>
    <img src="images/nut.png" alt="drawing" width="400"/>
  </ol>
</details>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>проверка длины резьбового конца болта, выступающего из гайки</summary>
  <ol>
    <img src="images/short.png" alt="drawing" width="400"/>
  </ol>
</details>

### Примеры отчетов, сгенерированных приложением в pdf:

***До генерирования отчета возможно:***
- указать соединяемые марки;
- указать путь до папки с файлами pdf.

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Пример отчета без ошибки подбора длины болта</summary>
  <ol>
    <img src="images/example.png" alt="drawing" width="450"/>
  </ol>
</details>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Пример отчета с ошибкой подбора длины болта</summary>
  <ol>
    <img src="images/no_spin.png" alt="drawing" width="450"/>
  </ol>
</details>
