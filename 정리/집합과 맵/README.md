## 집합 (Set)
- **정의**: 중복을 허용하지 않고, 순서가 없는 자료구조  
- **비유**: 학생 명단 → 같은 이름이 중복될 수 없음  
- **주요 메서드 (Java)**
  - `add(x)` : 원소 추가
  - `remove(x)` : 원소 삭제
  - `contains(x)` : 특정 원소 포함 여부 확인
  - `size()` : 원소 개수 확인
  - `isEmpty()` : 집합이 비었는지 확인
- **집합 연산**
  - `retainAll(other)` : 교집합  
  - `addAll(other)` : 합집합  
  - `removeAll(other)` : 차집합
  
    ```
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();
    
    set1.add(1);
    set1.add(2);
    set1.add(3);
    
    set2.add(3);
    set2.add(4);
    
    // 교집합
    set1.retainAll(set2); // {3}
    
    // 합집합
    set1.addAll(set2);    // {1, 2, 3, 4}
    
    // 차집합
    set1.removeAll(set2); // {1, 2}
    ```
---

## 맵 (Map)
- **정의**: `키(key)`와 `값(value)`의 쌍으로 데이터를 저장하는 자료구조  
- **비유**: 전화번호부 → 이름(key)에 전화번호(value) 저장  
- **주요 메서드 (Java)**
  - `put(key, value)` : 데이터 추가/수정
  - `get(key)` : 값 조회
  - `containsKey(key)` : 키 존재 여부 확인
  - `remove(key)` : 데이터 삭제
  - `size()` : 원소 개수 확인
  - `isEmpty()` : 비어있는지 확인
- **활용 예시**
  - 단어 빈도수 세기
  - 빠른 키-값 탐색
    
    ```
    Map<String, Integer> map = new HashMap<>();

    map.put("apple", 3);
    map.put("banana", 2);
    
    // 값 조회
    int count = map.get("apple"); // 3
    
    // 키 존재 여부
    boolean hasKey = map.containsKey("banana"); // true
    
    // 값 변경
    map.put("banana", map.get("banana") + 1); // banana -> 3
    
    // 삭제
    map.remove("apple");
    
    // 크기 / 비었는지 확인
    map.size();
    map.isEmpty();

    ```
