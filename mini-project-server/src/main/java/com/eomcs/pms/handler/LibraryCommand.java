package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import com.eomcs.util.Prompt;

//Command 규칙에 따라 클래스를 정의한다.
public class LibraryCommand implements Command {

  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    out.println("--------------------------------------------------------------------------------");
    out.println("[서재]");
    out.println("--------------------------------------------------------------------------------");
    out.println("서재에는 책이 가득 찬 책장이 있다.");
    out.println("그 옆에는 책 읽기에 적당해 보이는 푹신한 의자도 하나 있다.");
    out.println("의자 옆에는 먼지가 두껍게 쌓인 램프가 하나 있다.");
    out.println("책을 열어본 지 오래된 듯한 퀴퀴한 냄새가 방 안에 진동한다.");
    out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
    out.println("무엇을 할까?");
    out.println("-> 살펴본다(search) : 1 = 책장, 2 = 의자, 3 = 램프");
    out.println("-> 이동(move) - 복도");
    out.println("->            - 복도로 이동하려면 '/move/hallway'를 입력하세요");
    out.println("--------------------------------------------------------------------------------");

    while (true) {
      try {
        String str = Prompt.inputString("무엇을 할까?(search/move) ", out, in);

        if (str.equalsIgnoreCase("search")) {
          out.println("살펴본다");
          int no = Prompt.inputInt("번호? ", out, in);

          if (no == 1) {
            out.println("책장은 심리학 서적과 추리 소설, 퍼즐 관련 책들로 가득하다.");
            out.println("대부분 오래된 티가 나고 먼지가 쌓여있지만, 맨 위 칸의 책들은 유독 깔끔하다. 손을 뻗으면 딱 닿는 거리. ");
            out.println("책을 한 권을 꺼내서 찬찬히 살펴본다.");
            out.println("책은 사슬로 묶인 채 네 자리 영문 자물쇠로 잠겨있다.");
            out.println("책 표지에는 질문지가 붙어있다.");
            out.println(".");
            out.println(".");
            out.println("[질문]");
            out.println("World Wide Web의 약자는 무엇인가? ");

            String answer = Prompt.inputString("정답? ", out, in);
            if (answer.equalsIgnoreCase("Web")) {
              out.println("책 안을 잘라낸 곳에 손잡이가 있는 열쇠가 있었다.");
              out.println("[둥근 손잡이가 있는 열쇠]를 가방에 넣었다.");
              out.println("'/item/add' 명령어를 입력하여 아이템을 저장하세요.");
              break;

            } else if (!answer.equalsIgnoreCase("Web")) {
              out.println("자물쇠는 열리지 않았다.");
            }
          } else if (no == 2) {
            out.println("오래된 저택에 있을 법한 생김새를 가진 의자는 낡았지만 여전히 푹신하다.");
            out.println("다리부터 등받이, 바닥까지 살펴보았지만 눈에 띄는 점은 없다.");

          } else if (no == 3) {
            out.println("램프 자체의 생김새는 보통 램프와 별반 다를 점이 없다.");
            out.println("다만, 램프 커버가 어두운 색이라 옆으로는 빛이 나오지 않고, 램프의 바로 아래만 비춘다.");
            out.println("커버를 뒤집어 보니 종이에 열쇠가 붙어있다.");
            out.println("[네모 손잡이가 있는 열쇠] 를 가방에 넣었다.");
            out.println(" 'item/add' 명령어를 입력하여 아이템을 저장하세요.");
            break;
          } else {
            out.println("해당 번호의 대상이 없습니다.");
          }
        }
        if (str.equalsIgnoreCase("move")) {
          break;
        }
      } catch (Exception e) {
      }
    }
  }
}
