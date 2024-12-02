package hu.szamalk.Modell;

public class B {
    private char[][] betu = new char[5][3];
    private char jel;

    public B(char jel) {
        this.jel = jel;
        betuRendezes();
    }

    public void betuRendezes() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                betu[i][j] = (' ');
            }
        }

        for (int i = 0; i < 5; i++) {
            betu[i][0] = jel;
        }

        betu[0][1] = jel;
        betu[0][2] = jel;
        betu[1][2] = jel;
        betu[2][1] = jel;
        betu[2][2] = jel;
        betu[3][2] = jel;
        betu[4][1] = jel;
        betu[4][2] = jel;

    }

    public void betuKirajzolas(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(betu[i][j]);
            }
            System.out.println();
        }
    }

    public int jelSzamolo(int index, boolean sor){
        int db = 0;

        if (sor){
            for (int s = 0; s < 3; s++) {
                if (betu[index][s] == jel){
                    db++;
                }
            }

        }else{
            for (int o = 0; o < 5; o++) {
                if (betu[o][index] == jel){
                    db++;
                }
            }
        }
        return db;
    }

    public boolean isTeli(int sor){
        boolean teli = false;

        while (betu.is)


//        else{
//
//            for (int o = 0; o < 5; o++) {
//                if (betu[o][index] == jel){
//                    teli = true;
//                }
//            }
//
//        }

        return teli;
    }


}




