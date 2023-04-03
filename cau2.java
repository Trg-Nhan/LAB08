interface iPhuongTienDiCchuyen{
    String laytenhangSanXuat();
    void batDau();
    void tangToc();
    void dungLai();
    double layvantoc();
}
class PhuongTienDiCchuyen implements iPhuongTienDiCchuyen{

    protected String loaiPhuongTien;
    protected String hangSanXuat;
public PhuongTienDiCchuyen(String loaiPhuongTien, String hangSanXuat){
    this.loaiPhuongTien=loaiPhuongTien;
    this.hangSanXuat=hangSanXuat;
}
    @Override
    public void batDau() {
    }

    @Override
    public void tangToc() {
    }

    @Override
    public void dungLai() {   
    }
    @Override
    public String laytenhangSanXuat() {
        System.out.println("Hang san xuat: "+hangSanXuat);
        return hangSanXuat;
    }
    @Override
    public double layvantoc() {
        System.out.println("Van toc la: ");
        return 0;
    }
}
class MayBay extends PhuongTienDiCchuyen {
    private String loaiNhienLieu;
    public MayBay(String loaiPhuongTien, String hangSanXuat,String loaiNhienLieu) {
        super(loaiPhuongTien, hangSanXuat);
        this.loaiNhienLieu=loaiNhienLieu;
    }
    public String getLNL(){
        return loaiNhienLieu;
    }
    public void setLNL(String loaiNhienLieu){
        this.loaiNhienLieu=loaiNhienLieu;
    }
    public void catCanh(){
        System.out.println("Cat canh!");
    }
    public void haCanh(){
        System.out.println("Ha canh!");
    }
    @Override
    public double layvantoc() {
        System.out.println("Van toc la: ");
        return 0;
    }
}
class XeOTo extends PhuongTienDiCchuyen{
    private String loaiNhienLieu;
    public XeOTo(String loaiPhuongTien, String hangSanXuat) {
        super(loaiPhuongTien, hangSanXuat);
     this.loaiNhienLieu=loaiNhienLieu;
    }
    public String getLNL(){
        return loaiNhienLieu;
    }
    public void setLNL(String loaiNhienLieu){
        this.loaiNhienLieu=loaiNhienLieu;
    }
    @Override
    public double layvantoc() {
        System.out.println("Van toc la: ");
        return 0;
    }
}
class XeDap extends PhuongTienDiCchuyen{

    public XeDap(String loaiPhuongTien, String hangSanXuat) {
        super(loaiPhuongTien, hangSanXuat);
    }
    @Override
    public double layvantoc() {
        System.out.println("Van toc la: ");
        return 0;
    }
}
class HangSanXuat {
    private String tenHangSanXuat;
    private  String tenQuocGia;

    public HangSanXuat(String tenHangSanXuat, String tenQuocGia){
        this.tenHangSanXuat=tenHangSanXuat;
        this.tenQuocGia=tenQuocGia;
    }
    public String getTHSX(){
        return tenHangSanXuat;
    }
    public void setTHSX(String tenHangSanXuat){
        this.tenHangSanXuat=tenHangSanXuat;
    }
    public String getTQG(){
        return tenHangSanXuat;
    }
    public void setTQG(String tenQuocGia){
        this.tenQuocGia=tenQuocGia;
    }
}
public class cau2{
    public static void main(String[] args) {
        MayBay mb= new MayBay("May bay", "Vietnamairlines", "Dau");
        mb.catCanh();
        mb.haCanh();
        mb.layvantoc();

        XeOTo xo= new XeOTo("Xe o to", "Honda");
        xo.layvantoc();

        XeDap xd=new XeDap("Xe Dap", "Martin");
        xo.layvantoc();
    }
}

