
import java.util.Date;


public class HopDong {
    private int IDHopDong;
    private String LoaiHopDong;
    private String NguoiMua;
    private String NguoiBan;
    private String NgayKiHopDong;
    private int GiaTriHopDong;
    private String DiaChi;
    private String ThongTinThem;
    
    public HopDong(){
    }

    public HopDong(int IDHopDong, String LoaiHopDong, String NguoiMua, String NguoiBan, String NgayKiHopDong, int GiaTriHopDong, String DiaChi, String ThongTinThem) {
        this.IDHopDong = IDHopDong;
        this.LoaiHopDong = LoaiHopDong;
        this.NguoiMua = NguoiMua;
        this.NguoiBan = NguoiBan;
        this.NgayKiHopDong = NgayKiHopDong;
        this.GiaTriHopDong = GiaTriHopDong;
        this.DiaChi = DiaChi;
        this.ThongTinThem = ThongTinThem;
    }

    public int getIDHopDong() {
        return IDHopDong;
    }

    public void setIDHopDong(int IDHopDong) {
        this.IDHopDong = IDHopDong;
    }

    public String getLoaiHopDong() {
        return LoaiHopDong;
    }

    public void setLoaiHopDong(String LoaiHopDong) {
        this.LoaiHopDong = LoaiHopDong;
    }

    public String getNguoiMua() {
        return NguoiMua;
    }

    public void setNguoiMua(String NguoiMua) {
        this.NguoiMua = NguoiMua;
    }

    public String getNguoiBan() {
        return NguoiBan;
    }

    public void setNguoiBan(String NguoiBan) {
        this.NguoiBan = NguoiBan;
    }

    public String getNgayKiHopDong() {
        return NgayKiHopDong;
    }

    public void setNgayKiHopDong(String NgayKiHopDong) {
        this.NgayKiHopDong = NgayKiHopDong;
    }

    public int getGiaTriHopDong() {
        return GiaTriHopDong;
    }

    public void setGiaTriHopDong(int GiaTriHopDong) {
        this.GiaTriHopDong = GiaTriHopDong;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getThongTinThem() {
        return ThongTinThem;
    }

    public void setThongTinThem(String ThongTinThem) {
        this.ThongTinThem = ThongTinThem;
    }
    
    
}
