package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import com.eomcs.util.Prompt;

//Command 규칙에 따라 클래스를 정의한다.
public class FirstFloorCommand implements Command {

  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    out.println("--------------------------------------------------------------------------------");
    out.println("1층");
    out.println("--------------------------------------------------------------------------------");
    out.println("차가운 기운이 도는 복도는 칠흑같이 어둡다.");
    out.println("2층과는 다르게 카펫이 깔려 있어서 발소리는 나지 않는다.");
    out.println("조용히 걷는 것에 신경을 쓰지 않아도 되서 다행이라는 생각과 동시에,");
    out.println("누군가 소리 없이 따라올 수도 있다는 생각이 든다.");
    out.println("복도 건너편에 보이는 붉은 현관문은, 똑같은 색의 자물쇠로 잠겨있다.");
    out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
    out.println("무엇을 할까?");
    out.println("-> 살펴본다(search) : 자물쇠를 살핀다.");
    out.println("--------------------------------------------------------------------------------");
    while (true) {
      try {
        String str = Prompt.inputString("무엇을 할까?(search) ", out, in);

        if (str.equalsIgnoreCase("search")) {
          out.println("자물쇠를 확인했습니다.");
          out.println("자물쇠는 알파벳 아홉글자를 입력할 수 있습니다.");
          out.println(".");
          out.println(".");
          out.println("[질문]");
          out.println("하나의 TCP 접속에 전이중 통신 채널을 제공하는 컴퓨터 통신 프로토콜은 무엇인가?");
          out.println("서재와 침실에서의 답을 생각해내라.");

          String answer = Prompt.inputString("정답? ", out, in);
          if (answer.equalsIgnoreCase("websocket")) {
            out.println("자물쇠가 가벼운 찰칵 소리와 함께 열린다.");
            out.println("탈출에 성공하였습니다.");
            break;

          } else if (!answer.equalsIgnoreCase("websocket")) {
            out.println("자물쇠는 열리지 않았다.");
            out.println("뒤에서 인기척이 느껴집니다.");
            out.println("도망쳤습니다.");
            break;
          }

        } else {
          out.println("뒤에서 인기척이 느껴집니다.");
          out.println("도망쳤습니다.");
          break;
        }
      }

      catch (Exception e) {
        out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
      }
    }
  }
}
