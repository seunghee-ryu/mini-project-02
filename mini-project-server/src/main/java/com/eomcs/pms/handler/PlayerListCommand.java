package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import com.eomcs.pms.domain.Player;

public class PlayerListCommand implements Command {

  List<Player> playerList;

  public PlayerListCommand(List<Player> list) {
    this.playerList = list;
  }


  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    out.println("[플레이어 목록]");

    // 전체 목록을 조회할 때 `Iterator` 객체를 사용한다.
    // 만약 목록의 일부만 조회하면다면 인덱스를 직접 다루는 이전 방식을 사용해야 한다.
    Iterator<Player> iterator = playerList.iterator();

    while (iterator.hasNext()) {
      Player player = iterator.next();
      out.printf("번호: %s, 이름: %s, 플레이 기록: %s\n",
          player.getNo(),
          player.getName(),
          player.getStage()
          );
    }
    out.println("'/move/hallway' 명령어를 이용해 복도로 이동합니다.");
  }

}
