public class Reader {

    public CD currentCD;

    public void insertCD(CD x) {
        this.currentCD = x;
    }

    public void removeCD() {
        this.currentCD = null;
    }

    public boolean currentCD() {
        if (this.currentCD==null) {
            System.out.println("CD non presente");
            return false;
        } else {
            System.out.println("CD presente");
            return true;
            }
    }

    public String play (int  i) {
        return this.currentCD.tracks[i];
    }
}