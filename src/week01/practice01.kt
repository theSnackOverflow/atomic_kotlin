// 1. 다음 코드의 출력 결과는?
/*
val a = 5
val b = 2.5
println(a + b)
*/
// => 답: 7.5 (Int + Double이므로 Double로 자동 변환됨)

val a1 = 5
val b1 = 2.5
println(a1 + b1) // 7.5


// 2. 다음 코드의 결과는?
/*
val s = "Kotlin"
println("Hello $s!")
*/
// => 답: Hello Kotlin!

val s2 = "Kotlin"
println("Hello $s2!") // Hello Kotlin!


// 3. 아래 코드에서 사용된 타입은 무엇인가요?
/*
val isDone = false
*/
// => 답: Boolean

val isDone3: Boolean = false // Boolean


// 4. Char 타입으로 한 글자 'A'를 변수로 선언하세요.
val c4: Char = 'A'


// 5. val x = 1.23 은 어떤 타입으로 추론되나요?
// => 답: Double
val x5 = 1.23 // Double


// 6. Int의 최대값을 저장하는 상수는 무엇인가요?
// => 답: Int.MAX_VALUE
val max6 = Int.MAX_VALUE


// 7. 삼중 큰따옴표를 사용하면 어떤 장점이 있나요?
/*
"""abcd"""
*/
// => 답: 이스케이프 없이 여러 줄 문자열(개행, 따옴표 포함) 사용 가능

val s7 = """
    여러 줄
    문자열도 가능!
    "큰따옴표도 그대로"
""".trimIndent()


// 8. 다음 코드에서 오류 없이 출력될 수 있도록 수정하세요:
/*
val x = 1
println("Value is: $x + 1")
*/
// => 답: 실제 연산 결과를 출력하려면 ${x + 1}로 수정
val x8 = 1
println("Value is: ${x8 + 1}") // Value is: 2


// 9. 점수가 90점 이상이면 A, 80점 이상이면 B, 아니면 C로 출력하는 if 식을 작성하세요.
val score9 = 85
val grade9 = if (score9 >= 90) "A"
else if (score9 >= 80) "B"
else "C"
println(grade9) // 85점이니 B


// 10. 아래 코드를 for 문으로 바꾸세요:
/*
println(1)
println(2)
println(3)
*/
for (i in 1..3) {
    println(i)
}


// 11. 다음 while 반복문이 몇 번 반복되는지 예측하세요:
/*
var i = 0
while (i <; 4) {
    println(i)
    i++
}
*/
// => 답: 4번 (0,1,2,3이 출력됨)
var i11 = 0
while (i11 < 4) {
    println(i11)
    i11++
}


// 12. 1부터 10까지 짝수만 출력하는 코드를 작성하세요.
for (i in 1..10) {
    if (i % 2 == 0) println(i)
}


// 13. val s = "banana"에서 "a"가 몇 번 등장하는지 세는 코드를 작성하세요.
val s13 = "banana"
val countA = s13.count { it == 'a' }
println(countA) // 3


// 14. for 루프를 사용해 다음을 출력하세요: 1 4 9 16 25
for (i in 1..5) {
    print("${i * i} ")
}
println()


// 15. 다음 코드의 결과를 예측하세요.
/*
val n = 7
val result = if (n % 2 == 0) "even" else "odd"
println(result)
*/
// => 답: odd
val n15 = 7
val result15 = if (n15 % 2 == 0) "even" else "odd"
println(result15) // odd


// 16. 1부터 10까지 더한 합을 구하세요.
var sum16 = 0
for (i in 1..10) sum16 += i
println(sum16) // 55


// 17. 10에서 1까지 거꾸로 출력하는 for문을 작성하세요.
for (i in 10 downTo 1) {
    print("$i ")
}
println()