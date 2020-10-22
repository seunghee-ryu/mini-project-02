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
    out.println("-> 살펴본다(search) : 자물쇠 = 1");
    out.println("--------------------------------------------------------------------------------");

    try {
      String str = Prompt.inputString("무엇을 할까?(search) ", out, in);

      if (str.equalsIgnoreCase("search")) {
        out.println("자물쇠를 확인했습니다.");
      } else {
        out.println("바로 뒤에서 인기척이 들립니다.");
      }

    } catch (Exception e) {
      out.printf("아이템 삭제 처리 중 오류 발생! - %s\n", e.getMessage());
    }


  }
}
