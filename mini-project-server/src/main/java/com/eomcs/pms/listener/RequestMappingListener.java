package com.eomcs.pms.listener;

import java.util.List;
import java.util.Map;
import com.eomcs.context.ApplicationContextListener;
import com.eomcs.pms.domain.Item;
import com.eomcs.pms.domain.Player;
import com.eomcs.pms.handler.EntryCommand;
import com.eomcs.pms.handler.ItemAddCommand;
import com.eomcs.pms.handler.ItemDeleteCommand;
import com.eomcs.pms.handler.ItemDetailCommand;
import com.eomcs.pms.handler.ItemListCommand;
import com.eomcs.pms.handler.ItemUpdateCommand;
import com.eomcs.pms.handler.LibraryCommand;
import com.eomcs.pms.handler.PlayerAddCommand;
import com.eomcs.pms.handler.PlayerDeleteCommand;
import com.eomcs.pms.handler.PlayerDetailCommand;
import com.eomcs.pms.handler.PlayerListCommand;
import com.eomcs.pms.handler.PlayerUpdateCommand;
import com.eomcs.pms.handler.RullCommand;
import com.eomcs.pms.handler.StartCommand;

// 클라이언트 요청을 처리할 커맨드 객체를 준비한다.
public class RequestMappingListener implements ApplicationContextListener {

  @SuppressWarnings("unchecked")
  @Override
  public void contextInitialized(Map<String,Object> context) {
    // 옵저버가 작업한 결과를 맵에서 꺼낸다.
    //    List<Board> boardList = (List<Board>) context.get("boardList");
    //    List<Member> memberList = (List<Member>) context.get("memberList");
    //    List<Project> projectList = (List<Project>) context.get("projectList");
    //    List<Task> taskList = (List<Task>) context.get("taskList");

    List<Item> itemList = (List<Item>) context.get("itemList");
    List<Player> playerList = (List<Player>) context.get("playerList");


    // 아이템
    context.put("/item/add", new ItemAddCommand(itemList));
    context.put("/item/list", new ItemListCommand(itemList));
    context.put("/item/detail", new ItemDetailCommand(itemList));
    context.put("/item/update", new ItemUpdateCommand(itemList));
    context.put("/item/use", new ItemDeleteCommand(itemList)); // delete

    // 플레이어
    context.put("/player/add", new PlayerAddCommand(playerList));
    context.put("/player/list", new PlayerListCommand(playerList));
    context.put("/player/detail", new PlayerDetailCommand(playerList));
    context.put("/player/update", new PlayerUpdateCommand(playerList));
    context.put("/player/delete", new PlayerDeleteCommand(playerList));

    // 룰
    context.put("/rull", new RullCommand());

    // 시작
    context.put("/start", new StartCommand());
    context.put("/entry", new EntryCommand());

    // 2층 서재
    context.put("/move/library", new LibraryCommand());
  }

  @Override
  public void contextDestroyed(Map<String,Object> context) {
  }
}
