package exam;

import java.time.LocalDateTime;

public class Board {
    // 번호, 제목, 내용, 작성자, 작성날짜, 수정날짜
    private int boardNo;
    private String boardName;
    private String boardN;
    private String boardPoster;
    private LocalDateTime regDate;
    private LocalDateTime lastModifedDate;

    
    public Board() {

    }
    public Board(int boardNo, String boardName, String boardN, String boardPoster) 
    {
        this.boardNo = boardNo;
        this.boardN = boardN;
        this.boardName = boardName;
        this.boardPoster = boardPoster;
    }
}
