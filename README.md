![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
## Pro.Engineer.Java.BoltLengthCheck
<a name="readme-top"></a>
### Настольное приложение для проверки длины болта.

#### Цель разработки: проверка болтового соединения на соответствие СП 16.13330.2017 (п. 14.2.5),
#### СП 70.13330.2012 (п. 4.5.4, п. 4.5.7).

<img src="images/dialog.png" alt="drawing" width="650"/>

***Максимальное количество соединяемых деталей - 6 шт. Анализ величины захода резьбы в пакет производится*** 
***по толщине детали, ближней к гайкам (строка 6). При необходимости, можно увеличить количество соединяемых деталей,*** 
***указав в строках 1, 2, 3, 4, 5 суммарную толщину деталей.***

***Щелкните по значку***
<img src="images/triangle.png" style="margin-bottom: 0px;" alt="drawing" width="25"/>
***в тексте ниже и получите картинку со справочной информацией.***

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

<p align="right">(<a href="#readme-top">back to top</a>)</p>