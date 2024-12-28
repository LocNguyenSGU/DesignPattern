package FacadePattern;

public class None_FacadePattern {
    public static void main(String[] args) {
        System.out.println("== Without Facade Pattern ==");

        // Tạo đối tượng của từng hệ thống con
        TV tv = new None_FacadePattern().new TV();
        SoundSystem soundSystem = new None_FacadePattern().new SoundSystem();
        NetflixApp netflix = new None_FacadePattern().new NetflixApp();

        // Xem phim: Từng bước phải được thực hiện thủ công
        System.out.println("Setting up your home theater...");
        tv.turnOn();
        tv.switchToHDMI();
        soundSystem.turnOn();
        soundSystem.setVolume(20);
        netflix.login();
        netflix.playMovie("Interstellar");
        System.out.println("Enjoy your movie!");

        // Kết thúc phim
        System.out.println("Shutting down the home theater...");
        System.out.println("TV is turned OFF.");
        System.out.println("Sound System is turned OFF.");
    }

    class TV {
        public void turnOn() {
            System.out.println("TV is turned ON.");
        }

        public void switchToHDMI() {
            System.out.println("TV switched to HDMI input.");
        }
    }

    class SoundSystem {
        public void turnOn() {
            System.out.println("Sound System is turned ON.");
        }

        public void setVolume(int level) {
            System.out.println("Sound System volume set to " + level);
        }
    }

    class NetflixApp {
        public void login() {
            System.out.println("Logged in to Netflix.");
        }

        public void playMovie(String movie) {
            System.out.println("Now playing: " + movie);
        }
    }
}
