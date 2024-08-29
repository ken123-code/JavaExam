package Huynh_Huu_Loc;

import java.util.ArrayList;
import java.util.List;


public class DS_CacVatPham {
    private List<VatPham> arr;

    public DS_CacVatPham() {
        this.arr = new ArrayList<>();
    }

    public void nhap() {
        int flag = 1;
        System.out.println("1.Nhap so Xu hien co");
        CauBeSpon a = new CauBeSpon();
        a.nhap();
        while (true) {
            System.out.println("#######################");
            System.out.println("Danh sach cac vat pham co the mua: ");
            System.out.println("1.Nhan chiec bua than");
            System.out.println("2.Nhan bao tay sam set");
            System.out.println("3.Nhan hon da kich no");
            System.out.println("4.Nhan cay rieu phep thuat");
            System.out.println("5.Nhan cay gay chien than");
            System.out.println("6.Exit");
            System.out.println("###############################");
            System.out.println("Moi ban nhap lua chon");
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            flag = scanner.nextInt();

            VatPham b;

            if (flag == 1) {
                b = new chiecBuaThan();
                b.xuat();
                arr.add(b);
            } else if (flag == 2) {
                b = new baoTaySamSet();
                b.xuat();
                arr.add(b);
            } else if (flag == 3) {
                b = new honDaKichNo();
                b.xuat();
                arr.add(b);
            } else if (flag == 4) {
                b = new cayRiuPhepThuat();
                b.xuat();
                arr.add(b);
            } else if (flag == 5) {
                b = new cayGayChienThan();
                b.xuat();
                arr.add(b);
            } else {
                break;
            }
        }
    }

    public void xuat() {
        for (VatPham kh : this.arr) {
            kh.xuat();
        }
    }

    public long tongSoXu(){
        long tong = 0;
        for(VatPham vp:this.arr){
            tong+=vp.soXuCanTieu();
        }
        return tong;
    }

    public float Max(){
        float max = 0f;
        for(VatPham a: this.arr){
            if(max<a.soXuCanTieu()){
                max = a.soXuCanTieu();
            }
        }
        return max;
    }

    public void xuTieuMax() {
        System.out.println("###############################");
        System.out.println("Vat pham ton xu nhieu nhat: ");
        double max = Max();
        for (VatPham a : this.arr) {
            double kq = a.soXuCanTieu();
            if (Double.compare(max, kq) == 0) {
                a.xuat();
            }
        }
    }
}
