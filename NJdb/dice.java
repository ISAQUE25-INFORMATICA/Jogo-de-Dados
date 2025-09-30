public class dice {
    int face1, face2;

    public int getFace1() {
        return face1;
    }
    public void setFace1(int face1) {
        this.face1 = face1;
    }
    public int getFace2() {
        return face2;
    }
    public void setFace2(int face2) {
        this.face2 = face2;
    }
    public int somaDD(){
        int somaDD=0, i;
        for(i=1;i<=2;i++){
            somaDD += (int)(Math.random() *6 + 1);
        }
        return somaDD;
    }
}
