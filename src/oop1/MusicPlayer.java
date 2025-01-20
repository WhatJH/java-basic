package oop1;

public class MusicPlayer {

    int volume = 0;
    boolean isOn = false;

    void on(){
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void off(){
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeUp(){
        volume++;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }

    void volumeDown(){
        volume--;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }

    void showStatus(){
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}

// 자기 자신의 데이터를 쓰기 때문에 외부에서 데이터를 받을 필요가 없다.
// 보라색? 멤버 변수라는 뜻