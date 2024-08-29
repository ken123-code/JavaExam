package Huynh_Huu_Loc;

public class cayGayChienThan extends VatPham{
    public cayGayChienThan() {
        super(0, 20, 1, 7);
    }

    public cayGayChienThan(int soXu, float csSucManh, float heSoSucManh, float soVangQuyDoiTren1SucCongPha) {
        super(0, 20, 1, 7);
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
