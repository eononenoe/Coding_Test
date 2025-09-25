## 스택 (Stack)
- **정의**: **LIFO (Last In, First Out, 후입선출)** 구조  
- **비유**: 접시를 쌓아올리는 것 → 마지막에 올린 접시가 먼저 빠짐  
- **주요 연산**
  - `push(x)` : 맨 위에 데이터 넣기 → `push(x)`
  - `pop()` : 맨 위 데이터 꺼내고 반환 → `pop()`
  - `peek()` : 맨 위 데이터 확인 (삭제 X)
  - `empty()` : 비었는지 확인 (`true/false`)
  - `size()` : 현재 원소 개수

    
    ```
    Stack<Integer> stack = new Stack<>();
    stack.push(10);   // 맨 위에 추가
    stack.pop();      // 맨 위에서 꺼내고 반환
    stack.peek();     // 맨 위 값 확인
    stack.empty();    // 비었는지 확인
    stack.size();     // 원소 개수
    ```

---

## 큐 (Queue)
- **정의**: **FIFO (First In, First Out, 선입선출)** 구조  
- **비유**: 은행 창구 대기줄 → 먼저 온 사람이 먼저 나감  
- **주요 연산**
  - `add(x)` : 뒤에 데이터 넣기  
  - `poll()` : 앞에서 데이터 꺼내고 반환 (비어있으면 null)  
  - `peek()` : 맨 앞 데이터 확인  
  - `getLast()` : 맨 뒤 데이터 확인 (LinkedList로 캐스팅 필요)  
  - `isEmpty()` : 비었는지 확인 (`true/false`)  
  - `size()` : 현재 원소 개수  
    
    ```
    Queue<Integer> q = new LinkedList<>();
    
    q.add(10);                     // 뒤에 추가
    q.poll();                      // 앞에서 꺼내고 반환
    q.peek();                      // 맨 앞 값 확인
    ((LinkedList<Integer>) q).getLast(); // 맨 뒤 값 확인
    
    q.isEmpty();                   // 비었는지 확인
    q.size();                      // 원소 개수

    ```

---

## 덱 (Deque)
- **정의**: 양쪽 끝에서 삽입/삭제가 가능한 자료구조  
- **비유**: 양쪽 문이 있는 버스 → 앞/뒤 어디로든 타고 내릴 수 있음  
- **주요 연산**
  - `addFirst(x)` : 앞에 데이터 넣기  
  - `addLast(x)` : 뒤에 데이터 넣기  
  - `pollFirst()` : 앞에서 꺼내고 반환  
  - `pollLast()` : 뒤에서 꺼내고 반환  
  - `peekFirst()` : 맨 앞 데이터 확인  
  - `peekLast()` : 맨 뒤 데이터 확인  
  - `isEmpty()` : 비었는지 확인 (`true/false`)  
  - `size()` : 현재 원소 개수  


    ```
    Deque<Integer> dq = new ArrayDeque<>();
  
    dq.addFirst(10);   // 앞에 추가
    dq.addLast(20);    // 뒤에 추가
    dq.pollFirst();    // 앞에서 꺼내고 반환
    dq.pollLast();     // 뒤에서 꺼내고 반환
    dq.peekFirst();    // 맨 앞 값 확인
    dq.peekLast();     // 맨 뒤 값 확인
    
    dq.isEmpty();      // 비었는지 확인
    dq.size();         // 원소 개수
    ```
