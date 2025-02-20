package oop1;

public class MusicPlayerMain4 {

    public static void main(String[] args) {
            MusicPlayer player = new MusicPlayer();

            // 음악 플레이어 켜기
            player.on();
            // 볼륨 증가
            player.volumeUp();
            // 볼륨 증가
            player.volumeUp();
            // 볼륨 감소
            player.volumeDown();
            // 음악 플레이어 상태
            player.showStatus();
            // 음악 플레이어 끄기
            player.off();

    }
}

// 필요한 기능만 호출해서 사용하면 됨.

// 캡슐화란?
// 속성과 기능을 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공하는 것.

// MusicPlayer의 내부 코드가 변하는 경우에 다른 코드는 변경하지 않아도 된다.
// 캡슐처럼 쌓여있기 때문에 안에만 바꾸면 된다 !
// 데이터랑 데이터를 사용하는 기능이 뭉쳐있기에 가능하다
// ex. 자동차 ( 속도 → 속성/ 엑셀을 밟는다 → 기능)
