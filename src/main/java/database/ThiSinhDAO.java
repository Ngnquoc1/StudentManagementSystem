package database;

import Model.ThiSinh;
import Model.Tinh;

import java.sql.*;
import java.util.ArrayList;

public class ThiSinhDAO implements DAOInterface<ThiSinh> {
    public ThiSinhDAO() {};
    public ThiSinhDAO getInstance() {
        return new ThiSinhDAO();
    }

    @Override
    public int insertDB(ThiSinh ts) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        DatabaseConnection db=null;
        try {
            db= DatabaseConnection.getInstance();
            conn = db.getConnectionn();
            String sql = "INSERT INTO \"ThiSinh\" (\"TSId\", \"TSName\", \"TinhID\", \"TSDate\", \"TSSex\", \"TSscore1\", \"TSscore2\", \"TSscore3\") " +
                    "VALUES (?, ?, ?, TO_DATE(?, 'YYYY-MM-DD'), ?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, ts.getMaThiSinh());
            pstmt.setString(2, ts.getTenThiSinh());
            pstmt.setInt(3, ts.getQueQuan().getMaTinh());

            java.sql.Date sqlDate = new java.sql.Date(ts.getNgaySinh().getTime());
            pstmt.setString(4, sqlDate.toString()); // Đảm bảo định dạng DATE hợp lệ

            pstmt.setInt(5, ts.isGioiTinh() ? 1 : 0);
            pstmt.setDouble(6, ts.getDiemMon1());
            pstmt.setDouble(7, ts.getDiemMon2());
            pstmt.setDouble(8, ts.getDiemMon3());

            int ans= pstmt.executeUpdate();
            return ans;
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        } finally {
            if (pstmt != null) try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }
///            if (conn != null) try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }
//            if (db != null) try { db.disconnect(); } catch (Exception e) { e.printStackTrace(); }
        }
    }



    @Override
    public int updateDB(ThiSinh ts) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        DatabaseConnection db = null;

        try {
            db = DatabaseConnection.getInstance();
            conn = db.getConnectionn();

            // Câu lệnh UPDATE thay vì INSERT
            String sql = "UPDATE \"ThiSinh\" " +
                    "SET \"TSName\" = ?, \"TinhID\" = ?, \"TSDate\" = TO_DATE(?, 'YYYY-MM-DD'), " +
                    "\"TSSex\" = ?, \"TSscore1\" = ?, \"TSscore2\" = ?, \"TSscore3\" = ? " +
                    "WHERE \"TSId\" = ?";

            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, ts.getTenThiSinh());
            pstmt.setInt(2, ts.getQueQuan().getMaTinh());

            java.sql.Date sqlDate = new java.sql.Date(ts.getNgaySinh().getTime());
            pstmt.setString(3, sqlDate.toString()); // Đảm bảo định dạng DATE hợp lệ

            pstmt.setInt(4, ts.isGioiTinh() ? 1 : 0);
            pstmt.setDouble(5, ts.getDiemMon1());
            pstmt.setDouble(6, ts.getDiemMon2());
            pstmt.setDouble(7, ts.getDiemMon3());
            pstmt.setString(8, ts.getMaThiSinh()); // Điều kiện WHERE để xác định đúng thí sinh cần cập nhật

            int ans = pstmt.executeUpdate();
            return ans;
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        } finally {
            if (pstmt != null) try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }
            // Không đóng connection nếu đang dùng Singleton
        }
    }


    @Override
    public int deleteDB(ThiSinh ts) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        DatabaseConnection db = null;

        try {
            db = DatabaseConnection.getInstance();
            conn = db.getConnectionn();

            // Câu lệnh DELETE
            String sql = "DELETE FROM \"ThiSinh\" WHERE \"TSId\" = ?";

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, ts.getMaThiSinh()); // Xóa theo mã TSId

            int ans = pstmt.executeUpdate();
            return ans; // Trả về số dòng bị xóa
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        } finally {
            if (pstmt != null) try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }
            // Không đóng connection vì dùng Singleton
        }
    }

    @Override
    public ArrayList<ThiSinh> getFromRs(ResultSet rs) throws SQLException {
        ArrayList<ThiSinh> dsThiSinh = new ArrayList<>();

        try {
            while (rs.next()) {
                ThiSinh ts = new ThiSinh();
                ts.setMaThiSinh(rs.getString("TSId"));
                ts.setTenThiSinh(rs.getString("TSName"));
                ts.setQueQuan(Tinh.getTinhById(rs.getInt("TinhID")));
                ts.setNgaySinh(rs.getDate("TSDate"));
                ts.setGioiTinh(rs.getInt("TSSex") == 1);
                ts.setDiemMon1((float) rs.getDouble("TSscore1"));
                ts.setDiemMon2((float) rs.getDouble("TSscore2"));
                ts.setDiemMon3((float) rs.getDouble("TSscore3"));
                dsThiSinh.add(ts);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return dsThiSinh;
    }

    @Override
    public ArrayList<ThiSinh> selectAllDB() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        Statement  stmt = null;
        ResultSet rs = null;
        DatabaseConnection db = null;
        ArrayList<ThiSinh> dsThiSinh = new ArrayList<>();

        try {
            db = DatabaseConnection.getInstance();
            conn = db.getConnectionn();

            String sql1 = "SELECT * FROM \"ThiSinh\"";

            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql1);
//            String sql = "SELECT ? FROM \"ThiSinh\"";
//            pstmt = conn.prepareStatement(sql);
//            pstmt.setString(1,"*");
//            rs = pstmt.executeQuery();
            dsThiSinh=getFromRs(rs);
            System.out.println(dsThiSinh);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }
            if (pstmt != null) try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
        return dsThiSinh;
    }

    @Override
    public ArrayList selectByID(String id) {
        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        DatabaseConnection db=null;
        ArrayList<ThiSinh> dsThiSinh = new ArrayList<>();
        try{
            db=DatabaseConnection.getInstance();
            conn=db.getConnectionn();
            String sql="SELECT * FROM \"ThiSinh\" WHERE \"TSId\" = ?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,id);
            rs=pstmt.executeQuery();
            dsThiSinh=getFromRs(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }
            if (pstmt != null) try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
        return dsThiSinh;
    }

    @Override
    public ArrayList<ThiSinh> selectByCondition(String condition) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        DatabaseConnection db = null;
        ArrayList<ThiSinh> dsThiSinh = new ArrayList<>();

        try {
            db = DatabaseConnection.getInstance();
            conn = db.getConnectionn();
            String sql = "SELECT * FROM \"ThiSinh\" WHERE " + condition;
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            dsThiSinh = getFromRs(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }
            if (stmt != null) try { stmt.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
        return dsThiSinh;
    }
}
