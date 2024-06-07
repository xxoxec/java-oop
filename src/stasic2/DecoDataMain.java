package stasic2;

import static stasic2.DecoData.staticCall; // option/enter, 정적 메서드 import 단축키
// import static static2.DecoData.*;

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        // 추가 인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        staticCall();

        // 클래스를 통한 접근
        staticCall();
    }
}
