package member;

import java.util.List;
import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("================================");
            System.out.println("1. 전체 회원 조회");
            System.out.println("2. 개별 회원 조회");
            System.out.println("3. 회원 추가");
            System.out.println("4. 회원 수정");
            System.out.println("5. 회원 삭제");
            System.out.println("6. 종료");
            System.out.println("================================");

            System.out.println("메뉴 입력 >> ");
            int menu = Integer.parseInt(sc.nextLine());

            MemberDAO memberDAO = new MemberDAO();

            switch (menu) {
                case 1:
                    System.out.println("\n**** 전체 회원 조회 ****");
                    System.out.println("아이디\t비밀번호\t이름\t이메일");
                    System.out.println("======================================");
                    List<MemberDTO> list = memberDAO.getRows();
                    for (MemberDTO memberDTO : list) {
                        System.out.print("아이디 : " + memberDTO.getUserId() + "\t");
                        System.out.print("비밀번호 : " + memberDTO.getPassword() + "\t");
                        System.out.print("이름 : " + memberDTO.getName() + "\t");
                        System.out.println("이메일 : " + memberDTO.getEmail() + "\t");
                    }
                    System.out.println();
                    break;
                case 2:
                    // 아이디, 비밀번호 입력받은 후 dao 메소드 호출 결과 출력
                    System.out.print("Input Id : ");
                    String userId = sc.nextLine();
                    System.out.print("Input password : ");
                    String password = sc.nextLine();
                    // 출력받기
                    // MemberDTO readDto = new MemberDTO();
                    // readDto.setUserId(userId);
                    // readDto.setPassword(password);
                    // // 불러오기
                    // MemberDTO row = memberDAO.getRow(readDto);
                    MemberDTO row = memberDAO.getRow(userId, password);
                    // 출력하기
                    System.out.println("\n\n=== 조회 회원 정보 ===");
                    System.out.println("아이디 : " + row.getUserId());
                    System.out.println("비밀번호 : " + row.getPassword());
                    System.out.println("이름 : " + row.getName());
                    System.out.println("이메일 : " + row.getEmail());
                    System.out.println();
                    break;
                case 3:
                    System.out.println("\n**** 회원 추가 ****");
                    System.out.print("아이디 : ");
                    String newId = sc.nextLine();
                    System.out.println("비밀번호 : ");
                    String newPw = sc.nextLine();
                    System.out.println("이름 : ");
                    String newName = sc.nextLine();
                    System.out.println("이메일 : ");
                    String newEmail = sc.nextLine();

                    MemberDTO insertDto = new MemberDTO(newId, newPw, newName, newEmail);
                    System.out.println(memberDAO.insert(insertDto) > 0 ? "입력성공" : "입력실패");

                    break;
                case 4:
                    System.out.println("\n**** 회원 수정 ****");
                    System.out.print("아이디 : ");
                    String updateId = sc.nextLine();
                    System.out.print("기존 비밀번호 : ");
                    String updatePw = sc.nextLine();
                    // 아이디와 기존 비밀번호로 조회시 회원이 존재하면 수정
                    MemberDTO rowMem = memberDAO.getRow(updateId, updatePw);
                    if (rowMem == null) {
                        System.out.println("입력한 아이디와 비밀번호를 확인해 주세요");
                    } else {
                        System.out.print("변경할 비밀번호 : ");
                        String changePw = sc.nextLine();
                        int result = memberDAO.update(changePw, updateId);
                        System.out.println(result > 0 ? "수정성공" : "수정실패");
                    }
                    break;
                case 5:
                    System.out.println("\n**** 회원 삭제 ****");
                    System.out.print("아이디 : ");
                    String deleteId = sc.nextLine();
                    System.out.println("비밀번호 : ");
                    String deletePw = sc.nextLine();
                    MemberDTO delMem = memberDAO.getRow(deleteId, deletePw);
                    if (delMem == null) {
                        System.out.println("입력한 아이디와 비밀번호를 확인해 주세요");
                    } else {
                        int result = memberDAO.delete(deleteId);
                        System.out.println(result > 0 ? "회원 탈퇴 성공" : "회원 탈퇴 실패");
                    }
                    break;
                case 6:
                    run = false;
                    break;

                default:
                    break;
            }
        }
    }
}
