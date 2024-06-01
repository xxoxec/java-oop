package oop1;

public class MusicPlayerMain3 {

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        // 음악 플레이어 켜기
        player.on();
        // 볼륨 UP
        player.volumeUp();
        // 볼륨 UP
        player.volumeUp();
        // 볼륨 DOWN
        player.volumeDown();
        // 음악 플레이어 상태
        player.showStatus();
        // 음악 플레이어 종료
        player.off();
    }
}
