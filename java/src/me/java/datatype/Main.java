package me.java.datatype;

public class Main {
    public static void main(String[] args) {
        // 리터럴 (literal): 데이터 수
        // 자로형 (datatype)
        // 원시형 (primitive type): 스택 공간
        // int (4byte == 32bit)
        // float(4byte)
        // double(8byte)
        // char(2byte)
        // 1byte = 8bit
        // ________
        // 참조형 (reference type): 힙 공간
        // String

        // 작은 발은 큰 신발에 들어갈 수 있음
        // 작은 리터럴은 큰 변수공간에는 들어갈 수 있음
        byte b = (byte)100000; // type casting (명시적 형변환)
        short s = (short)100000; // type casting (명시적 형변환)
        int i = 10; // 정수의 기본 단위
        long l = 10; // promotion (자동 형변환)
        float f = 3.14f; //f, F 상관없음
        double d = 3.13; // 실수의 기본 단위

        // 쓰레기값 예제
        byte var1 = 125; // -128 ~ 127
        int var2 = 125;

        for (int j=0; j<5; j++) {
            var1++; // var1 = var1 + 1
            var2++; // var2 = var2 + 1
            System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
        }
        System.out.println("var2 : " + var2); // var2 : 130 (Promotion)
        // 문자열 + 문자열 = 문자열의 결합 "a" + "b" = "ab"
        // 문자열 + 정수 = 문자열의 결합 "a" + 130 = "a130"
    }
}
