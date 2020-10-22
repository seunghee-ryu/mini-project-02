package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.List;
import com.eomcs.pms.domain.Player;
import com.eomcs.util.Prompt;

public class PlayerUpdateCommand implements Command {

  List<Player> playerList;

  public PlayerUpdateCommand(List<Player> list) {
    this.playerList = list;
  }

  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    try {
      out.println("[플레이어 기록 변경]");

      while (true) {
        String name = Prompt.inputString("이름? ", out, in);
        Player player = findByName(name);

        if (findByName(name) == null) {
          out.println("해당 이름의 플레이어가 없습니다.");
          return;
        } else if (findByName(name) != null) {
          out.println("해당 이름의 플레이어가 존재합니다.");
          out.printf("플레이어 이름: %s\n플레이어 번호: %s\n", player.getName(), player.getNo());
          out.println("해당 이름의 플레이어 정보를 변경할 수 있습니다.");

          int no = Prompt.inputInt(
              String.format("번호(%s)? ", player.getNo()), out, in);
          String stage = Prompt.inputString(
              String.format("플레이 기록(%s)? ", player.getStage()), out, in);

          String response = Prompt.inputString("정말 변경하시겠습니까?(y/N) ", out, in);
          if (!response.equalsIgnoreCase("y")) {
            out.println("게시글 변경을 취소하였습니다.");
            return;
          }

          player.setNo(no);
          player.setStage(stage);

          out.println("게시글을 변경하였습니다.");
          out.println("'/move/hallway' 명령어를 이용해 복도로 이동합니다.");
        }
        return;
      }
    } catch (Exception e) {
      out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
    }
  }

  public Player findByName(String name) {
    for (int i = 0; i < playerList.size(); i++) {
      Player player = playerList.get(i);
      if (player.getName().equals(name)) {
        return player;
      }
    }
    return null;
  }

}
