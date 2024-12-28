package FacadePattern;

public class Have_FacadePattern {
    public static void main(String[] args) {
        // Sử dụng Facade để thiết lập hệ thống rạp chiếu phim
        HomeTheaterFacade homeTheater = new Have_FacadePattern().new HomeTheaterFacade();
        homeTheater.watchMovie("Interstellar");
        homeTheater.endMovie();
    }

    // Facade Class
    class HomeTheaterFacade {
        private TV tv;
        private SoundSystem soundSystem;
        private NetflixApp netflix;

        public HomeTheaterFacade() {
            this.tv = new TV();
            this.soundSystem = new SoundSystem();
            this.netflix = new NetflixApp();
        }

        public void watchMovie(String movie) {
            System.out.println("Setting up your home theater...");
            tv.turnOn();
            tv.switchToHDMI();
            soundSystem.turnOn();
            soundSystem.setVolume(20);
            netflix.login();
            netflix.playMovie(movie);
            System.out.println("Enjoy your movie!");
        }

        public void endMovie() {
            System.out.println("Shutting down the home theater...");
            System.out.println("TV is turned OFF.");
            System.out.println("Sound System is turned OFF.");
        }
    }

    // Các Subsystems (Hệ thống con)
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