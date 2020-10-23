package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;

// Command 규칙에 따라 클래스를 정의한다.
public class NewPlayerCommand implements Command {

  @Override
  public void execute(PrintWriter out, BufferedReader in) {

    out.println("-------------------------------------------------------------------------------------------------");
    out.println("게임을 시작하기에 앞서 플레이어 등록을 하겠습니다.");
    out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    out.println("'/player/add' 명령어를 입력하여 플레이어를 등록해 주세요.");
    out.println("플레이 기록에는 0을 넣어 주세요.");
    out.println("플레이어 등록을 완료하셨다면 '/move/hallway' 명령어를 입력해서 게임을 시작하세요.");
    out.println("룰을 확인하고 싶다면 '/rull' 명령어를 입력하세요.");
    out.println("-------------------------------------------------------------------------------------------------");

  }
}

