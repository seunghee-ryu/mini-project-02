package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;

//Command 규칙에 따라 클래스를 정의한다.
public class RullCommand implements Command {

  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    out.println("-------------------------------------------------------------------------------------------------");
    out.println("[필독]");
    out.println("룰 및 유의할 점");
    out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    out.println("아이템 사용법");
    out.println("아이템 목록을 보고싶을 때는 '/itme/list' 명령어를 입력하세요.");
    out.println("아이템을 습득할 때는 '/itme/add' 명령어를 입력하세요.");
    out.println("아이템을 사용할 때는 '/itme/use' 명령어를 입력하세요.");
    out.println("아이템을 수정할 때는 '/itme/update' 명령어를 입력하세요.");
    out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    out.println("플레이어 기록하기");
    out.println("플레이어 목록을 보고싶을 때는 '/player/list' 명령어를 입력하세요.");
    out.println("플레이어를 등록할 때는 '/player/add' 명령어를 입력하세요.");
    out.println("플레이어를 삭제할 때는 '/player/delete' 명령어를 입력하세요.");
    out.println("플레이어 정보를 수정할 때는 '/player/update' 명령어를 입력하세요.");
    out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    out.println("만약 예기치 못한 문제가 발생했다면 'quit' 명령어를 입력하셔서 처음부터 다시 시작하실 수 있습니다.");
    out.println("'quit' 명령어를 입력할 경우 데이터가 저장되지 않습니다.");
    out.println("-------------------------------------------------------------------------------------------------");
    out.println("'/move/hallway' 명령어를 이용해 복도로 이동합니다.");

  }
}