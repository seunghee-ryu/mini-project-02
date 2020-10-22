package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import com.eomcs.util.Prompt;

//Command 규칙에 따라 클래스를 정의한다.
public class LibraryCommand implements Command {

  @Override
  public void execute(PrintWriter out, BufferedReader in) {

    out.println("--------------------------------------------------------------------------------");
    out.println("서재에는 책이 가득 찬 책장이 있다. 그 옆에는 책 읽기에 적당해 보이는 푹신한 의자도 하나 있다.");
    out.print("의자 옆에는 먼지가 두껍게 쌓인 램프가 하나 있다.\n" +
        "책을 열어본 지 오래된 듯한 퀴퀴한 냄새가 방 안에 진동한다.\n");
    out.println("-> 살펴본다(search) 1) 책장 2)의자 3)램프");
    out.println("-> 이동(move) - 복도");
    out.println("-> 복도로 이동하려면 '/move/hallway'를 입력하세요");
    out.println("--------------------------------------------------------------------------------");

    while (true) {
      try {
        String str = Prompt.inputString("무엇을 할까?(search/move) ", out, in);

        if (str.equalsIgnoreCase("search")) {
          int no = Prompt.inputInt("번호? ", out, in);

          if (no == 1) {
            out.println("case 1) 책장은 심리학 서적과 추리 소설, 퍼즐 관련 책들로 가득하다.");
            out.println("대부분 오래된 티가 나고 먼지가 쌓여있지만, 맨 위 칸의 책들은 유독 깔끔하다. 손을 뻗으면 딱 닿는 거리. ");
            out.println("책을 한 권씩 꺼내서 찬찬히 살펴본다. 신문 스크랩북, 미궁 [선물] 풀이… ‘동기와 성격’이라는 책은 사슬로 묶인 채 네자리 숫자로 된 자물쇠로 잠겨있다.");
            out.println("책 표지에는 그림이 붙어있다.");
            out.println("╭─────────────────────────────────────────────────────────╮");
            out.print("\t\t\t문제 동쪽의 짐승\n" +
                "\t\t\t뇌   1683\n" +
                "\t\t\t폐   1525\n" +
                "\t\t\t심장 5709\n" +
                "\t\t\t간   6237\n" +
                "\t\t\t신장 8101\n" +
                "\t\t\t소장 1062\n" +
                "\t\t\t대장 524\n" +
                "\t\t\t방광 588\n");
            out.println("╰──────────────────────────────────────────────────────────╯");
            out.println("자주 들르던 상점에 가서 사다리와 비 하나를 가져다 주었다.\n" +
                "그러자 상점 주인은 아무렇지도 않게 돈으로 바꿔주었다.");

            String answer = Prompt.inputString("정답? ", out, in);
            if (answer.equalsIgnoreCase("3206")) {
              out.println("책 안을 잘라낸 곳에 손잡이가 있는 열쇠가 있었다.");
              out.println("둥근 손잡이가 있는 열쇠를 가방에 넣었다.");
              out.println("'/item/add' 명령어를 입력하여 아이템을 저장하세요.");
              break;
            } else if (!answer.equalsIgnoreCase("3206")) {
              out.print("자물쇠는 열리지 않았다.\n");
            }
          } else if (no == 2) {
            out.print("오래된 저택에 있을 법한 생김새를 가진 의자는 낡았지만, 여전히 푹신하다.\n"
                + "다리부터 등받이, 바닥까지 살펴보았지만, 눈에 띄는 점은 없다.\n");
            break;
          } else if (no == 3) {
            out.print("램프 자체의 생김새는 보통 램프와 별반 다를 점이 없다. 다만, 램프 커버가 어두운 색이라 옆으로는 빛이 나오지 않고, 램프의 바로 아래만 비춘다.\n"
                + "커버를 뒤집어 보니 일기처럼 보이는 글이 있는 종이가 붙어있다.\n");
            out.println("-----------------------");
            out.println("[살인마의 기록 #2 - content : 앨범을 만들어볼까?] 를 가방에 넣었다.");
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

//[필독] 룰 및 유의할 점
//-----------------------
//1. 각 방 사이를 이동하거나 탐색할 때는 버튼만 사용해주세요.
//2. 자물쇠의 비밀번호를 입력할 때는 자물쇠 앞에서 채팅으로 비밀번호를 입력해주세요.
//3. 방탈출 중 아이템은 자동으로 습득되며, 필요한 아이템이 있을 때 자동으로 사용됩니다.
//4. 인벤토리는 "가방을 보자"를 채팅으로 입력하면 열 수 있습니다. 습득한 아이템을 둘러보세요!
//5. 저희 방탈출을 재미있게 즐기셨을 때 다른 사람들에게 추천해주시는 것은 무한히 감사하지만, 스포일러 또는 문제 및 내용에 대한 공유는 참아주세요.
//6. 만약 예기치 못한 문제가 발생했다면, 채팅에 "다시 시작하자"를 입력하셔서 처음부터 시작하실 수 있습니다. 이때 모든 진행 상황이 삭제되니 유의해주세요!