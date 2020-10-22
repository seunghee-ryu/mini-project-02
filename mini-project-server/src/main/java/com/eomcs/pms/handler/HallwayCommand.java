package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;

//Command 규칙에 따라 클래스를 정의한다.
public class HallwayCommand implements Command {

  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    out.println("--------------------------------------------------------------------------------");
    out.println("복도");
    out.println("--------------------------------------------------------------------------------");
    out.println("조심스레 나온 복도는 적막이 감돈다.");
    out.println("살금살금 발걸음을 내딛는 발밑에서는 오래된 판자가 삐걱거린다.");
    out.println("복도 양쪽에는 문이 있다.");
    out.println("문 앞에는 색이 바랜 팻말에 '침실'과 '서재'라고 삐뚤빼뚤한 글씨가 쓰여있다.");
    out.println("복도 한쪽 끝에는 내려가는 계단 난간이 어렴풋이 보인다.");
    out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
    out.println("무엇을 할까?");
    out.println("-> 이동(move) - 침실");
    out.println("->            - 침실로 이동하려면 '/move/bedroom'를 입력하세요");
    out.println("-> 이동(move) - 서재");
    out.println("->            - 서재로 이동하려면 '/move/library'를 입력하세요");
    out.println("-> 이동(move) - 1층");
    out.println("->            - 1층로 이동하려면 '/move/1f'를 입력하세요");
    out.println("--------------------------------------------------------------------------------");

  }
}
