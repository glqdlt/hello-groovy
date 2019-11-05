# intro

한동안 자바스크립트만 만졌더니 동적 언어의 뽕맛을 못 헤어나오겠다.

그래서 그루비를 해봄, 문자 탬플릿 구문은 신세계다. 사실 신세계까지는 아님 자바스크립트 ES6에서 조금 맛봐서리

마침 maven 은 너무 꼰대같다는 생각도 들고, gradle은 그루비 스크립트로 플러그인 없이 해피 빌드가 가능하다고 하니깐

재밌게 만져보고 있음.

# groovy syntax

## 클로저

함수형 언어에서 나오는 클로저 (jvm 클로저 언어 등)은 아님. 이해하기로는 람다 구문과 비슷한 작은 함수라고 생각하고 있음.

람다와 그루비 클로저의 차이는 아래 블로그에 잘 쓰여있음.

대표적인 차이점을 보면

- A Java lambda really is a functional interface which behaves like an anonymous inner class whereas Groovy closures are instances of the Closure class which provides additional methods for inspection and dynamic behavior.

> 자바는 인터페이스를 통한 익명 객체로 생성되지만, 그루비 클로저는 Closure 클래스 객체임. 이 차이는 결국 그루비 클로저는 Closure 클래스의 다양한 헬퍼 메소드를 사용할 수 있다는 이야기. 우왕ㅋ굳ㅋ. 애초에 그루비 클로저는 기능 호출자체가 Closure.call() 메소드를 호출한느걸로 시작함.

- Both APIs are optimized for parallel collection processing. For lambdas, you use the Collection API’s #parallelStream() method instead of #stream(); in Groovy, concurrent implementations of iterator methods are provided by the GPars extension.

> 자바 람다와 그루비 클로저, 둘 다 병렬 처리를 지원함. 그 구현 방식이 조금 차이나는 데, 자바는 Collection API 에서 구현, 그루비는 GPars

- Groovy’s syntax does not support lambda expressions directly; however, you can put a (syntactically oftentimes more concise) Groovy closure wherever an API expects a lambda expression.

> 자바는 람다란 이름 답게 람다 문법을 지원함. 그루비는 지원안함. 그러나 API 에서 지원하는 선이면 람다 문법이 먹힐 때도 있음. 버전이나 플러그인 마다 다른듯?

- Lambdas can only access variables of the surrounding context if they are either explicitly or “effectively” final; Groovy closures have access to any variables of the surrounding context.

> 자바 람다는 외부 context 변수 참조 시에 불변 상수(final 변수)만 접근할 수 있음, 반면 그루비는 상수가 아닌 변수도 접근할 수 있음 

- Both languages support type inference to reduce the need to explicitly declare parameter types. When in “dynamic typing mode”, Groovy doesn’t evaluate any type information at compile time at all.

> 둘 다 타입 추론을 지원하고 명시적으로 선언하지 않아도 됨. 단, 그루비는 '다이나믹 타이핑 모드' 일 때에는 타입에 대한 타입 체크를 하지 않음. (동적 언어 특징)


[https://wjw465150.github.io/blog/Groovy/my_data/Java8/Java_8_lambdas_vs._Groovy_closures_(part_1_of_2).htm](https://wjw465150.github.io/blog/Groovy/my_data/Java8/Java_8_lambdas_vs._Groovy_closures_(part_1_of_2).htm)

