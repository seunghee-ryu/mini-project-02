package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.List;
import com.eomcs.pms.domain.Player;
import com.eomcs.util.Prompt;

public class PlayerAddCommand implements Command {

  List<Player> playerList;

  public PlayerAddCommand(List<Player> list) {
    this.playerList = list;
  }

  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    try {
      out.println("[플레이어 등록]");

      Player player = new Player();
      player.setNo(Prompt.inputInt("번호? ", out, in));
      player.setName(Prompt.inputString("이름? ", out, in));
      player.setStage(Prompt.inputString("플레이 기록? ", out, in));

      playerList.add(player);

      out.println("플레이어를 등록하였습니다.");

    } catch(Exception e) {
      out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
    }
  }
}
