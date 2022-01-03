
import java.sql.*;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;


public class ConnectionSQL {
    static String url="jdbc:mysql://localhost:3306/batdongsan";
    static String user="root";
    static String password="";
    public static Connection getConnection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return conn;
    }
    public static List<HopDong>findAll(){
        List<HopDong>hopdongList=new ArrayList<>();
        String query = "SELECT*FROM hopdong";
        try{
            Connection conn =getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                 HopDong st = new HopDong(rs.getInt("IDHopDong"), rs.getString("LoaiHopDong"), rs.getString("NguoiMua"), 
                        rs.getString("NguoiBan"), rs.getString("NgayKiHopDong"), rs.getInt("GiaTriHopDong"), 
                        rs.getString("DiaChi"), rs.getString("ThongTinThem"));
                hopdongList.add(st);
            }
        } catch (Exception e){
        }
        return hopdongList;
    }
    
    public static void Insert(HopDong st){
        String query = "INSERT INTO hopdong(IDHopDong, LoaiHopDong, NguoiMua, NguoiBan, NgayKiHopDong, GiaTriHopDong, DiaChi, thongTinThem) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, st.getIDHopDong());
            pstmt.setString(2, st.getLoaiHopDong());
            pstmt.setString(3, st.getNguoiMua());
            pstmt.setString(4, st.getNguoiBan());
            pstmt.setString(5, st.getNgayKiHopDong());
            pstmt.setInt(6, st.getGiaTriHopDong());
            pstmt.setString(7, st.getDiaChi());
            pstmt.setString(8, st.getThongTinThem());
            pstmt.execute();
        } catch (Exception e){
        }
    }
    public static void Delete(HopDong st){
        String query = "DELETE FROM hopdong WHERE IDHopDong = '"+st.getIDHopDong()+"'";
        try {
            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.executeUpdate();
        } catch (Exception e){
        }
    }
    public static void Update(HopDong st){
        String query = "UPDATE hopdong set IDHopDong=?, LoaiHopDong=?, NguoiMua=?, NguoiBan=?, NgayKiHopDong=?, GiaTriHopDong=?, DiaChi=?, ThongTinThem=? WHERE IDHopDong='"+st.getIDHopDong()+"'";
        try{
            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, st.getIDHopDong());
            pstmt.setString(2, st.getLoaiHopDong());
            pstmt.setString(3, st.getNguoiMua());
            pstmt.setString(4, st.getNguoiBan());
            pstmt.setString(5, st.getNgayKiHopDong());
            pstmt.setInt(6, st.getGiaTriHopDong());
            pstmt.setString(7, st.getDiaChi());
            pstmt.setString(8, st.getThongTinThem());
            pstmt.executeUpdate();
        } catch (Exception e){
        }
    }
    public static List<HopDong> Search(HopDong s){
        List<HopDong>hopdongl=new ArrayList<>();
        String query = "SELECT*FROM hopdong WHERE hopdong.NguoiBan='"+s.getNguoiBan()+"'";
        try{
            Connection conn =getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                 HopDong st = new HopDong(rs.getInt("IDHopDong"), rs.getString("LoaiHopDong"), rs.getString("NguoiMua"), 
                        rs.getString("NguoiBan"), rs.getString("NgayKiHopDong"), rs.getInt("GiaTriHopDong"), 
                        rs.getString("DiaChi"), rs.getString("ThongTinThem"));
                hopdongl.add(st);
            }
        } catch (Exception e){
        }
        return hopdongl;
        }
}
