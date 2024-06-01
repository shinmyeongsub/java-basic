package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        on(data); // 음악 플레이어 실행
        volumeUp(data); // 볼륨 up
        volumeUp(data); // 볼륨 up
        volumeDown(data); // 볼륨 down
        showStatus(data); // 상태 보기
        off(data); // 음악 플레이어 종료
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data) {
        // 음악 플레이어 끄기
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data) {
        // 볼륨 증가
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        // 볼륨 감소
        data.volume--;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }

    static void showStatus(MusicPlayerData data){
        // 음악 플레이어 상태
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + data.volume);
        } else {
            // 음악 플레이어 OFF
            System.out.println("음악 플레이어 OFF");
        }
    }
}
