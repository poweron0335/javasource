package book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static book.JdbcUtil.*;

// ~~DAO : 자바와 데이터베이스와 연결하는 객체
//         데이터베이스 담당 객체

// static{} : 클래스가 메모리에 처음 로딩될 때 한 번만 수행
public class BookDAO {

    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    // public Connection getConnection() {
    // Connection con = null;

    // // 2. 커넥션 얻기
    // String url = "jdbc:oracle:thin:@localhost:1521:xe";
    // String user = "c##test2";
    // String password = "test";
    // try {
    // con = DriverManager.getConnection(url, user, password);
    // } catch (SQLException e) {
    // e.printStackTrace();
    // }
    // return con;
    // }

    // public void close(Connection con, PreparedStatement pstmt) {
    // try {
    // if (pstmt != null) {
    // pstmt.close();
    // }
    // if (con != null) {
    // con.close();
    // }
    // } catch (Exception e) {
    // e.printStackTrace();
    // }
    // }

    // public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
    // try {
    // if (rs != null)
    // rs.close();
    // if (pstmt != null)
    // pstmt.close();
    // if (con != null)
    // con.close();
    // } catch (Exception e) {
    // e.printStackTrace();
    // }
    // }

    // C(insert) R(select) U(update) D(delete)
    public int insert(BookDTO dto) { // result가 int고 return 할 거기 때문에 public int
        con = getConnection();
        int result = 0;
        String sql = "INSERT INTO BOOKTBL(code, title, writer, price) VALUES(?, ?, ?, ?)"; // => VALUES(?, ...) = 입력받아
                                                                                           // 처리할 거라는 의미
        try {
            pstmt = con.prepareStatement(sql);
            // ? 처리
            pstmt.setInt(1, dto.getCode());
            pstmt.setString(2, dto.getTitle());
            pstmt.setString(3, dto.getWriter());
            pstmt.setInt(4, dto.getPrice());
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }

    public BookDTO getRow(int code) {
        // 하나만 조회되는
        con = getConnection();
        String sql = "SELECT * FROM BOOKTBL WHERE code = ?"; // ? = 뭐가 들어올 지 모르지만 자리 잡는 개념
        BookDTO dto = null;
        try {
            pstmt = con.prepareStatement(sql);
            // ?에 대한 처리
            pstmt.setInt(1, code); // code가 NUMBER 타입이기 때문에 setInt, 1 ==> 1번 물음표
            rs = pstmt.executeQuery(); // rs의 값은 무조건 닫아야하기 때문에 DTO를 이용하여 rs 복사후 main에 전달
            // rs => BookDTO 옮겨 담기
            if (rs.next()) { // 어처피 하나만 나오기 때문에 if를 사용해서 한 번 조회
                // int code1 = rs.getInt("code");
                // String title = rs.getString("title");
                // String writer = rs.getString("writer");
                // int price = rs.getInt("price");
                dto = new BookDTO(); // dto 불러오기
                dto.setCode(rs.getInt("code"));
                dto.setTitle(rs.getString("title"));
                dto.setWriter(rs.getString("writer"));
                dto.setPrice(rs.getInt("price"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return dto;
    }

    public List<BookDTO> getRows() {
        // 여러개 조회되는
        con = getConnection();
        String sql = "SELECT * FROM BOOKTBL";

        List<BookDTO> list = new ArrayList<>();

        try {
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                // 행 하나 => BookDTO 로 생성
                BookDTO dto = new BookDTO();
                dto.setCode(rs.getInt("code"));
                dto.setTitle(rs.getString("title"));
                dto.setWriter(rs.getString("writer"));
                dto.setPrice(rs.getInt("price"));
                // BookDTO 리스트에 추가
                list.add(dto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return list;
    }

    public int update(BookDTO dto) {
        con = getConnection();
        int result = 0;

        String sql = "UPDATE BOOKTBL SET PRICE = ? WHERE CODE = ?";
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, dto.getPrice());
            pstmt.setInt(2, dto.getCode());
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }

        return result;
    }

    public int delete(int code) {
        con = getConnection();
        int result = 0;

        String sql = "DELETE FROM BOOKTBL WHERE code = ?";
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, code);
            result = pstmt.executeUpdate();
        } catch (SQLException e) {

            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }
}
