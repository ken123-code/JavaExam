package Huynh_Huu_Loc;

public class honDaKichNo extends VatPham{
    public honDaKichNo() {
        super(0, 40, 2, 12);
    }

    public honDaKichNo(int soXu, float csSucManh, float heSoSucManh, float soVangQuyDoiTren1SucCongPha) {
        super(soXu, 40, 2, 12);
    }

//    public honDaKichNo(float csSucManh, float heSoSucManh, float soVangQuyDoiTren1SucCongPha) {
//        super(40, 2, 12);
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
