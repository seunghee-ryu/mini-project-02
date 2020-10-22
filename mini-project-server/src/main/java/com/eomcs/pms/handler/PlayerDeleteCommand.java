package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.List;
import com.eomcs.pms.domain.Player;
import com.eomcs.util.Prompt;

public class PlayerDeleteCommand implements Command {

  List<Player> playerList;

  public PlayerDeleteCommand(List<Player> list) {
    this.playerList = list;
  }

  @Override
  public void execute(PrintWriter out, BufferedReader in) {

    //    try {
    //      out.println("[플레이어 삭제]");
    //
    //      while (true) {
    //        String name = Prompt.inputString("이름? ", out, in);
    //        Player player = findByName(name);
    //
    //        if (findByName(name) == null) {
    //          out.println("해당 이름의 플레이어가 없습니다.");
    //          return;
    //        } else if (findByName(name) != null) {
    //          out.println("해당 이름의 플레이어가 존재합니다.");
    //
    //          String response = Prompt.inputString("정말 삭제하시겠습니까?(y/N) ", out, in);
    //          if (!response.equalsIgnoreCase("y")) {
    //            out.println("플레이어 삭제를 취소하였습니다.");
    //            return;
    //          }
    //          playerList.remove(name);
    //          out.println("플레이어를 삭제하였습니다.");
    //        }
    //        return;
    //      }
    //    } catch (Exception e) {
    //      out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
    //    }
    //  }


    try {
      out.println("[플레이어 삭제]");
      int no = Prompt.inputInt("번호? ", out, in);
      int index = indexOf(no);

      if (index == -1) {
        out.println("해당 번호의 플레이어가 없습니다.");
        return;
      }

      String response = Prompt.inputString("정말 삭제하시겠습니까?(y/N) ", out, in);
      if (!response.equalsIgnoreCase("y")) {
        out.println("플레이어 삭제를 취소하였습니다.");
        return;
      }

      playerList.remove(index);
      out.println("플레이어를 삭제하였습니다.");

    } catch (Exception e) {
      out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
    }
  }


  private int indexOf(int no) {
    for (int i = 0; i < playerList.size(); i++) {
      Player player = playerList.get(i);
      if (player.getNo() == no) {
        return i;
      }
    }
    return -1;
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

