## 스택 (Stack)
- **정의**: **LIFO (Last In, First Out, 후입선출)** 구조  
- **비유**: 접시를 쌓아올리는 것 → 마지막에 올린 접시가 먼저 빠짐  
- **주요 연산**
  - `push(x)` : 맨 위(top)에 데이터 넣기
  - `pop()` : 맨 위 데이터 꺼내기
  - `top()` : 맨 위 데이터 확인 (삭제 X)
  - `empty()` : 스택이 비었는지 확인
  - `size()` : 현재 원소 개수 확인
    
    ```
    Stack<Integer> stack = new Stack<>();
    stack.push(10);   // push(x)
    stack.pop();      // pop()
    stack.peek();     // top()
    stack.empty();    // empty()
    stack.size();     // size()
    ```

---

## 큐 (Queue)
- **정의**: **FIFO (First In, First Out, 선입선출)** 구조  
- **비유**: 은행 창구 대기줄 → 먼저 온 사람이 먼저 나감  
- **주요 연산**
  - ```Stack<Integer> stack = new Stack<>();```
  - `push(x)` : 뒤에 데이터 넣기
  - `pop()` : 앞에서 데이터 꺼내기
  - `front()` : 맨 앞 데이터 확인
  - `back()` : 맨 뒤 데이터 확인
  - `empty()`, `size()`
    
    ```
    Queue<Integer> q = new LinkedList<>();
  
    q.add(10);        // push(x) - 뒤에 추가
    q.poll();         // pop() - 앞에서 꺼냄 (비어있으면 null)
    q.peek();         // front() - 맨 앞 확인
    // back()은 따로 없으므로 LinkedList로 캐스팅 후 getLast() 사용
    ((LinkedList<Integer>) q).getLast();
    
    q.isEmpty();      // empty()
    q.size();         // size()
    ```

---

## 덱 (Deque)
- **정의**: 양쪽 끝에서 삽입/삭제가 가능한 자료구조  
- **비유**: 양쪽 문이 있는 버스 → 앞/뒤 어디로든 타고 내릴 수 있음  
- **주요 연산**
  - `push_front(x)`, `push_back(x)`
  - `pop_front()`, `pop_back()`
  - `front()`, `back()`
  - `empty()`, `size()`

    ```
    Deque<Integer> dq = new ArrayDeque<>();
  
    dq.addFirst(10);   // push_front(x)
    dq.addLast(20);    // push_back(x)
    dq.pollFirst();    // pop_front()
    dq.pollLast();     // pop_back()
    dq.peekFirst();    // front()
    dq.peekLast();     // back()
    
    dq.isEmpty();      // empty()
    dq.size();         // size()
    ```
