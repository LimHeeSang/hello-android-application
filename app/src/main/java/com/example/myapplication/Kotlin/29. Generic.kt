package com.example.myapplication.Kotlin

// 29. Generic(제너릭)
// 목적: 다양한 타입의 객체들을 다루는 메소드나 컬렉션
//       클래스에서 컴파일 시에 타입을 체크해주는 기능
// -제너릭은 만들기 어렵고 실제로 만들일 거의 없이 깨문에 사용하는 방법만 숙지한다.

fun main(args:Array<String>){
    // 제너릭을 사용하지 않은 경우
    val list1 = listOf(1, 2, 3, "가")
    val b: String = list1[2].toString() // 형반환(타입변환)

    // 제너릭을 사용하는 경우 -> 타입이 안전하다.
    val list2 = listOf<String>("a", "b", "c")
    val c: String = list2[2] //String이라는 것을 보장 받는다

    //강한 타입을 체크할 수 있다
    val list3 = listOf(1, 2, 3, 4, "가", "나", 3.0)
    val list4 = listOf(1, 2, 3, "가") //강한 타입 체크

    // 제너릭을 사용하지 않은 경우
    val list5 = listOf<Any>(1, 2, 3, "가") // -> Any
    // 부모: Any
    // 자식 : String, Int, Flost
}