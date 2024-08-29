package Huynh_Huu_Loc;

public class chiecBuaThan extends VatPham {

    public chiecBuaThan() {
        super(0, 25, 2, 10);
    }

    public chiecBuaThan(int soXu, float csSucManh, float heSoSucManh, float soVangQuyDoiTren1SucCongPha) {
        super(soXu, 25, 2, 10);
    }

//    public chiecBuaThan(float csSucManh, float heSoSucManh, float soVangQuyDoiTren1SucCongPha) {
//        super(25, 2, 10);
//    }

    @Override
    public float soXuCanTieu() {
//        if(getSoXu()>0){
//            return getSoXu() - this.sucCongPha()*this.soXuCanTieu();
//        } else {
//            System.out.println("Chi con lai: " + getSoXu() + "Moi ban mua vat pham khac !");
//            return getSoXu();
//        }
        return  this.sucCongPha()*this.getSoVangQuyDoiTren1SucCongPha();
    }
    @Override
    public void xuat(){
        super.xuat();
    }

    public void soTienXuConLai(){

    }
}
