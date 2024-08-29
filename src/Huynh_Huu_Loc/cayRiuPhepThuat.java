package Huynh_Huu_Loc;

public class cayRiuPhepThuat extends VatPham{
    public cayRiuPhepThuat() {
        super(0, 30F, 1.5F, 10);
    }

//    public cayRiuPhepThuat(float csSucManh, float heSoSucManh, float soVangQuyDoiTren1SucCongPha) {
//        super(30F, 1.5F, 10);
//    }

    public cayRiuPhepThuat(int soXu, float csSucManh, float heSoSucManh, float soVangQuyDoiTren1SucCongPha) {
        super(soXu, 30F, 1.5F, 10);
    }

    @Override
    public float soXuCanTieu() {
        return  this.sucCongPha()*this.getSoVangQuyDoiTren1SucCongPha();
    }
    @Override
    public void xuat(){
        super.xuat();
    }
}
