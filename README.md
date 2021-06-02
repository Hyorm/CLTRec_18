# CLTRec_18
User Customized Clothes Recommend System

<pre>
src -- cr ------ main ------- Main.java
             |           |
             |            --- ReadFile.java
             |           |
             |            --- LogOn.java
             |           |
             |            --- Register.java
             |           |
             |            --- Parser.java
             |           |
             |            --- CenterStack.java
             |
              -- closet ----- Closet.java
             |           |
             |            --- Clothes.java
             |           |
             |            --- ClothesCodec.java
             |           |
             |            --- ClothesEncode.java
             |           |
             |            --- ClothesDecode.java
             |           |
             |            --- Closet_Set.java
             |           |
             |            --- RecentClothes.java
             |
              -- usr -------- User.java
             |           |
             |            --- Circumstance.java
             |
              -- algorithm -- Recommender.java
             |           |
             |            --- SortClothes.java
             |            
              -- gui -------- CustomFrame.java
                         |
                          --- LogGUI.java
                         |
                          --- regGUI.java
                         |
                          --- NorthPanel.java
                         |
                          --- CenterPanel.java
                         |
                          --- WestPanel.java
                         |
                          --- CenterPanel.java

</pre>

### 단계별 Iteration 계획
#### 1st iteration
Creating a simple recommender, which consists of only a closet for saving user’s clothes.
#### 2nd iteration
Refactoring to support various function for more customized recommend
#### 3rd iteration
Divide users for make more easily management the system and View with Swing

### Use Case Diagram
<img width="562" alt="image" src="https://user-images.githubusercontent.com/28642467/107298012-e8123980-6ab7-11eb-9ffb-395921963ddd.png">
<p align="center">그림 1. Use Case Diagram</p>

### 주요 화면 dump
<img width="599" alt="image" src="https://user-images.githubusercontent.com/28642467/107298076-0d06ac80-6ab8-11eb-9452-2251ca7810ec.png">
<p align="center">그림 2. Main Screen</p>

<img width="600" alt="image" src="https://user-images.githubusercontent.com/28642467/107298201-3de6e180-6ab8-11eb-9bc4-45d9c7cbe950.png">
<p align="center">그림 3. Recommended Clothes Screen</p>

<img width="568" alt="image" src="https://user-images.githubusercontent.com/28642467/107298311-77b7e800-6ab8-11eb-8615-52e832d3be0a.png">
<p align="center">그림 4. Personal Closet Screen(Grid View)</p>

<img width="573" alt="image" src="https://user-images.githubusercontent.com/28642467/107298393-a7ff8680-6ab8-11eb-98c3-d4c2714001a9.png">
<p align="center">그림 5. Personal Closet Screen(Table View)</p>

### 주요 구현 기능
#### 1,2 iteration에서 구현한 기능
- main page
- 각 page에 맞는 panel생성 --- Factory pattern
- user login --- Singletone pattern
- 의상 보여주기
- Closet
- Clothes(codec 포함)
- Closet_set
- data 불러오기
- 순위 보여주는 page
- Closet page
- 이미지와 data matching
- 추천용 data 만들기
- Data -- 데이터 끝(최신)에서 clothes 50개 가져오는 클래스 → 순위 보여주는 page랑 매칭할 수 있게.

#### 3rd iteration에서 구현한 기능
- GUI
- Stack통한 undo/redo(예정)
- Recommend Closet page
- Register -- gui

- 알고리즘 --- Strategy pattern<br>
//랜덤 추천 에러 수정
- closet추천과 clothes 추천으로 분리
- 사용자 응답(OpenSource) 추천 알고리즘(ex. market basket)
- Ordered recommend

### Iteration별 디자인 패턴
<img width="607" alt="image" src="https://user-images.githubusercontent.com/28642467/107298633-0cbae100-6ab9-11eb-8e37-f567c2b6ab70.png">
<p align="center">표 1. Iteration별 디자인 패턴</p>

### Ant
   1. ant build
   2. ant clean
   3. ant doc

### AppletViewer
<br>CLTRec.html

### Development Environment
<br>java version "10.0.1" 2018-04-17
<br>Java(TM) SE Runtime Environment 18.3 (build 10.0.1+10)
<br>Java HotSpot(TM) 64-Bit Server VM 18.3 (build 10.0.1+10, mixed mode)

### Code Contribution
<img width="600" alt="image" src="https://user-images.githubusercontent.com/28642467/120491573-4f9c1e00-c3f4-11eb-9050-da3ecbfd635a.png">

