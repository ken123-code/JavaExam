package Huynh_Huu_Loc;

public abstract class VatPham extends CauBeSpon{
    private int soXu;
    private float csSucManh;
    private float heSoSucManh;
    private float soVangQuyDoiTren1SucCongPha;

    public VatPham() {
        this.soXu =0;
        this.csSucManh = 0;
        this.heSoSucManh = 0;
        this.soVangQuyDoiTren1SucCongPha = 0;
    }

    public VatPham(int soXu, float csSucManh, float heSoSucManh, float soVangQuyDoiTren1SucCongPha) {
        this.soXu = soXu;
        this.csSucManh = csSucManh;
        this.heSoSucManh = heSoSucManh;
        this.soVangQuyDoiTren1SucCongPha = soVangQuyDoiTren1SucCongPha;
    }

    public float sucCongPha(){
        return this.csSucManh*this.heSoSucManh;
    }

    public abstract float soXuCanTieu();

    public void xuat(){
        System.out.println("Chi so suc manh: "+ this.csSucManh +" -- He so suc manh: "+  this.heSoSucManh+ "-- vang da quy doi: " + this.soVangQuyDoiTren1SucCongPha);
    }

    public float getSoVangQuyDoiTren1SucCongPha() {
        return soVangQuyDoiTren1SucCongPha;
    }
}
