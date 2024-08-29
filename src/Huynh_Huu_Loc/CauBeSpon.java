package Huynh_Huu_Loc;

public class CauBeSpon {
    private int soXu;

    public void nhap(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Nhap so Xu: ");
        this.soXu = scanner.nextInt();
    }

    public int getSoXu() {
        return soXu;
    }

    public void setSoXu(int soXu) {
        this.soXu = soXu;
    }
}
