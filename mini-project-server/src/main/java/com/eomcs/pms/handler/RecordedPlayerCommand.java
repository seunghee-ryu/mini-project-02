package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;

// Command 규칙에 따라 클래스를 정의한다.
public class RecordedPlayerCommand implements Command {

  @Override
  public void execute(PrintWriter out, BufferedReader in) {

    out.println("-------------------------------------------------------------------------------------------------");
    out.println("'/player/detail' 명령어를 입력해서 플레이 기록을 확인합니다.");
    out.println("플레이어 이름이 기억나지 않는다면 '/player/list' 명령어를 입력해서 플레이어 이름을 확인합니다.");
    out.println("플레이 기록의 숫자가 당신이 있던 스테이지입니다.");
    out.println(" 1 : 2층 침실 /move/bedroom");
    out.println(" 2 : 2층 복도 /move/hallway");
    out.println(" 3 : 2층 서재 /move/library");
    out.println(" 4 : 1층 복도 /move/1f");
    out.println("예) 플레이 기록이 1이라면 '/move/bedroom' 명령어를 입력하세요.");
    out.println("룰을 확인하고 싶다면 '/rull' 명령어를 입력하세요.");
    out.println("-------------------------------------------------------------------------------------------------");

  }
}

