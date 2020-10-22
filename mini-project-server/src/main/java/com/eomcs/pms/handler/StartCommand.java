package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;

// Command 규칙에 따라 클래스를 정의한다.
public class StartCommand implements Command {

  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    out.println("-------------------------------------------------------------------------------------------------");
    out.println("연쇄살인마가 살고 있다는 소문의 버려진 건물.");
    out.println("모든 벽과 방이 붉은 색으로 칠해져 있어 사람들은 모두 이 건물을 ‘붉은 집’이라 부른다.");
    out.println("늘 난 이 소문의 정체를 파헤치겠다는 친구 진영이에게 못 이겨 함께 이 붉은 집에 들어가기로 하였다.");
    out.println("지금은 11시이고 만나기로 한 시간은 새벽 3시...");
    out.println("진영이가 전화번호를 알고 있어 약속 시각에 맞춰 깨워줄 거라는 생각에 그만 잠들어버렸다.");
    out.println(".");
    out.println(".");
    out.println(".");
    out.println(".");
    out.println(".");
    out.println("나를 깨운 괘종시계와 침대만 덩그러니 놓여 있는 이 방은, 벽과 천장이 모두 피처럼 붉은색이다.");
    out.println("방 뒤쪽에는 작은 문이 하나 보인다. 옷장으로 통하는 문일까?");
    out.println("붉은색으로 칠해져 있는 벽, 음산한 소리의 괘종시계.");
    out.println("모두 소문의 집과 똑같다.");
    out.println(".");
    out.println(".");
    out.println(".");
    out.println(".");
    out.println(".");
    out.println("진영이는 어디 있지?");
    out.println("그 전에, 나는 이 집에 혼자 있을까?");
    out.println("'/entry' 명령어를 입력하세요.");
    out.println("-------------------------------------------------------------------------------------------------");

  }
}
