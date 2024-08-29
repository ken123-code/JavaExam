package Huynh_Huu_Loc;

public class baoTaySamSet extends VatPham{

    public baoTaySamSet() {
        super(0, 30, 1, 7);
    }

    public baoTaySamSet(int soXu, float csSucManh, float heSoSucManh, float soVangQuyDoiTren1SucCongPha) {
        super(soXu, 30, 1, 7);
    }

//    public baoTaySamSet(float csSucManh, float heSoSucManh, float soVangQuyDoiTren1SucCongPha) {
//
//    }

    @Override
    public float soXuCanTieu() {
        return  this.sucCongPha()*this.getSoVangQuyDoiTren1SucCongPha();
    }

    @Override
    public void xuat(){
        super.xuat();
    }
}
