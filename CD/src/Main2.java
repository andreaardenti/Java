public class Main2 {

    public static void main(String[] args) {
        String[] tracks = {"TRACK1", "TRACK2", "TRACK3", "TRACK4", "TRACK5"};
        CD cd1 = new CD(tracks);

        Reader r = new Reader();
        r.insertCD(cd1);
        r.currentCD();
        r.play(3);

        System.out.println(r.play(2));

        r.removeCD();
        r.currentCD();
        System.out.println(r.currentCD());
    }
}
