public class Munka {
    static int villamos(int[] felszallok, int megallok) {
        int aktualis = 0;
        for (int i = 0; i < megallok; i++) {
            aktualis = aktualis + felszallok[i];
            if (aktualis < 0) {
                return 0;
            }
        }
        return 1;
    }
}
