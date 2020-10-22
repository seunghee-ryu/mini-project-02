package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import com.eomcs.util.Prompt;

// Command 규칙에 따라 클래스를 정의한다.
public class BedroomCommand implements Command {

  @Override
  public void execute(PrintWriter out, BufferedReader in) {

    out.println("--------------------------------------------------------------------------------");
    out.println("                                침실");
    out.println("--------------------------------------------------------------------------------");
    out.println("벽과 천장, 모두 붉은색.");
    out.println("오랫동안 관리 없이 남겨진 벽지와 물건들.");
    out.println("아무리 봐도 살인마가 산다는 소문의 그 집이 분명하다.");
    out.println("숨겨진 장치가 있을까 벽과 바닥을 더듬어보지만,");
    out.println("손가락 끝에 묻어나는 회색빛 먼지 말고는 아무것도 없다.");
    out.println("침대 옆으로 보이는 문은 방문보다 약간 작다.");
    out.println("문틈으로 뭔가 반짝이는 빛이 보이지만, 별다른 특별한 점은 없다.");
    out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
    out.println("무엇을 할까?");
    out.println("-> 살펴본다(search) 1) 침대 2) 작은 문");
    out.println("-> 이동(move) - 복도");
    out.println("->      - 복도로 이동하려면 '/move/hallway'를 입력하세요");
    out.println("--------------------------------------------------------------------------------");


    try {
      String str = Prompt.inputString("무엇을 할까?(search/move) ", out, in);
      if (str.equalsIgnoreCase("search")) {


        out.println("살펴본다");
        String s = Integer.toString(Prompt.inputInt("번호? ", out, in));


        if (s.length() != 0) {

          while (true) {

            if (s.equals("1")) {
              out.println("괘종시계의 소리에 잠이 깨기 전까지 누워있던 침대.");
              out.println("이불에 깔린 먼지로 보아 누군가 마지막으로 사용한 지 시간이 꽤 지났음이 짐작된다.");
              out.println("이불을 들추자 침대 시트에 있는 검붉은 얼룩이 눈에 들어온다.");
              out.println("침대 아래에는 먼지가 가득하다.");
              out.println("무언가 있을까 손을 뻗어 더듬어 보니 차가운 무언가가 손끝에 닿는다.");
              out.println("먼지에 콜록거리며 사투 끝에, 자물쇠로 잠긴 작은 상자를 꺼낸다.");
              out.println("상자의 자물쇠는 6자리 알파벳 자물쇠다. 상자의 뚜껑에는 질문지가 붙어있다.");
              out.println(".");
              out.println(".");
              out.println("[질문]");
              out.println("네트워크 상에서 돌아가는 두 개의 프로그램 간 양방향 통신의 하나의 엔트 포인트는?");

              String answer = Prompt.inputString("정답? ", out, in);
              if (answer.equalsIgnoreCase("socket")) {
                out.println("자물쇠가 가벼운 찰칵 소리와 함께 열린다.");
                out.println("상자 안에는 일기처럼 보이는 글이 있는 종이가 있다.");
                out.println("[살인마의 기록 #1 - content : 벽돌을 입수했다.] 을 가방에 넣었다.");
                out.println("'/item/add' 명령어를 입력하여 아이템을 저장하세요.");
                break;

              } else if (!answer.equalsIgnoreCase("socket")) {
                out.print("자물쇠는 열리지 않았다.");
                break;

              } else if (answer.length() == 0) {
                break;
              }

            } else if (s.equals("2")) {
              out.println("작은 문");
              out.println("붉은 벽 중앙에 있는 흰 문은 장미꽃 사이에 있는 백합 한 송이 같다.");
              out.println("이런저런 생각을 하며 살펴본 문은 평범했다.");
              out.println("문고리에 걸려 있는 알파벳 자물쇠는 조금 덜 평범한, 두꺼운 무쇠 자물쇠이다.");
              break;

            } else {
              out.println("해당 번호의 대상이 없습니다.");
              break;
            }
          }

        } if (s.length() == 0) {
          return;
        }
      }
    } catch (Exception e) {
      System.out.println();
    }
  }
}
