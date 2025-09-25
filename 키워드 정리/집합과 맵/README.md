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
