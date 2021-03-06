// 연결 정보 확인
package advance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import util.ConnectionFactory;

public class Exam01 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionFactory.getConnection();
			// SQL 실행 과정
			// SQL 추가하기 : insert
			String sql = "insert into t86_board(no, title, writer, content) "
					   + " values(s86_board_no.nextval, 'jdbc테스트', '테스터', 'jdbc insert 테스트')";
			
			// SQL 실행 객체 준비
			pstmt = con.prepareStatement(sql);
			
			// SQL 실행하기 
			// select절		: executeQuery : ResultSet반환
			// 비 select 절	: executeUpdate : int반환
			int cnt = pstmt.executeUpdate();
			
			// 결과처리
			System.out.println(cnt+"개의 행이 변경됨");
			
			
//			sql = "select * from t86_board;";
//			ResultSet rs = pstmt.executeQuery();


			} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection(pstmt, con);
		}
	}
}
