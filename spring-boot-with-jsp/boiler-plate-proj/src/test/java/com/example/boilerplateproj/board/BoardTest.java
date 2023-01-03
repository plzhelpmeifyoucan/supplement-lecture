package com.example.boilerplateproj.board;

import com.example.boilerplateproj.domain.board.entity.Board;
import com.example.boilerplateproj.domain.board.service.BoardService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

@SpringBootTest
public class BoardTest {

    @Autowired
    private BoardService service;

    @Test
    public void writeTest () throws Exception {
        // DB Query 일절 신경쓰지 않고
        // 아래 엔티티 정보를 DB에 넣겠다.
        // 그리고 알아서 Query를 생성해서 보내는 모습을 볼 수 있음
        // Hibernate: insert into test_board
        // (content, reg_date, title, writer, board_no) values (?, ?, ?, ?, ?)
        Board board = new Board("제목3", "본문3", "작성자4");
        service.register(board);
    }
}
