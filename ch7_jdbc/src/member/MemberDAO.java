package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static member.JdbcUtil.*;

// 메소드 작성
// 1. 실행할 sql 구문 작성
//   - insert, update, delete => executeUpdate() => 결과값은 무조건 int
// select
//  1) 결과 값이 하나라면 : executeQuery() => ~~DTO
//  2) 결과 값이 여러개 라면 : List<~~~DTO>

public class MemberDAO {
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public int insert(MemberDTO dto) {

        con = getConnection();
        int result = 0;
        String sql = "INSERT INTO memberTBL(userid, password, name, email) ";
        sql += "VALUES(?, ?, ?, ?)";
        try {
            pstmt = con.prepareStatement(sql);
            // ? 해결
            pstmt.setString(1, dto.getUserId());
            pstmt.setString(2, dto.getPassword());
            pstmt.setString(3, dto.getName());
            pstmt.setString(4, dto.getEmail());
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }

        return result;
    }

    public MemberDTO getRow(String userId, String password) {

        con = getConnection();
        MemberDTO memberDTO = null; // 객체에 담는다

        // 개별 회원 조회
        String sql = "SELECT * FROM MEMBERTBL WHERE USERID = ? AND PASSWORD = ?"; // where 절에 PK 가 들어가 있으면 무조건 1개만 조회 or
        // 안 뜸
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, userId);
            pstmt.setString(2, password);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                memberDTO = new MemberDTO();
                memberDTO.setUserId(rs.getString("userid"));
                memberDTO.setPassword(rs.getString("password"));
                memberDTO.setName(rs.getString("name"));
                memberDTO.setEmail(rs.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return memberDTO; // 객체에 리턴 받는다

        // con = getConnection();
        // MemberDTO memberDTO = null;

        // // 개별 회원 조회
        // String sql = "SELECT * FROM MEMBERTBL WHERE USERID = ? AND PASSWORD = ?"; //
        // where 절에 PK 가 들어가 있으면 무조건 1개만 조회 or
        // // 안 뜸
        // try {
        // pstmt = con.prepareStatement(sql);
        // pstmt.setString(1, dto.getUserId());
        // pstmt.setString(2, dto.getPassword());
        // rs = pstmt.executeQuery();
        // if (rs.next()) {
        // memberDTO = new MemberDTO();
        // memberDTO.setUserId(rs.getString("userid"));
        // memberDTO.setPassword(rs.getString("password"));
        // memberDTO.setName(rs.getString("name"));
        // memberDTO.setEmail(rs.getString("email"));
        // }
        // } catch (SQLException e) {
        // e.printStackTrace();
        // } finally {
        // close(con, pstmt, rs);
        // }
        // return memberDTO;

    }

    public List<MemberDTO> getRows() {
        // 전체 회원 조회
        con = getConnection();
        String sql = "SELECT * FROM MEMBERTBL";

        List<MemberDTO> list = new ArrayList<>();

        try {
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                MemberDTO dto = new MemberDTO();
                dto.setUserId(rs.getString("userid"));
                dto.setPassword(rs.getString("password"));
                dto.setName(rs.getString("name"));
                dto.setEmail(rs.getString("email"));
                list.add(dto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return list;
    }

    public int update(String password, String userId) {
        con = getConnection();

        String sql = "UPDATE MEMBERTBL SET PASSWORD = ? WHERE USERID = ?";
        int result = 0;

        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, password);
            pstmt.setString(2, userId);
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }

    public int delete(String userId) {
        con = getConnection();

        String sql = "DELETE FROM MEMBERTBL WHERE userid = ?";
        int result = 0;

        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, userId);
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }

        return result;

    }

}
