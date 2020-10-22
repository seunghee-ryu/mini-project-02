package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;

// Command 규칙에 따라 클래스를 정의한다.
public class EntryCommand implements Command {

  @Override
  public void execute(PrintWriter out, BufferedReader in) {

    out.println("-------------------------------------------------------------------------------------------------");
    out.println("게임을 시작하기에 앞서 플레이어 등록을 하겠습니다.");
    out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    out.println("새로 시작하는 플레이어라면");
    out.println("'/player/add' 명령어를 입력하세요.");
    out.println("플레이어 등록을 완료하셨다면 '/move/hallway' 명령어를 입력하세요.");
    out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    out.println("기존에 플레이 기록을 가지고 있는 플레이어라면");
    out.println("'/player/list' 명령어를 입력해서 플레이 기록을 확인하세요.");
    out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    out.println("플레이 기록의 숫자가 당신이 있던 스테이지입니다.");
    out.println(" 1 : 2층 침실 /move/bedroom");
    out.println(" 2 : 2층 복도 /move/hallway");
    out.println(" 3 : 2층 서재 /move/library");
    out.println(" 4 : 1층 복도 /move/1f");
    out.println("예) 플레이 기록이 1이라면 '/move/bedroom' 명령어를 입력하세요.");
    out.println("-------------------------------------------------------------------------------------------------");

  }
}

