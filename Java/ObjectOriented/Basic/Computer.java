package ObjectOriented.Basic;



public class Computer {
    public static void main(String[] args) {
        myComputer obj = new myComputer();
        obj.playMusic();
        String str = obj.getPen(12);
        System.out.println(str);
    }

    static class myComputer {
        public void playMusic() {
            System.out.println("Music Playing");
        }

        public String getPen(int cost) {
            if (cost >= 10) {
                return "Pen";
            } else {
                return "Nothing";
            }
        }
    }
}
