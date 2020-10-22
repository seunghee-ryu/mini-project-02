package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.List;
import com.eomcs.pms.domain.Player;
import com.eomcs.util.Prompt;

public class PlayerDetailCommand implements Command {

  List<Player> playerList;

  public PlayerDetailCommand(List<Player> list) {
    this.playerList = list;
  }

  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    try {
      out.println("[플레이어 상세보기]");

      while (true) {
        String name = Prompt.inputString("이름? ", out, in);
        Player player = findByName(name);

        if (findByName(name) == null) {
          out.println("해당 이름의 플레이어가 없습니다.");
          return;
        } else if (findByName(name) != null) {
          out.println("해당 이름의 플레이어가 존재합니다.");
          out.printf("번호: %s\n", player.getNo());
          out.printf("이름: %s\n", player.getName());
          out.printf("플레이 기록: %s\n", player.getStage());
          out.printf("등록일: %s\n", player.getRegisteredDate());
          return;
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
