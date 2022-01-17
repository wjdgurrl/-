import java.util.Locale;

public class Hello
{
    public static void main(String[] args)
    {
        String a = "Hello Java";
        String b = "Hello Java";
        String c = "a:b:c:d";
        System.out.println("1.equals = "+a.equals(b)); // 문자열이 서로 같은지 비교, ==는 문자열일 경우 다름

        System.out.println("2.indexOf = "+a.indexOf("Java")); // a.indexOf("~"); 문자열의 있는곳의 인덱스 출력

        System.out.println("3.contains = "+a.contains("Java")); // 문자열에 해당 문자열이 있는지 여부 확인, true 출력

        System.out.println("4.charAt = "+a.charAt(6)); //해당 인덱스에 있는 문자 출력

        System.out.println("5.replaceAll(\"\",\"\") = "+a.replaceAll("Java","World")+"\n"); // 문자열 교체 java -> World
        System.out.println("6.substring(index,index) = "+a.substring(0,4)); // 문자열중 특정부분 추출, Hell 출력
        System.out.println("7.toUpperCase() = "+a.toUpperCase()); // 문자열을 모두 대문자로 변경
        String result[] = c.split(":"); // 문자열을 특정 구분자로 분리
        System.out.println("8.split = "+result[0]+result[1]+result[2]+result[3]); // 이럴경우 {"a","b","c","d"}문자열 배열을 만듬



    }
}


//public = 메소드 접근 제어자 , public 사용시 클래스의 이름과 파일명이 동일해야 한다. a.java = public class a
//String[] = 문자열 배열
//args 문자열 배열의 변수
//main 메소드는 실행시키기 위해 필수적인 메소드

